//package org.acme.resteasyjackson;
//
//import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
//
//import javax.inject.Inject;
//import javax.persistence.EntityManager;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import java.util.stream.Stream;
//
//@Path("/items")
//@Produces("application/json")
//@Consumes("application/json")
//public class ItemResource {
//
//    @Inject
//    EntityManager entityManager;
//
//    @GET
//    public Item[] getItem(){
//        return entityManager.createNamedQuery("Items.findAll",Item.class).getResultList()
//                .toArray(new Item[0]);
//    }
//
//
//}
