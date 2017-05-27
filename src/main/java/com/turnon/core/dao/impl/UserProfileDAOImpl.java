package com.turnon.core.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.data.couchbase.core.mapping.CouchbasePersistentEntity;
import org.springframework.data.couchbase.repository.query.CouchbaseEntityInformation;
import org.springframework.data.couchbase.repository.query.CountFragment;
import org.springframework.data.couchbase.repository.query.support.N1qlUtils;
import org.springframework.data.couchbase.repository.support.MappingCouchbaseEntityInformation;
import org.springframework.stereotype.Repository;

import com.couchbase.client.java.query.N1qlParams;
import com.couchbase.client.java.query.N1qlQuery;
import com.couchbase.client.java.query.Statement;
import com.couchbase.client.java.query.consistency.ScanConsistency;
import com.turnon.core.dao.UserProfileDAO;
import com.turnon.core.model.User;


public class UserProfileDAOImpl  {

    /*@Autowired
    CouchbaseTemplate couchbaseTemplate;

    @Override
    public void save(User userProfile) {
        couchbaseTemplate.save(userProfile);
        //couchbaseTemplate.findById("1001", UserProfile.class);
    }

    @Override
    public User getUserInfoByPhone(String mobile, String category) {
        @SuppressWarnings("unchecked")
        CouchbasePersistentEntity<Object> itemPersistenceEntity = (CouchbasePersistentEntity<Object>) couchbaseTemplate.getConverter().getMappingContext().getPersistentEntity(User.class);

        CouchbaseEntityInformation<? extends Object, String> itemEntityInformation = new MappingCouchbaseEntityInformation<Object, String>(itemPersistenceEntity);
        Statement countStatement = N1qlUtils.createCountQueryForEntity(couchbaseTemplate.getCouchbaseBucket().name(), couchbaseTemplate.getConverter(), itemEntityInformation);
        
        //ScanConsistency consistency = couchbaseTemplate.getDefaultConsistency().n1qlConsistency(); 
        
        
        ScanConsistency consistency = couchbaseTemplate.getDefaultConsistency().n1qlConsistency();
        N1qlParams queryParams = N1qlParams.build().consistency(consistency);
        
        N1qlQuery query = N1qlQuery.simple(countStatement, queryParams);

        List<CountFragment> countFragments = couchbaseTemplate.findByN1QLProjection(query, CountFragment.class); 
        
        //couchbaseTemplate.findById("1", User.class);
        return null;
    }*/

}
