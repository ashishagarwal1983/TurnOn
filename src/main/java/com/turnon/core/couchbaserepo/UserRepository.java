package com.turnon.core.couchbaserepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.turnon.web.model.UserProfile;


public interface UserRepository extends CouchbaseRepository<UserProfile, Long> {

	@Query
	List<UserProfile> findByName(String name);
}

