package com.turnon.core.repo;

import java.util.List;

import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.turnon.web.model.UserProfile;

@Repository
public interface UserRepository extends CouchbaseRepository<UserProfile, Long> {

	@Query("#{#n1ql.selectEntity} WHERE mobileNumber = $1 and #{#n1ql.filter}")
	List<UserProfile> findByMobile(String mobile);
}

