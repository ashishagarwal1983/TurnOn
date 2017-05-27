package com.turnon.core.dao;

import com.turnon.core.model.User;

public interface UserProfileDAO {
    void save(User userProfile);

    User getUserInfoByPhone(String mobile, String category);
}
