package com.example.demo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(path="/show")
	public String sayHello() {
		return "<h1>Hello My Welcome</h1><br>"+"<h2>Some change updated</h2>";
	}
	
	@GetMapping(path="/updated/{name}")
	public String domore(@Validated @PathVariable("name") final String name) {
		
		return name+"<h1>Welcome to Web Page </h1>";
	}
}
