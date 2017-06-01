package com.turnon.core.services;

import com.turnon.web.model.DoctorProfile;
import com.turnon.web.model.UserProfile;

public interface DoctorService {

	void registerDoctor(UserProfile userProfile);
	DoctorProfile getDoctorByMobile(String mobile);
}
