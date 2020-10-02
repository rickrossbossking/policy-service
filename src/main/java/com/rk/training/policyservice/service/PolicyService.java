package com.rk.training.policyservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.training.policyservice.model.Customer;
import com.rk.training.policyservice.model.Policy;
import com.rk.training.policyservice.repository.PolicyRepository;

@Service
public class PolicyService {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	PolicyRepository policyRepository;

	public Policy createPolicy(Policy policy) {
		
		Customer customer;
		customer = customerService.getCustomerDetails(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);
	}
	
	public Policy createPolicy2(Policy policy) {
		
		Customer customer;
		customer = customerService.getCustomerDetails2(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);
	}

	public Policy createPolicy3(Policy policy) {
	
		Customer customer;
		customer = customerService.getCustomerDetails3(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);
	}

	public List<Policy> getPolicies() {
		// TODO Auto-generated method stub
		return policyRepository.findAll();
	}
	
	public void deletePolicy(String policyId) {
		policyRepository.deleteById(policyId);
	}
	
	

}
