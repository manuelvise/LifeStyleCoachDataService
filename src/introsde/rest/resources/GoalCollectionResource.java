package introsde.rest.resources;

import java.io.IOException;
import java.util.List;

import introsde.storage.ws.Goal;
import introsde.storage.ws.People;
import introsde.storage.ws.Person;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

@Stateless
@LocalBean//Will map the resource to the URL /ehealth/v2
public class GoalCollectionResource {
	
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	private People peopleStorageService;
	
	Long id;


	public GoalCollectionResource(UriInfo uriInfo, Request request, Long id, People peopleStorageService) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
		this.peopleStorageService = peopleStorageService;
		
	}

	
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Goal> getGoalsOfPerson() {
		Person person = peopleStorageService.readPerson(id);
		if (person == null)
			throw new RuntimeException("Get: Person with " + id + " not found");
		
		List<Goal> goals = peopleStorageService.readPersonGoals(id);
		
		return goals;
	}
	
//	@POST
//	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//	@Consumes(MediaType.APPLICATION_XML)
//	public Goal newGoal(Goal goal) throws IOException {
//		System.out.println("Creating new goal...");
//		
//		Goal newGoal = peopleStorageService.saveGoal(id, goal.getMeasureDefinition().getMeasureName(), goal.getValue(), goal.getDeadline());
//		
//		return newGoal;
//		
//	}
	
	
	@Path("{measureType}")
	public GoalResource getGoal(@PathParam("measureType") String measureType){
		return new GoalResource(uriInfo, request, id, measureType, peopleStorageService);
	}
	
}
