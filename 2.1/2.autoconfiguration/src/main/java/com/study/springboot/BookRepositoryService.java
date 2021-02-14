package com.study.springboot;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.study.springboot.jdbc.Book;
import com.study.springboot.jdbc.BookRepository;

@Service
public class BookRepositoryService {

	@Autowired
	BookRepository bookRepository;
	
	@PostConstruct
	public void init() {
		Book book = new Book();
		book.setIsbn("1234");
		book.setTitle("스프링 부트 업데이");
		book.setPublished(LocalDate.of(2020, 10, 15));
		
		bookRepository.save(book);
	}
	
	
}
