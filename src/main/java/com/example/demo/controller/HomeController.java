package com.example.demo.controller;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.User;
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
	
	@GetMapping(path="/alls/{id}/{name}/{email}", produces= MediaType.APPLICATION_JSON_VALUE )
	public List<User> showAlls(@Validated @PathVariable("id") final Integer id, @Validated @PathVariable("name") String name,
			@Validated @PathVariable("email") String email) {
		User u1=new User(288, "Keven Smith", "KevenS@test.org");
		User u2=new User(id, name, email);
		List<User> list =new LinkedList<>();
		
		Collections.addAll(list, u1, u2);
		list.stream().forEach(System.out::println);
		System.out.println(u1.toString());
		return list;
	}
}
