package com.study.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 같은 객체를 리턴하는 이유에 대해서
// MyConfig 라는 Proxy가 만들어지고 Proxy 내 만들어진 myBean 을 만들었다고 생각하자. [아래코드 참조]
// 같은 객체를 리턴하지 말아달라 설정하기 위해서 @Configuration (proxyBeanMethods = false) 를 쓴다.
/*
	@Autowired
	MyConfig myConfig;
	
	@Test
	void test() {
		System.out.println(myConfig.myBean());
		System.out.println(myConfig.myBean());
		System.out.println(myConfig.myBean());
		System.out.println(myConfig.myBean());
	}
 * 
 * */

@Configuration
public class MyConfig {


	// 2.2 부터 항상 같은 객체를 리턴한다.
	//  Scope 을 하지 않았기 때문에 같은 객체를 리턴을 지향하였다.
	@Bean
	public Object myBean() {
		return new Object();
	}

}
