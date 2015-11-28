package com.nishadh.testcxf.rest;

/**
 * Created by nishadh on 11/28/15.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface TestRestService {
    public String sayHello(final String name);
}
