package org.ulpgc.is1.model;
//Generamos la clase
public class Order {
    private static int NEXT_ID = 0;
    private final int id;
    private ArrayList<OrderItem> items;
    private Customer custom;
    private Restaurant restaurante;
    //Mencionamos OrderItem en Order
    void addItem(int quantity, Dish plato){
        Item a = new Item(quantity, plato)
    }
    //Método price()

    // Generamos el constructor
    public Order(int id, ArrayList<OrderItem> items, Customer custom, Restaurant restaurante) {
        this.id = id;
        this.items = items;
        this.custom = custom;
        this.restaurante = restaurante;
    }
}
