package com.org.tcs.Mongodemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BookController {
	 @Autowired
	    private BookService repo;
	 
	    @PostMapping("/addBook")
	    public String saveBook(@RequestBody Book book){
	       return repo.saveBook(book);
	    }
	 
	    @GetMapping("/addBook")
	    public List<Book> getBooks() {
	       
	        return repo.getBooks();
	    }
	 
	    @DeleteMapping("/addBook/{id}")
	    public String deleteBook(@PathVariable String id){
	        repo.deleteBook(id);
	       
	        return "Deleted Successfully";
	    }
	    @PutMapping("/addBook/{id}")
	    public Book	 updateDepartment(@RequestBody Book book, @PathVariable("id") String bookId)
	    {
	        return repo.updateBook(book, bookId);
	    }
}
