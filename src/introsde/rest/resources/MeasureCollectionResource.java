package introsde.rest.resources;

import introsde.business.ws.BusinessLogicLSCoach;
import introsde.business.ws.BusinessLogicLSCoachService;
import introsde.storage.ws.HealthMeasureHistory;
import introsde.storage.ws.Measure;
import introsde.storage.ws.MeasureDefinition;
import introsde.storage.ws.People;
import introsde.storage.ws.PeopleStorageService;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.net.ssl.SSLEngineResult.Status;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.StatusType;

@Stateless
// will work only inside a Java EE application
@LocalBean
// will work only inside a Java EE application
public class MeasureCollectionResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	Long idPerson;
	
	private String measureDef;
	
	People peopleStorageService;

	public MeasureCollectionResource(UriInfo uriInfo, Request request, Long idP, People peopleStorageService, String measure) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.idPerson = idP;
		this.peopleStorageService = peopleStorageService;	
		this.measureDef = measure;	
		
	}


//	@POST
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public Response newMeasure(Measure measure) throws IOException {
//		System.out.println("Adding new measure for person " + idPerson);
//
//		try {
//			// set the person related of the measure
//			Person person = Person.getPersonById(idPerson);
//			measure.setPerson(person);
//
//			MeasureType mType = MeasureType.getType(this.measure);
//			measure.setType(mType);
//
//			if (this.measure == null) {
//				System.out.println("Measure type '" + this.measure
//						+ "' not exist");
//				return null;
//			}
//
//			HealthProfile.sinchronizeHealthProfile(person, measure);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return Response.status(201).entity(measure).build();
//	}

	@Path("/{measureId}")
	public MeasureResource getMeasure(@PathParam("measureId") int measureId) {
		return new MeasureResource(uriInfo, request, idPerson, measureId, measureDef, peopleStorageService);
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<HealthMeasureHistory> getLocalMeasureFromTo(@QueryParam("before") Long from,
			@QueryParam("after") Long to) {
		List<HealthMeasureHistory> history = null;
		try {
			if (from == null || to == null) {
				System.out.println("Getting list of measures...");
				history = peopleStorageService.readPersonLocalHistory(idPerson, measureDef);
			} else {

				history = peopleStorageService.readPersonMeasureByDates(idPerson, measureDef, from, to);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return history;

	}

	
	
	@GET
	@Path("remote")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<HealthMeasureHistory> getRemoteMeasureFromTo(@QueryParam("before") Long from,
			@QueryParam("after") Long to, @HeaderParam("Authorization") String token) {
		
		BusinessLogicLSCoachService businessServ = new BusinessLogicLSCoachService();
		BusinessLogicLSCoach businessService = businessServ
				.getBusinessLogicLSCoachImplPort();
		boolean operation = false;
		token = token.replace("Bearer ", "");
		if(measureDef.equals("weight")){
			operation = businessService.syncWeightToDB(token);
		}else if(measureDef.equals("activity")){//if activity
			operation = businessService.syncActivitiesToDB(token);
		}
		
		if(!operation){
			return null;
		}
		
		List<HealthMeasureHistory> history = null;
		try {
			if (from == null || to == null) {
				System.out.println("Getting list of measures...");
				history = peopleStorageService.readPersonLocalHistory(idPerson, measureDef);
			} else {

				history = peopleStorageService.readPersonMeasureByDates(idPerson, measureDef, from, to);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return history;

	}

	
}
