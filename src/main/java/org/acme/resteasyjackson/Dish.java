package org.acme.resteasyjackson;

public class Dish {
    public final String name;
    public final String ingredients;

    public Dish(String name, String ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }

    public static Dish of(String name, String ingredients){
        return new Dish(name, ingredients);
    }

}
