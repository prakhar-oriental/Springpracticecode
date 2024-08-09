package com.org.tcs.springcloudeurekaclientdemo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/app")
public class Appcontroller {
     
	@GetMapping(path="/products")
	public Response getProducts() {
		Product p1 = new Product("Apple Iphone",70000);
		Product p2 = new Product("samsung",90000);
		Product p3 = new Product("moto",70400);
		Product p4 = new Product("oneplus",77800);
		Product p5 = new Product("vivo",71200);
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		Response response = new Response(101,"Product saved successfully",products);
		return response;
	}
}
