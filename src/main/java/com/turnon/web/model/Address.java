package com.turnon.web.model;

public class Address {
    //TODO FIXME add required fields here
    String addressLine1;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @Override
    public String toString() {
        return "Address [addressLine1=" + addressLine1 + "]";
    }

    
}
