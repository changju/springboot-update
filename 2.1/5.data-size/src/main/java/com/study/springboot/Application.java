package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/*
7. DataSize
  org.springframework.util.unit.DataSize
    스프링 부트가 아니라 스프링 프레임워크가 5.1부터 지원하는 타입으로, 데이터 사이즈 MB, GB 등을 표현하는데 사용할 수 있는 타입니다.
    지원하는 타입: B, KB, MB, GB, TB

  그럼 스프링 부트는 무엇을 지원하느냐? 컨버터를 지원한다.
    StringToDataSizeConverter
    NumberToDataSizeConverter

  그래서? application.properties에서 데이터 사이즈를 손쉽게 바인딩 받을 수 있다.

 * */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);

	}

}
