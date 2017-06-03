package com.turnon.core.repo;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.turnon.web.model.DoctorProfile;
import com.turnon.web.model.UserProfile;

@Repository
public interface DoctorRepository extends CouchbaseRepository<DoctorProfile, Long> {

}
