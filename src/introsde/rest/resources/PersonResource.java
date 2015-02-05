package introsde.rest.resources;

import introsde.storage.ws.People;
import introsde.storage.ws.Person;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Stateless
@LocalBean
public class PersonResource {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	private People peopleStorageService;
	
	Long id;

	public PersonResource(UriInfo uriInfo, Request request, Long id, People peopleStorageService) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
		this.peopleStorageService = peopleStorageService;
		
	}

	
	// Application integration
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Person getPerson() {
		Person person = peopleStorageService.readPerson(id);
		if (person == null)
			throw new RuntimeException("Get: Person with " + id + " not found");
		return person;
	}

	// for the browser
	@GET
	@Produces(MediaType.TEXT_XML)
	public Person getPersonHTML() {
		Person person = peopleStorageService.readPerson(id);
		if (person == null)
			throw new RuntimeException("Get: Person with " + id + " not found");
		System.out.println("Returning person... " + person.getIdPerson());
		return person;
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response putPerson(Person person) {
		System.out.println("--> Updating Person... " +this.id);
		System.out.println("--> "+person.toString());
		peopleStorageService.updatePerson(person);
		
		Response res;
		
		Person existing = peopleStorageService.readPerson(id);
		
		if (existing == null) {
			res = Response.noContent().build();
		} else {
			res = Response.created(uriInfo.getAbsolutePath()).build();
			person.setIdPerson(this.id);
			peopleStorageService.updatePerson(person);
		}

		return res;

		
	}

	@DELETE
	public void deletePerson() {
		Person c = peopleStorageService.readPerson(id);
		if (c == null)
			throw new RuntimeException("Delete: Person with " + id
					+ " not found");

		peopleStorageService.deletePerson(id);
	}
	
	
	@Path("{measureType}")
	public MeasureCollectionResource getLifeStyleOfMeasure(
			@PathParam("measureType") String measure) {
		try {
			return new MeasureCollectionResource(uriInfo, request, id, peopleStorageService, measure);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	@Path("goals")
	public GoalCollectionResource getGoalOfMeasure() {
		try {
			return new GoalCollectionResource(uriInfo, request, id, peopleStorageService);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	@Path("lifestatus")
	public CurrentMeasureCollectionResource getCurrentLifeStatus() {
		try {
			return new CurrentMeasureCollectionResource(uriInfo, request, id, peopleStorageService);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}