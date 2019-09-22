package com.bookservice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.book.dto.Book;
@RestController
@SpringBootApplication
public class BookserviceApplication {
	
	
	
	@GetMapping("/findAllBooks")
	@CrossOrigin("*")//for fixing the cors error.
	public List<Book> getBooks(){
		return Stream.of(new Book(111,"JAVA",999),new Book(222,"Spring",888),new Book(777,"Hibernate",333)).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(BookserviceApplication.class, args);
	}

}
