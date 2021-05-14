package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	// comment    232
	
	@RequestMapping("/test")
	public String test() {
		return "testing";
	}

}
