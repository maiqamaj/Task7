package com.example.demo;

import java.util.HashMap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department,Integer>{

	@Query(value="select sum(e.salary) from Department d "
			+ "inner join Employee e on d.departmentName='IT' group by d.departmentName")
	 Double totalSalaryEmployess(String value);
}
