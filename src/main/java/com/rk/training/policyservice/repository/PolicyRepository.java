package com.rk.training.policyservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rk.training.policyservice.model.Policy;

public interface PolicyRepository extends MongoRepository<Policy, String> {
	
	

}
