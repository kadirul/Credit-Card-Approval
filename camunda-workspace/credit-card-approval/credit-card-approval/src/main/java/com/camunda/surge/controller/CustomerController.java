package com.camunda.surge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.camunda.surge.model.Customers;
import com.camunda.surge.repo.CustomersRepo;

@RestController
public class CustomerController {
	@Autowired
	private CustomersRepo repo;
	
	
	
	@GetMapping("/get")
	public List<Customers> getCustomres() {
		return repo.findAll();
	}
	
	@PostMapping("/post")
	public Customers saveNewCustomers(@RequestBody Customers customers) {
		return repo.save(customers);
	}
	
	@GetMapping("/get/lastname")
	public List<lastnameOnly> getNames(){
		System.out.println(repo.findBylastname().toString());
		return repo.findBylastname(); 
	}
	
	@GetMapping("/get/{lastname}")
	public List<lastnameOnly> getNames(@PathVariable("lastname") String lastname){
		System.out.println(repo.findBylastname(lastname).toString());
		return repo.findBylastname(lastname); 
	}
}
