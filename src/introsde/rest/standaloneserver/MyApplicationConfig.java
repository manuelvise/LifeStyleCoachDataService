package introsde.rest.standaloneserver;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("sde/resources")
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("introsde.rest"); // Jersey will load all the resources under this package
    }
}