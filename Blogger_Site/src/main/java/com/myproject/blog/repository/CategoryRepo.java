package com.myproject.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.blog.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Long>{

}
