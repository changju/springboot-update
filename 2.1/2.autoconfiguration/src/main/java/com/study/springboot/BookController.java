package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.springboot.jdbc.Book;
import com.study.springboot.jdbc.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping("/book")
	public String book() {
		bookService.hello();
		return "hello";
	}
	
	@GetMapping("/book2")
	public Book book2() {
		bookRepository.findAll().forEach(System.out::println);
		Book book = bookRepository.findByIsbn("1234");
		return book;
	}

}
