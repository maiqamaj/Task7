package com.example.demo;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface JobRepository extends JpaRepository<Job,Integer>{
	@Query(value ="select j from Job j where j.minSalary>?1")
	public List<Job> jobSalaryMorethan(double minSalary);
	
	
	
	
	

}
