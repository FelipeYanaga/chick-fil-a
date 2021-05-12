//package org.acme.resteasyjackson.db;
//
//import org.acme.resteasyjackson.Item;
//
//import javax.inject.Inject;
//import javax.persistence.EntityManager;
//import javax.transaction.Transactional;
//
//public class ItemService {
//    @Inject
//    EntityManager em;
//
//    @Transactional
//    public void createItem(String itemDescription){
//        Item item = new Item();
//        em.persist(item);
//    }
//}
