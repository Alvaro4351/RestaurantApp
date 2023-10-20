package org.ulpgc.is1.model;
//Generación de la clase
public class Dish {
    private String name;
    priva
    te String description;
    private int price;

    //Generación del constructor
    public Dish(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    //Funciones get() y set()
    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private int getPrice() {
        return price;
    }

    private void setPrice(int price) {
        this.price = price;
    }
}