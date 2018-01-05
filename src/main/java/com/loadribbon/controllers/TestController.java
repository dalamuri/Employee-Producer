package com.loadribbon.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loadribbon.model.Employee;

	@RestController
	public class TestController {

		@RequestMapping(value = "/employee", method = RequestMethod.GET)
		public Employee firstPage() {

			Employee emp = new Employee();
			emp.setName("sougandh");
			emp.setDesignation("Java Developer");
			emp.setEmpId("1");
			emp.setSalary(4000);

			return emp;
		}


}
