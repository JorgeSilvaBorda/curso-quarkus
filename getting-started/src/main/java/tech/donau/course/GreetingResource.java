package tech.donau.course;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import tech.donau.course.service.GreetingService;

@Path("/hello")
public class GreetingResource {
    
    @Inject
    GreetingService greetingService;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hola() {
        return greetingService.sayHello();
    }   
    
}
