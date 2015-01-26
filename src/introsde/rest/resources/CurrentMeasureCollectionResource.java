package introsde.rest.resources;

import introsde.storage.ws.People;
import introsde.storage.ws.Person;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

@Stateless
@LocalBean
public class CurrentMeasureCollectionResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	private People peopleStorageService;

	Long id;

	public CurrentMeasureCollectionResource(UriInfo uriInfo, Request request,
			Long id, People peopleStorageService) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
		this.peopleStorageService = peopleStorageService;
	}

	
//	@GET
//	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
//	public Person getPerson() {
//		peopleStorageService.
//		if (person == null)
//			throw new RuntimeException("Get: Person with " + id + " not found");
//		return person;
//	}
}
