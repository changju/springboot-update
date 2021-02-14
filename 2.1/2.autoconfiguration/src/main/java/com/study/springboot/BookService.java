package com.study.springboot;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	// 벌도의 Thread에서처리하게 한다. 
	@Async
	public void hello() {
		System.out.println("hello " + Thread.currentThread().getName());
	}
	
	@Scheduled(fixedDelay = 1000 * 2)
	public void hi() {
		System.out.println("hi " + Thread.currentThread().getName());
	}
	
}
