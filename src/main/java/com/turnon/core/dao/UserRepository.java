package com.turnon.core.dao;

import org.springframework.data.repository.CrudRepository;

import com.turnon.core.model.UserProfile;


public interface UserRepository extends CrudRepository<UserProfile, String> {

    //@Query
    //List<User> findByLastnameEqualsIgnoreCaseAndFirstnameStartsWithAndIsAdultTrue(String lastName, String fnamePrefix);
}
