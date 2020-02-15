package com.surge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surge.model.Vendors;
import com.surge.repo.VendorsRepo;

@RestController
public class VendorController {
	@Autowired
	private VendorsRepo repo;

	@GetMapping("/get")
	public List<Vendors> getVendors() {
		return repo.findAll();
	}

	@PostMapping("/post")
	public Vendors saveNewVendors(@RequestBody Vendors vendors) {

		System.out.println("VendorController Saved----------------------" + vendors);
		return repo.save(vendors);

	}

	// Get By Vendor name
	@GetMapping("/get/vname/{vendorname}")
	public List<Vendors> getByName(@PathVariable("vendorname") String vendorname) {
		return repo.findByvendorname(vendorname);
	}

	@GetMapping("/get/vendornames")
	public List<String> getVendorsNames() {
		System.out.println(repo.getVendorNames());
		return repo.getVendorNames();

	}
	
	@GetMapping("/get/{vendorname}")
	public String getVendorName(@PathVariable("vendorname") String vname) {
		System.out.println(repo.getVendorName(vname));
		return repo.getVendorName(vname);

	}

}
