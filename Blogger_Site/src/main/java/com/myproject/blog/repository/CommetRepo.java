package com.myproject.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.blog.entity.Comment;

public interface CommetRepo extends JpaRepository<Comment, Long>{

}
