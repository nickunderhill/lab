package com.podopryhora.lab.lecture6.taskmain.models;

import java.util.StringJoiner;

public class Address {
    private String zip;
    private String city;
    private String street;
    private String houseNumber;
    private String aptNumber;

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
                .add("zip='" + zip + "'")
                .add("city='" + city + "'")
                .add("street='" + street + "'")
                .add("houseNumber='" + houseNumber + "'")
                .add("aptNumber='" + aptNumber + "'")
                .toString();
    }
}
