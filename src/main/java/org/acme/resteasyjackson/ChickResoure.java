package org.acme.resteasyjackson;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/chick")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ChickResoure {


    @GET
    @Path("/biscuit")
    public String[] get() throws IOException {
        Scraper scraper = new Scraper();
        return scraper.test("biscuit");
    }

    @GET
    @Path("/sandwich")
    public String[] getSandwich() throws IOException {
        Scraper scraper = new Scraper();
        return scraper.test("sandwich");
    }

    public ChickResoure(){

    }
}
