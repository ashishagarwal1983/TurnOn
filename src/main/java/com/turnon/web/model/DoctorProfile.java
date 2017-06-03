package com.turnon.web.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;

@Document
public class DoctorProfile extends UserProfile implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Field
	private String registrationNo;
	@Field
	private List<String> qualifications;
	@Field
	private List<String> specialities;
	@Field
	private List<Clinic> clinics;
	@Field
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
