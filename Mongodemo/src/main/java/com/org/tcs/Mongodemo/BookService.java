package com.org.tcs.Mongodemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;



@Service
public  class BookService {
     @Autowired
	BookRepo bookrepo;
     
     public String saveBook(Book book)
     {
    	 bookrepo.save(book);
    	 return "Added Successfully";
     }
     
     	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	    }
     	public String deleteBook(String id){
	        bookrepo.deleteById(id);
	       
	        return "Deleted Successfully";
	    }
     	public Book updateBook(Book book, String bookId) {
    		// TODO Auto-generated method stub
    		Optional<Book> optional = bookrepo.findById(bookId);
            if(optional.isPresent())
            {
                optional.get().setBookName(book.getBookName());
                optional.get().setAuthorName(book.getAuthorName());
               
            }else {
                return null;
            }
            return bookrepo.save(optional.get());
    	}
}
