package org.ulpgc.is1.model;

public class OrderItem {
    private int quantity;

    private int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderItem(int quantity){
        this.quantity = quantity;
    }
}
