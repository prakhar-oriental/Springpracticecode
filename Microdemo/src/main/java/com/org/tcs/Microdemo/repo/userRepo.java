package com.org.tcs.Microdemo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.org.tcs.Microdemo.model.User;

public interface userRepo extends MongoRepository<User,Integer>{

}
