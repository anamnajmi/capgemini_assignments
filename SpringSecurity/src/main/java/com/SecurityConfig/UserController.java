package com.SecurityConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
@RequestMapping("/")
	public String sayHello() {
	return "home.jsp";
}
@RequestMapping("/login")
public String customLogin(){
	return "login.jsp"; 
	}
}
