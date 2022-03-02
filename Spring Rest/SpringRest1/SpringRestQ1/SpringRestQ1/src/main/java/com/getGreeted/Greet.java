package com.getGreeted;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Controller
public class Greet {
	@ResponseBody
	@RequestMapping("/get")
public String sayHell(@RequestParam("Name") String n) {
	return "Hello"+" "+n;
}
	@RequestMapping("/get/greet")
	@ResponseBody
public String greetHru() {
	return "How are you doing today?";
}	
}
