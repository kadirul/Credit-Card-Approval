package com.surge.delegate;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.surge.model.Vendors;
import com.surge.repo.VendorsRepo;

@RestController
public class VerifyVendorInfoDelegate implements JavaDelegate{
	@Autowired
	private VendorsRepo repo;

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		//Retrieving vendorname from form
		String vname = (String) execution.getVariable("vendorname");

		//retrieving vendorname from database 
		String vendorname = repo.getVendorName(vname);
			
		//Verifying vendorname  
				if(vname.equalsIgnoreCase(vendorname)) {
					System.out.println("Already Exists");
					//executing to next task for updating 
					execution.setVariable("isNewVendor", false);
				}else{
					System.out.println("Vendor not existed----------------------" );
					//executing to next task for saving in database
					execution.setVariable("isNewVendor", true);
				}
	}
	
}
