package com.turnon.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turnon.core.couchbaserepo.UserRepository;
import com.turnon.core.services.DoctorService;
import com.turnon.web.model.DoctorProfile;
import com.turnon.web.model.UserProfile;

@Service
public class DoctorServiceImpl implements DoctorService {
	//@Autowired
//	private UserRepo userRepo;
	

	
	@Override
	public void registerDoctor(UserProfile userProfile) {
		//doctorRepo.save(doctorProfile);
	}

	@Override
	public DoctorProfile getDoctorByMobile(String mobile) {
		// TODO Auto-generated method stub
		return null;
	}

}
