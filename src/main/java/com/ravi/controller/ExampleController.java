package com.ravi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.pojo.Message;
import com.ravi.service.ExampleService;

@RestController
public class ExampleController {
	
	@Autowired
	private ExampleService service;
	
	@GetMapping("/")
	public String root() {
		return "<h1>Welcome !! Successfully Logged In.</h1>";
	}
	
	@GetMapping("/hello")
	public Message hello(HttpServletRequest request) {
		System.out.println(request.getServerName());
		return service.getMessage(null);
	}
	
	@GetMapping("/hello/{name}")
	public Message hello(@PathVariable String name) {
		return service.getMessage(name);
	}

}
