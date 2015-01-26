package introsde.rest.resources;

import introsde.storage.ws.Goal;
import introsde.storage.ws.MeasureDefinition;
import introsde.storage.ws.People;
import introsde.storage.ws.Person;

import java.io.IOException;

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

public class GoalResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	private People peopleStorageService;
	
	Long id;
	
	String measureType;
	
	
	public GoalResource(UriInfo uriInfo, Request request, Long id,
			String measureType, People peopleStorageService) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
		this.peopleStorageService = peopleStorageService;
	}


	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Goal newGoal(@QueryParam("value") String value, @QueryParam("deadline") Long deadline) throws IOException {
		System.out.println("Creating new goal...");
		
		Goal newGoal = peopleStorageService.saveGoal(id, measureType, value, deadline);
		
		return newGoal;
		
	}
	
	
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Goal getGoal() {
		Goal goal = peopleStorageService.readPersonGoalForMeasureType(id, measureType);
		if (goal == null)
			throw new RuntimeException("Get: goal with " + measureType + " not found");
		return goal;
	}
}
