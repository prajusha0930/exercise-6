package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.Employee;
import com.example.springdemo.service.EmployeeService;

@RestController
public class EmployeeController {
       @Autowired
       EmployeeService us;
       @GetMapping("/sort/{field}")
       public List<Employee> sorts(@PathVariable String field)
       {
       	return us.sorts(field);
       }
       @GetMapping("/paging/{offset}/{pagesize}")
       public List<Employee>pagingemp(@PathVariable int offset,@PathVariable int pagesize)
       {
       	return us.pagingemp(offset,pagesize);
       }
       @GetMapping("/paging/{offset}/{pageSize}/{field}")
       public List<Employee>pageemp(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
       {
       	return us.pageemp(offset,pageSize,field);
       }
}
