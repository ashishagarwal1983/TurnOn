package com.turnon.core.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turnon.core.repo.UserRepository;
import com.turnon.core.services.DoctorService;
import com.turnon.web.model.DoctorProfile;
import com.turnon.web.model.UserProfile;


@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	UserRepository userRepository;
	
	public void registerDoctor(UserProfile userProfile) {
		userRepository.save(userProfile);
	}

	public List<UserProfile> getDoctorByMobile(String mobile) {
		return userRepository.findByMobile(mobile);
	}

}
