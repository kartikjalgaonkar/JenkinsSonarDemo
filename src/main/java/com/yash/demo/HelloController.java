package com.yash.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String GetHello() { //should show code smell in Sonar
		return "hello Yash!!";
	}
}
