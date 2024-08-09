package com.org.tcs.custom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.tcs.custom.model.customer;

public interface cusRepository extends JpaRepository<customer,Integer>{

}
