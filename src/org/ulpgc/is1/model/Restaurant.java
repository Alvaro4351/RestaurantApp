package org.ulpgc.is1.model;

import java.util.ArrayList;

//Generamos la clase
public class Restaurant {
    private String name;
    private Phone phone;
    private ArrayList<Menu> menu;
    private ArratList<Order> orden;

    //Creamos el constructor
    public Restaurant(String name, Phone phone, ArrayList<Menu> menu, ArratList<Order> orden) {
        this.name = name;
        this.phone = phone;
        this.menu = menu;
        this.orden = orden;
    }

    //Añadimos el método addMenu
    private void addMenu(String name, MenuType tipo, ArrayList<Dish> plato, ArrayList<OrderItem> items){
        menu = new ArrayList<Menu>(name, tipo, plato, items)
    }

    //Funciones get() y set()

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public ArrayList<Menu> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Menu> menu) {
        this.menu = menu;
    }

    public ArratList<Order> getOrden() {
        return orden;
    }

    public void setOrden(ArratList<Order> orden) {
        this.orden = orden;
    }
}
