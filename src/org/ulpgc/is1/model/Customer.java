package org.ulpgc.is1.model;
//Generación de la clase
public class Customer {
    private Address address;
    private String name;
    private String surname;
    private ArrayList<Order> orden;

    //Generamos el método addAddress para agregar la dirección del cliente
    private void addAddress(String street, int number, int postalCode, String city){
        address = new Address(street, number, postalCode, city);
    }
    //Generación del constructor
    public Customer(Address address, String name, String surname, ArrayList<Order> orden) {
        this.address = address;
        this.name = name;
        this.surname = surname;
        this.orden = orden;
    }
    //Funciones get() and set()
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Order> getOrden() {
        return orden;
    }

    public void setOrden(ArrayList<Order> orden) {
        this.orden = orden;
    }
}