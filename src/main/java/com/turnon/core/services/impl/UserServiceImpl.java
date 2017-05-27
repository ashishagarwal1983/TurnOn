package com.turnon.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turnon.core.dao.UserRepository;
import com.turnon.core.model.User;
import com.turnon.core.model.UserProfile;
import com.turnon.core.services.UserService;

@Service
public class UserServiceImpl implements UserService {

   /* @Autowired
    private UserProfileDAO userProfileDAO; */   
    
    @Autowired
    private  UserRepository userRepository;

    /*@Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
*/
    @Override
    public void registerUser(UserProfile userProfile) {
        //userProfileDAO.save(userProfile);
        userRepository.save(userProfile);
    }

    @Override
    public User getUserInfoByPhone(String mobile, String category) {
        //userRepository.getUserInfoByPhone(mobile, category);
        return null;
    }

    
}
