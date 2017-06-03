package com.turnon.core.services;

import java.util.List;

import com.turnon.web.model.DoctorProfile;
import com.turnon.web.model.UserProfile;

public interface DoctorService {

	void registerDoctor(UserProfile userProfile);
	List<UserProfile> getDoctorByMobile(String mobile);
}
