package com.turnon.web.model;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;

import org.joda.time.Hours;
import org.joda.time.Minutes;

import com.google.gson.Gson;
import com.turnon.core.common.enums.Gender;

public class TestMain {

	public static void main(String[] s){
        Gson gson = new Gson();
        Session session1 = new Session();
        session1.setStartHour(Hours.hours(10));
        session1.setStartMinute(Minutes.minutes(15));
        session1.setEndHour(Hours.hours(1));
        session1.setEndMinute(Minutes.minutes(0));
        System.out.println(gson.toJson(session1));
        
        TimeSlot timeSlot1 = new TimeSlot();
        timeSlot1.setDay(DayOfWeek.MONDAY);
        timeSlot1.setSessions(Arrays.asList(session1));
        System.out.println(gson.toJson(timeSlot1));
        
        Address address = new Address();
        address.setAddressLine1(("SomeDummyAddressVAlue"));
      
        Clinic clinic = new Clinic();
        clinic.setAddress(address);
        clinic.setTimeSlots(Arrays.asList(timeSlot1));
        
        
        List<Clinic> clinics = Arrays.asList(clinic);
        List<String> qualifications = Arrays.asList("MBBS","MCH");
        DoctorInfo doctorInfo = new DoctorInfo();
        doctorInfo.setRegistrationNo("registrationNoValue");
        doctorInfo.setQualifications(qualifications);
        doctorInfo.setClinics(clinics);
        doctorInfo.setUserId(111111111111111L);
        doctorInfo.setName("firstNameValue");
        doctorInfo.setAge(10);
        doctorInfo.setGender(Gender.MALE);
        System.out.println(gson.toJson(doctorInfo));
        
    }
}
