package org.ulpgc.is1.model;

import java.util.ArrayList;

//Generamos la clase
public class Order {
    private static int NEXT_ID = 0;
    private final int id;
    private ArrayList<OrderItem> items;
    private Customer custom;
    private Restaurant restaurante;

    //Añadimos OrderItem en Order
    private void addOrderItem(int quantity, Dish plato){

        items = new ArrayList<OrderItem>(quantity, plato)
    }
    //Método price()
´
    // Generamos el constructor
    public Order(int id, ArrayList<OrderItem> items, Customer custom, Restaurant restaurante) {
        this.id = id;
        this.items = items;
        this.custom = custom;
        this.restaurante = restaurante;

    }
    //Funciones get() y set()
    public static int getNextId() {
        return NEXT_ID;
    }

    public static void setNextId(int nextId) {
        NEXT_ID = nextId;
    }

    public int getId() {
        return id;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<OrderItem> items) {
        this.items = items;
    }

    public Customer getCustom() {
        return custom;
    }

    public void setCustom(Customer custom) {
        this.custom = custom;
    }

    public Restaurant getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurant restaurante) {
        this.restaurante = restaurante;
    }
}
