package com.rk.training.policyservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rk.training.policyservice.model.Policy;
import com.rk.training.policyservice.service.PolicyService;

@RestController
public class PolicyController {
	
	@Autowired
	PolicyService policyService;
	
	@RequestMapping(value="/hello")
	public String hello() {
		return "Howdy!";
	}
	@RequestMapping(value="/policy", method = RequestMethod.POST)
	public Policy createPolicy(@RequestBody Policy policy) {
		return policyService.createPolicy(policy);
	}
	
	@RequestMapping(value="/policy2", method = RequestMethod.POST)
	public Policy createPolicy2(@RequestBody Policy policy) {
		return policyService.createPolicy2(policy);
	}
	
	@RequestMapping(value="/policy3", method = RequestMethod.POST)
	public Policy createPolicy3(@RequestBody Policy policy) {
		return policyService.createPolicy3(policy);
	}
	
	@RequestMapping(value="/policy/{policyId}", method = RequestMethod.DELETE)
	public void deletePolicy(@PathVariable("policyId") String policyId) {
		policyService.deletePolicy(policyId);
	}
	
	@RequestMapping(value="/policy", method = RequestMethod.PUT)
	public Policy updatePolicy(@RequestBody Policy policy) {
		return policyService.createPolicy(policy);
	}
	
	@RequestMapping(value="/policies")
	public List<Policy> getPolicies(){
		return policyService.getPolicies();
	}
}
