package com.example.fooddelivery.model;


public class Address {
    private String street;
    private Integer streetNumber;
    private String city;
    private String postalCode;

    public Address() {}
    public Address(String street, Integer streetNumber, String city, String postalCode) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.postalCode =   postalCode;
    }

    public String getStreet() {
        return street;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }
    public String getCity() {
        return city;
    }
    public String getPostalCode() {
        return postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }
}