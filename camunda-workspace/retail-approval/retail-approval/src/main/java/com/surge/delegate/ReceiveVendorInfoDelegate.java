package com.surge.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import com.surge.model.Vendors;

public class ReceiveVendorInfoDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		// Retreiving data from form
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

		System.out.println("\nReceiving the Following Info from form:");
		System.out.println(vendorname + ", " + firstName + ", " + lastName + ", " + phone + ", " + email + ", "
				+ address + ", " + city + ", " + state + ", " + zip + ", " + country);
		
	}

}
