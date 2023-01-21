package com.pkar.Joblisting.controller.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pkar.Joblisting.controller.Model.Post;

public interface PostRepository extends MongoRepository<Post,String>
{

}
