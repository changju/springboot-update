package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	

	@GetMapping("/book")
	public String book() {

		return "hello";
	}

}
