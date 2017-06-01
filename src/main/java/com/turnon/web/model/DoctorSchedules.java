package com.turnon.web.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// This pojo needs to be automatically populated at the time of doctor registration for x(which is configurable) no of days and 
//then after this pojo needs to be updated on each midnight to replace previous day with the ccurrent day
public class DoctorSchedules {
	// A hashmap  which will contain an day by day schedule of the doctor 
	private Map<Date,DoctorScheduleForADay> hashMap= new HashMap<Date,DoctorScheduleForADay>();

}
