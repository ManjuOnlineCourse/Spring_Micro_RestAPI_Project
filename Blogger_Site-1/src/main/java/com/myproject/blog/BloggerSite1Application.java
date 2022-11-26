package com.myproject.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class BloggerSite1Application {

	public static void main(String[] args) {
		SpringApplication.run(BloggerSite1Application.class, args);
	}

}
