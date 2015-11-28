package com.nishadh.testcxf.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by nishadh on 11/28/15.
 */
@Path("rest")
public class TestRestServiceImpl implements TestRestService  {

    @GET
    @Path("/sayHello/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(@PathParam("name") final String name) {
        return "Hello " + name + " !!";
    }
}
