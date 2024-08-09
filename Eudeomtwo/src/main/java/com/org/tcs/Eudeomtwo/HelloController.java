package com.org.tcs.Eudeomtwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/get")
	public HelloService retriveLimit()
	{
		return new HelloService(5000,1000);
	}
}
