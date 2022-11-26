package com.myproject.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.blog.entity.User;
import com.myproject.blog.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public User createUser(User user)
	{
		return userRepo.save(user);
		
	}
}
