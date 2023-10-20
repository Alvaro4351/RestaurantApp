package org.ulpgc.is1.model;

import java.util.ArrayList;

//Generación de la clase
public class Menu {
    private String name;
    private MenuType tipo;
    private ArrayList<Dish>plato;

    //Añadimos el método addDish
    private void addDish(String name, String description, int price){
        plato = new ArrayList<Dish>(name, description, price)
    }
    //Generamos el constructor
    public Menu(String name, MenuType tipo, ArrayList<Dish> plato, ArrayList<OrderItem> items) {
        this.name = name;
        this.tipo = tipo;
        this.plato = plato;
    }
    //Funciones get() y set()

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getTipo() {
        return tipo;
    }

    public void setTipo(MenuType tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Dish> getPlato() {
        return plato;
    }

    public void setPlato(ArrayList<Dish> plato) {
        this.plato = plato;
    }
}
