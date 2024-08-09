package com.org.tcs.Proddemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.org.tcs.Proddemo.model.Product;

public interface ProductRepository  extends CrudRepository<Product,Integer>{

}
