package com.turnon.web.model;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.turnon.core.common.enums.Gender;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(expiry=0)
//@JsonPropertyOrder({"userId", "firstName", "lastName", "age", "address", "city", "pincode"})
public class UserProfile {

	@Id
    private long userId;
	@Field
    private String name;
	@Field
	private int age;
	@Field
    private String mobileNumber;
	@Field
    private Gender gender;
   
    
    public UserProfile() {
		super();
	}

    
	public UserProfile(long userId, String name, int age, String mobileNumber, Gender gender) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}


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