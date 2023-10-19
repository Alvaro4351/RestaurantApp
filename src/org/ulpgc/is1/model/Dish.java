package org.ulpgc.is1.model;

public class Dish {
    private String name;
    private String description;
    private int price;

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

    public Dish(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price
    }
}
