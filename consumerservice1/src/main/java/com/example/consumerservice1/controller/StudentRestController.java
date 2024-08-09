package com.example.consumerservice1.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumerservice1.model.Book;
import com.example.consumerservice1.model.BookRestConsumer;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	@Autowired
    BookRestConsumer consumer;
    
    @GetMapping("/data")
    public String getStudentInfo() {
        System.out.println(consumer.getClass().getName());
        return "Accessing from STUEDENT-SERVICE ==> "+consumer.getBook();
    }
//    @GetMapping("/getAll")
//    public String getBookInfo() {
//        return "Accessing from STUEDENT-SERVICE ==> "+consumer.getAllBook();
//    }
    
    @GetMapping("/getAll")
    public ArrayList<Book> getAllBook()
    {
    	return consumer.getAllBook();
    }
//    @GetMapping("/getOneBook/{id}")
//    public String getAllBook() {
//        return "Accessing from STUEDENT-SERVICE ==> "+consumer.getAllBook();
//    }
}
