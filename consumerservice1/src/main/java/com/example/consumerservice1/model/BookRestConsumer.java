package com.example.consumerservice1.model;

import java.util.ArrayList;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="ProducerService")
public interface BookRestConsumer {
	@GetMapping("/Book/get")
    public String getBook();
    @GetMapping("/book/{id}")
    public Book getBookById(Integer id);
    @GetMapping("/Book/getAll")
    public ArrayList<Book> getAllBook();
}
