package com.surge.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.surge.repo.VendorsRepo;

@RestController
public class RetrieveVendorInfoDelegate implements JavaDelegate{

	@Autowired
	VendorsRepo repo;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
	
		//retrieve vendor info from database
		String vendorname = (String) execution.getVariable("vendorname");
		System.out.println( vendorname +" vendor info retrieve...........");
		
		//defining existing vendor details
		System.out.println(repo.findByvendorname(vendorname));
		
	}

}
