package com.kishan.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kishan.model.Employee;


@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{

	public List<Employee> findByDeptName(String deptName);
}