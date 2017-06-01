package com.turnon.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.turnon.core.couchbaserepo.UserRepository;
import com.turnon.core.services.UserService;
import com.turnon.web.model.UserProfile;


@Service
@Qualifier("UserRepositoryService")
public class UserRepositoryService implements UserService {
	
//	@Autowired
//	private UserRepository userRepository;
	
	

//	@Autowired
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
	
	@Override
	public void registerUser(UserProfile userProfile) {
		// userProfileDAO.save(userProfile);
		//userRepo.save(userProfile);
	}

	@Override
	public UserProfile getUserByMobile(String mobile) {
		return null;
	}

}
