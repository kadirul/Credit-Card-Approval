package com.surge.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.surge.model.Vendors;
import com.surge.repo.VendorsRepo;


@RestController
public class VendorDataDelegate implements JavaDelegate {
	@Autowired
	VendorsRepo repo;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		// Retrieving values from forms 
		String vendorname = (String) execution.getVariable("vendorname");
		String firstName = (String) execution.getVariable("firstname");
		String lastName = (String) execution.getVariable("lastname");
		Long phone = (Long) execution.getVariable("phone");
		String email = (String) execution.getVariable("email");
		String address = (String) execution.getVariable("address");
		String city = (String) execution.getVariable("city");
		String state = (String) execution.getVariable("state");
		Long zip = (Long) execution.getVariable("zip");
		String country = (String) execution.getVariable("country");

		System.out.println("\nReceiving the Follow Info");
		System.out.println(vendorname + ", " + firstName + ", " + lastName + ", " + phone + ", " + email + ", "
				+ address + ", " + city + ", " + state + ", " + zip + ", " + country);

		// assiging values to vendor object
		Vendors vendor = new Vendors(vendorname, firstName, lastName, phone, email, address, city, state, zip, country);
		
		// saving into database
		repo.save(vendor);
	}

}
