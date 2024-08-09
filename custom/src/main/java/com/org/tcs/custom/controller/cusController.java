package com.org.tcs.custom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.tcs.custom.model.customer;
import com.org.tcs.custom.service.cusService;

@RestController
public class cusController {
    @Autowired
	cusService cusservice;
    // Save operation
    @PostMapping("/customer")
    public customer saveCustomer(
         @RequestBody customer customer)
    {
        return cusservice.saveCustomer(customer);
    }
 
    // Read operation
    @GetMapping("/customer")
    public List<customer> fetchCustomerList()
    {
        return cusservice.fetchCustomerList();
    }
 
    // Update operation
    @PutMapping("/customer/{id}")
    public customer
    updateDepartment(@RequestBody customer customer,
                     @PathVariable("id") Integer custoerId)
    {
        return cusservice.updateCustomer(customer, custoerId);
    }
 
    // Delete operation
    @DeleteMapping("/customer/{id}")
    public String deleteCustomerById(@PathVariable("id")
                                       Integer customerId)
    {
        cusservice.deleteCustomerById(customerId);
        return "Deleted Successfully";
    }
}
