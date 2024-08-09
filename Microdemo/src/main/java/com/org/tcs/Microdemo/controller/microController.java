package com.org.tcs.Microdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.tcs.Microdemo.model.Address;
import com.org.tcs.Microdemo.model.Response;
import com.org.tcs.Microdemo.model.User;
import com.org.tcs.Microdemo.repo.userRepo;



@RestController
public class microController {
     @Autowired
	private userRepo repo;
     
     @PostMapping("/add")
     public ResponseEntity<Response> addUser(@RequestParam int userId,@RequestParam String name,@RequestParam String phone,@RequestParam String email,
    		 @RequestParam String addressline,@RequestParam String city,@RequestParam String state,@RequestParam String zipcode){
     
    	 Address a = new Address(addressline,city,state,zipcode);
    	 User u = new User(userId,name,phone,email,a);
    	 repo.save(u);
    	 Response r = new Response(101,"user"+name+"save successfully at",null);
    	 return new ResponseEntity<Response>(r,HttpStatus.ACCEPTED);
     
}
     @GetMapping("/add")
     public ResponseEntity<List<User>> getAllUsers()
     {
    	 
    	 List<User> l = repo.findAll();
    	 return new ResponseEntity<>(l,HttpStatus.OK);
     }
}
