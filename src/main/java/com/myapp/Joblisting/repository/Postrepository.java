package com.myapp.Joblisting.repository;

import com.myapp.Joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Postrepository extends MongoRepository<Post,String> {

}
