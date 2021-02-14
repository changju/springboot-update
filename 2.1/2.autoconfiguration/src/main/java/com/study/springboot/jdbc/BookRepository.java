package com.study.springboot.jdbc;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public interface BookRepository extends CrudRepository<Book, Integer> {

	// @Param("isbn") 의 값을 :isbn 에 맵핑해준다.
	@Query("select * from Book where isbn = :isbn")
	Book findByIsbn(@Param("isbn") String isbn);
}
