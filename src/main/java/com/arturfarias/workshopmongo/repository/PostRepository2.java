package com.arturfarias.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arturfarias.workshopmongo.domain.Post;

@Repository
public interface PostRepository2 extends MongoRepository<Post, String> {
	
	List<Post> findByTitleContainingIgnoreCase(String Text);

}
