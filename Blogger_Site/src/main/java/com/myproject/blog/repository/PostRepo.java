package com.myproject.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.blog.entity.Category;
import com.myproject.blog.entity.Post;
import com.myproject.blog.entity.User;

public interface PostRepo extends JpaRepository<Post, Long>{

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findByPostTitleContaining(String postTitle);
}
