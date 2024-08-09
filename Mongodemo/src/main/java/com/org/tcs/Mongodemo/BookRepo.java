package com.org.tcs.Mongodemo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book,String>{

}
