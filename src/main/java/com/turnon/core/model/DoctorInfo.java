package com.turnon.core.model;

import java.io.Serializable;

public class DoctorInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String registrationNo;
    private String[] qualifications;
    private String[] specialities;

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String[] getQualifications() {
        return qualifications;
    }

    public void setQualifications(String[] qualifications) {
        this.qualifications = qualifications;
    }

    public String[] getSpecialities() {
        return specialities;
    }

    public void setSpecialities(String[] specialities) {
        this.specialities = specialities;
    }

}
