package com.camunda.surge.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.camunda.surge.repo.CustomersRepo;

public class SingleVendor {
	@Autowired
	CustomersRepo repo;
	
	//public Customers getLastNames(String lastname) {
		//return repo.findBylastname(lastname).get(0);
	//}
}
