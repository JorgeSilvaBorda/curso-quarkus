package com.cors;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
}