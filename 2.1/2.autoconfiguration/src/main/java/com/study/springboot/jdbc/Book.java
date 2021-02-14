package com.study.springboot.jdbc;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book {
	
	@Id
	private Integer id;
	
	private String title, isbn;
	
	private LocalDate published;
	

}
