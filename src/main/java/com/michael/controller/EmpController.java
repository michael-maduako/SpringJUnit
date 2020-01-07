package com.michael.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.model.Emp;

@RestController
public class EmpController {
	@GetMapping("/emp")
	public Emp display() {
		Emp e1 = new Emp();
		e1.setEmpId(10001);
		e1.setEmpName("Tamirat");
		e1.setEmpSal(12345);

		Emp e2 = new Emp();
		e1.setEmpId(10002);
		e1.setEmpName("Mobusher");
		e1.setEmpSal(12345);

		Emp e3 = new Emp();
		e1.setEmpId(10003);
		e1.setEmpName("Michael");
		e1.setEmpSal(12345);
		
		
		return e1;
	}
}
