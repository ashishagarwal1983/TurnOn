package com.turnon.web.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.turnon.core.common.enums.Gender;

@JsonInclude(JsonInclude.Include.NON_NULL)
//TODO FIXME @JsonPropertyOrder({"userId", "firstName", "lastName", "age", "address", "city", "pincode"})
public class UserProfile {

    private long userId;
    private String name;
    private int age;
    private String mobileNumber;
    private Gender gender;
   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
    
    
    
    
}