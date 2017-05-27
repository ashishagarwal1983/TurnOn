package com.turnon.web.model;

import java.util.Arrays;
import java.util.List;

public class Clinic {
    // String clinicName;
    private Address address;
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
