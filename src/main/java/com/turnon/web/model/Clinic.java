package com.turnon.web.model;

import java.util.Arrays;
import java.util.List;

import com.couchbase.client.java.repository.annotation.Field;

public class Clinic {
	@Field
    private Address address;
	@Field
    private List<TimeSlot> timeSlots;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

	public List<TimeSlot> getTimeSlots() {
		return timeSlots;
	}

	public void setTimeSlots(List<TimeSlot> timeSlots) {
		this.timeSlots = timeSlots;
	}

    

}
