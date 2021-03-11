package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(path="/show")
	public String sayHello() {
		return "<h1>Hello My Welcome</h1><br>"+"<h2>Some change updated</h2>";
	}
}
