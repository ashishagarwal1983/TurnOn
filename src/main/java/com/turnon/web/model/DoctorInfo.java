package com.turnon.web.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class DoctorInfo extends UserProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	private String registrationNo;
	// TODO FIXME chnage ARRAY
	private List<String> qualifications;
	private List<String> specialities;
	private List<Clinic> clinics;
	private String treatmentTime;
	

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public List<String> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	}

	public List<String> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(List<String> specialities) {
		this.specialities = specialities;
	}

	public List<Clinic> getClinics() {
		return clinics;
	}

	public void setClinics(List<Clinic> clinics) {
		this.clinics = clinics;
	}

	public String getTreatmentTime() {
		return treatmentTime;
	}

	public void setTreatmentTime(String treatmentTime) {
		this.treatmentTime = treatmentTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
