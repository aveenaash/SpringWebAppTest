package com.boa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value = "login-user", method = RequestMethod.GET)
	public String login() {
		System.out.println("I came to login page");
		return "login";
	}

}
