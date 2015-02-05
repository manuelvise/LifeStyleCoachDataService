package introsde.rest.resources;

import introsde.storage.ws.HealthMeasureHistory;
import introsde.storage.ws.MeasureDefinition;
import introsde.storage.ws.People;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Stateless // only used if the the application is deployed in a Java EE container
@LocalBean // only used if the the application is deployed in a Java EE container
public class MeasureResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	Long idPerson;

	int idHealthMeasureHistory;
	
	String measureDef;
	
	People peopleStorageService;
	

	public MeasureResource(UriInfo uriInfo, Request request, Long idP, int idM, String measureDef, People peopleStorageService) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.idPerson = idP;
        this.idHealthMeasureHistory = idM;
        this.measureDef = measureDef;
        
        this.peopleStorageService = peopleStorageService;
    }

    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
    public Response getHealthMeasureHistory() {
    	
    	HealthMeasureHistory healthMeasure = peopleStorageService.readPersonMeasurement(idPerson, measureDef, idHealthMeasureHistory);
    	
    	if (healthMeasure == null){
        	return Response.status(404).entity(healthMeasure).build();
        }
        return Response.status(200).entity(healthMeasure).build();

    }
    
}
