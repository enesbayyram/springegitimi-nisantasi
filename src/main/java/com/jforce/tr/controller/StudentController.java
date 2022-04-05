package com.jforce.tr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {




	
	@RequestMapping(path = "/hello" , method = RequestMethod.GET)
	public String hello() {

		System.out.println("M");
		System.out.println("Metoda girdi");
		return "Hello metodum çalıştı";
	}
	
}
