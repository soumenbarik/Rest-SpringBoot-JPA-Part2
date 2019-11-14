package com.cts.academy.employee.client;

import org.springframework.stereotype.Component;

import com.cts.academy.employee.model.Policy;

@Component
public class PolicyRestClient {

	public Policy fetchPolicyDetails(String policyID) {
		Policy pol = new Policy();
		pol.setPolicyNumber(policyID);
		pol.setContactEmail("contactEmail");
		pol.setInsuranceStartDate("InsuranceStartDate");
		pol.setInsurerName("New India Insurance company");
		pol.setNosOfDependent(4);
		return pol;
	}
}
