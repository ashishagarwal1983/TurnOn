package com.turnon.core.model;

import java.io.Serializable;


public class UserDetails implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private String name;
    private String mobile;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}