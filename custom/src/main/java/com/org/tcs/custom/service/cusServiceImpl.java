package com.org.tcs.custom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.tcs.custom.model.customer;
import com.org.tcs.custom.repository.cusRepository;

@Service
public class cusServiceImpl implements cusService {
	@Autowired
    cusRepository cusrepo;
	@Override
	public customer saveCustomer(customer customer) {
		// TODO Auto-generated method stub
		
		return cusrepo.save(customer);
	}

	@Override
	public List<customer> fetchCustomerList() {
		// TODO Auto-generated method stub
		return cusrepo.findAll();
	}

	@Override
	public customer updateCustomer(customer customer, Integer customerId) {
		// TODO Auto-generated method stub
		Optional<customer> optional = cusrepo.findById(customerId);
        if(optional.isPresent())
        {
            optional.get().setName(customer.getName());
            optional.get().setMobno(customer.getMobno());
           
        }else {
            return null;
        }
        return cusrepo.save(optional.get());
	}

	@Override
	public void deleteCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		cusrepo.deleteById(customerId);
	}

}
