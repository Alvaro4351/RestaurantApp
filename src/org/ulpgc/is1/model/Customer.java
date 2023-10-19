package org.ulpgc.is1.model;

public class Customer {
    public ArrayList<Address> address;
    public String name;
    public String surname;

    public Customer(ArrayList<Address> address, String name, String surname) {
        this.address = address;
        this.name = name;
        this.surname = surname;
    }


    public ArrayList<Address> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<Address> address) {
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

    void addAddress(String street, int number, int postalCode, String city){
        Address a = new Address(street, number, postalCode, city);
        address.add( a );


    }

}
