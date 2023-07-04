package com.employeeMicro.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/Employeedetail")
	public String employeedetail()
	{
		String address=restTemplate.getForObject("http://localhost:8083/addressEmp", String.class);
		return "Rama,12,1997,05"+"  "+address;
	}

}
