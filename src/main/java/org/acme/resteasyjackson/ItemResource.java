package org.acme.resteasyjackson;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.stream.Stream;

@Path("/items")
public class ItemResource {

    @GET
    public Stream<PanacheEntityBase> items(){
        return Item.streamAll();
    }

}
