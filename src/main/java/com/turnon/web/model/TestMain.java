package com.turnon.web.model;

import java.time.DayOfWeek;

import org.joda.time.Hours;
import org.joda.time.Minutes;

import com.google.gson.Gson;

public class TestMain {

    public static void main(String[] s){
        Gson gson = new Gson();
        Session session1 = new Session();
        session1.setStartHour(Hours.hours(10));
        session1.setStartMinute(Minutes.minutes(15));
        session1.setEndHour(Hours.hours(1));
        session1.setEndMinute(Minutes.minutes(0));
        System.out.println(gson.toJson(session1));
        
        Session[] sessions = new Session[1];
        sessions[0] = session1;
        TimeSlot timeSlot1 = new TimeSlot();
        timeSlot1.setDay(DayOfWeek.MONDAY);
        timeSlot1.setSessions(sessions);
        System.out.println(gson.toJson(timeSlot1));
        
        Address address = new Address();
        address.setAddressLine1(("SomeDummyAddressVAlue"));
      
        TimeSlot[] timeSlots = new TimeSlot[1];
        timeSlots[0] = timeSlot1;
        Clinic clinic = new Clinic();
        clinic.setAddress(address);
        clinic.setTimeSlots(timeSlots);
        
        
        Clinic[] clinics = new Clinic[1];
        clinics[0] = clinic;
        String[] qualifications = {"MBBS","MCH"};
        DoctorInfo doctorInfo = new DoctorInfo();
        doctorInfo.setRegistrationNo("registrationNoValue");
        doctorInfo.setQualifications(qualifications);
        doctorInfo.setClinics(clinics);
        doctorInfo.setUserId(111111111111111L);
        doctorInfo.setFirstName("firstNameValue");
        doctorInfo.setLastName("lastNameValue");
        doctorInfo.setAge(10);
        
        System.out.println(gson.toJson(doctorInfo));
        
    }   
}
