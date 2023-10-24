package org.ulpgc.is1.model;
//Generación de la clase
public class Phone {
    private String name;

    //Generación del constructor
    public Phone(String name) {
        this.name = name;
    }
    //Generación del método isValid()
    private boolean isValid() {
        return name != null && !name.isEmpty();
    }
    //Funciones get() and set()
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
