package com.org.demo.Springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {
    
	@GetMapping("/call")
	public String hello() {
		return "spring boot";
	}
}
