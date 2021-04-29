package org.acme.resteasyjackson;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

@Path("/unc")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UncResource {

        private final List<Dish> dishes;

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public Dish get() throws IOException {
            Scraper scraper = new Scraper();
            return scraper.unc().get(0);
        }

        @GET
        @Path("/list")
        @Produces(MediaType.APPLICATION_JSON)
        public List<Dish> getList() throws IOException{
            return dishes;
        }

        public UncResource() throws IOException{
            Scraper scraper = new Scraper();
            dishes = scraper.getDishes();
        }

}
