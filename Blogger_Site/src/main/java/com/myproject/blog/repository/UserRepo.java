package com.myproject.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.blog.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

	Optional<User> findByEmail(String email);
}
