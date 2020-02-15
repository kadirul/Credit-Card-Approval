 package com.surge.repo;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.surge.model.Vendors;

public interface VendorsRepo extends JpaRepository<Vendors, Integer>{
	
	List<Vendors> findByvendorname(String vendorname);
	
	@Query(value = "select vendorname from vendors", nativeQuery = true)
	List<String> getVendorNames();
	
	@Query(value = "select vendorname from vendors where vendorname LIKE :name", nativeQuery = true)
	String getVendorName(@Param("name") String name);
}
