package com.example.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.Employee;
import com.example.springdemo.repository.Employeerepository;
@Service
public class EmployeeService {
       @Autowired
       Employeerepository er;
	public List<Employee> sorts(String field) {
		// TODO Auto-generated method stub
		return er.findAll(Sort.by(Direction.DESC,field));
	}
	public List<Employee> pagingemp(int offset, int pagesize) {
		// TODO Auto-generated method stub
		Pageable paging=PageRequest.of(offset,pagesize);
		Page<Employee> obj=er.findAll(paging);
		List<Employee> sc=obj.getContent();
		return sc;
	}
	public List<Employee> pageemp(int offset, int pageSize, String field) {
		// TODO Auto-generated method stub
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<Employee> obj=er.findAll(paging);
		List<Employee> sc=obj.getContent();
		return sc;
	}

}
