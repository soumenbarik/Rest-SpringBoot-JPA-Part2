package com.cts.academy.employee.client;


import org.springframework.stereotype.Component;

import com.cts.academy.employee.model.Policy;

@Component
public class PolicyRestClient {

	
	public Policy getPolicyDetils(String policyID) {
		
		Policy pol = new Policy();
		pol.setContactEmail("name@cognizant.com");
		pol.setInsuranceStartDate("10/10/2019");
		pol.setInsurerName("New India Assurance");
		pol.setNosOfDependent(0);
		pol.setPolicyNumber(policyID);
		return pol;
		
	}
}
