package com.camunda.surge.delegate;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import com.camunda.surge.controller.CustomerController;
import com.camunda.surge.model.Customers;
import com.camunda.surge.model.SingleVendor;

public class CardirtCardDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		//String lastName = (String) execution.getVariable("lastname");
		System.out.println(execution.getVariableNames());
		Collection<Object> listCus = execution.getVariables().values();
		Customers customers = new Customers();
		CustomerController cus = new CustomerController();
		System.out.println(cus.getNames("Chow"));
		System.out.println("Beginning");
		System.out.println(listCus);
		System.out.println("Ended");
		/*
		 * String firstName = (String) execution.getVariable("firstname"); String
		 * lastName = (String) execution.getVariable("lastname"); Long age = (Long)
		 * execution.getVariable("age"); Long score = (Long)
		 * execution.getVariable("score");
		 */
		/*
		 * System.out.println(age+", "+score+", "+firstName+", "+lastName);
		 */
		CreditCardRestHandler creditRest = new CreditCardRestHandler();
		/*
		 * creditRest.postNewCustomer(); System.out.println(listCus);
		 */
		
		SingleVendor ven = new SingleVendor();
		//System.out.println(ven.getLastNames(lastName));
	}

}
