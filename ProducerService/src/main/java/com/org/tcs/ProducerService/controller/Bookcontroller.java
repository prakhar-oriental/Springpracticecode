package com.org.tcs.ProducerService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.tcs.ProducerService.model.Book;

@RestController
@RequestMapping(path="/Book")
public class Bookcontroller {
	 @Autowired
	    public Environment env;
	 
	 @GetMapping("/get")
	 public String getBook()
	 {
		 return env.getProperty("local.server.port");
	 }
	 
	 @GetMapping("/get/{id}")
	 public Book getBook(@PathVariable("id") int id)
	 {
		 return new Book(1,"Harry potter",1400);
	 }
	
	 @GetMapping("/getAll")
	 public List<Book> getAllBook()
	 {
		 List<Book> l = new ArrayList();
		 l.add(new Book(1,"Harry potter",1400));
		 l.add(new Book(2,"abc",100));
		 l.add(new Book(3,"Harry gth",10));
		return l;
	 }
}
