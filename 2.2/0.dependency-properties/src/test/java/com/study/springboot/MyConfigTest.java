package com.study.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MyConfigTest {


	@Autowired
	MyConfig myConfig;
	
	@Test
	void test() {
		System.out.println(myConfig.myBean());
		System.out.println(myConfig.myBean());
		System.out.println(myConfig.myBean());
		System.out.println(myConfig.myBean());
	}

}
