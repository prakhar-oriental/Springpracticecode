package com.org.tcs.custom.service;

import java.util.List;

import com.org.tcs.custom.model.customer;

public interface cusService {
	customer saveCustomer(customer customer);
	 
    // Read operation
    List<customer> fetchCustomerList();
 
    // Update operation
    customer updateCustomer(customer customer,
                                Integer customerId);
 
    // Delete operation
    void deleteCustomerById(Integer customerId);
}
