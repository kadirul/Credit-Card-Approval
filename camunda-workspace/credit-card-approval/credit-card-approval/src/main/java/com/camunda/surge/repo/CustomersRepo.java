package com.camunda.surge.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camunda.surge.controller.lastnameOnly;
import com.camunda.surge.model.Customers;

public interface CustomersRepo extends JpaRepository<Customers, Integer>{
	List<lastnameOnly> findBylastname(String lastname);
	List<lastnameOnly> findBylastname();
}
