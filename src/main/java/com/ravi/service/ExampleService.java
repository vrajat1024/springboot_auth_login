package com.ravi.service;

import org.springframework.stereotype.Service;

import com.ravi.pojo.Message;

@Service
public class ExampleService {
	
	public Message getMessage(String name) {
		return new Message("Hello "+(name==null?"World":name)+"!!");
	}

}
