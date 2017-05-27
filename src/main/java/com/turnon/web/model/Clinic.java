package com.turnon.web.model;

import java.util.Arrays;

public class Clinic {
    // String clinicName;
    private Address address;
    private TimeSlot[] timeSlots;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public TimeSlot[] getTimeSlots() {
        return timeSlots;
    }

    public void setTimeSlots(TimeSlot[] timeSlots) {
        this.timeSlots = timeSlots;
    }

    @Override
    public String toString() {
        return "Clinic [address=" + address + ", timeSlots=" + Arrays.toString(timeSlots) + "]";
    }
    

}
