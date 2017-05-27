package com.turnon.core.services;

import com.turnon.core.model.User;
import com.turnon.core.model.UserProfile;


public interface UserService {

    void registerUser(UserProfile userProfile);
    User getUserInfoByPhone(String mobile, String category);
}
