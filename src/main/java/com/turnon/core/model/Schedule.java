package com.turnon.core.model;

import java.io.Serializable;
import java.util.Date;

public class Schedule implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Address address;
    private String time;
    private String day;
    private Date date;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
