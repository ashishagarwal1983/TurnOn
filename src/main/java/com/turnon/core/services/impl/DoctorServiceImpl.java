package com.turnon.core.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turnon.core.repo.DoctorRepository;
import com.turnon.core.services.DoctorService;
import com.turnon.web.model.DoctorProfile;
import com.turnon.web.model.UserProfile;


@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public void registerDoctor(DoctorProfile doctorProfile) {
		doctorRepository.save(doctorProfile);
	}

	@Override
	public List<UserProfile> getDoctorByMobile(String mobile) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
