package com.gentech.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.security.entity.MyUser;
import com.gentech.security.service.MyUserService;

@RestController
public class MyUserController {

	@Autowired
	private MyUserService service;
	
	@PostMapping("/register")
	public MyUser registerUser(@RequestBody MyUser user)
	{
		return service.registerUser(user);
	}
}
