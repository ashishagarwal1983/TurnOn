package com.turnon.web.model;

import java.io.Serializable;
import java.util.Date;


public class Appointment implements Serializable {

	private static final long serialVersionUID = 1L;
	// This date object will not contain any time value. It will only reprsent a day
	private Date date;
	private UserProfile doctorProfile;
	private UserProfile patientProfile;
	// This is a tr
	private HourMinute appointmentTime;
	private Address address;

}
