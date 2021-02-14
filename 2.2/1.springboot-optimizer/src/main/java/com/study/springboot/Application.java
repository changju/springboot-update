package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/*
12. 성능 개선
  -스프링 부트 애플리케이션을 최대한 빠르게 띄우고 싶다면?
    @Configuration(proxyBeanMethods = false) 적용 (스프링 지원)
    spring.main.lazy-initialization=true // bean 생성을 생성할때 만들도록 한다. (스프링부트에서 지원하는것임)
    spring.data.jpa.repositories.bootstrap-mode=lazy // bean 생성을 생성할때 만들도록 한다.  (스프링부트에서 지원하는것임)
    spring.jmx.enabled=false (이미 기본으로 적용되어 있음)

  -실제로 모든 옵션 적용시 StudyOlle 예제 애플리케이션의 구동 시간이 3초에서 1.5초로 줄어듬.

  -단점은?
    요청 처리 시간이 느려질 수 있다. 아직 초기화 하지 않은 빈을 만드느라...
    애플리케이션 구동시 발생해야 했던 에러가 애플리케이션 동작 중에 발생할 수 있다.
         
 * */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);

	}

}
