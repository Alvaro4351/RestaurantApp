package org.ulpgc.is1.model;
//Generación de la clase
public class Customer {
    private Address address;
    private String name;
    private String surname;

    //Generamos el método addAddress para agregar la dirección del cliente
    void addAddress(String street, int number, int postalCode, String city){
        Address a = new Address(street, number, postalCode, city);
        address.add(a);
    }
    //Generación del constructor
    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
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
}
