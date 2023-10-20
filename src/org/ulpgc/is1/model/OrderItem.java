package org.ulpgc.is1.model;
//Generamos la clase
public class OrderItem {
    private int quantity;
    private Dish plato;

    //Generamos el constructor
    public OrderItem(int quantity, Dish plato) {
        this.quantity = quantity;
        this.plato = plato;
    }

    //Funciones get() y set()

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Dish getPlato() {
        return plato;
    }

    public void setPlato(Dish plato) {
        this.plato = plato;
    }
}