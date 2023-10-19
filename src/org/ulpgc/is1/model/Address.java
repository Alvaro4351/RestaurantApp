package org.ulpgc.is1.model;

public class Address {
    private String street;
    private int number;
    private int postalCode;
    private String city;

    private String getStreet() {
        return street;
    }

    private void setStreet(String street) {
        this.street = street;
    }

    private int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    private int getPostalCode() {
        return postalCode;
    }

    private void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    private String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    public Address(String street, int number, int postalCode, String city){
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }
}