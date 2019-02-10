package com.valdrichtiago.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdrichtiago.workshopmongo.domain.Post;
import com.valdrichtiago.workshopmongo.repository.PostRepository;
import com.valdrichtiago.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Post not found!"));
	}
	
	
	public List<Post> findByTitle(String title) {
		return repo.searchTitle(title);
	}
	
}
