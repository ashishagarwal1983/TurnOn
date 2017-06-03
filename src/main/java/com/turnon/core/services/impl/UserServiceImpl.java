package com.turnon.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.turnon.core.repo.UserRepository;
import com.turnon.core.services.UserService;
import com.turnon.web.model.UserProfile;



@Service
@Qualifier("UserServiceImpl")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public void registerUser(UserProfile userProfile) {
		userRepository.save(userProfile);
	}


	public UserProfile getUserByMobile(String mobile) {
		return null;
	}
	

}
