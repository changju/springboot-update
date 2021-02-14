package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


/*
자동 설정 지원
  스프링 부트 2.1부터 지원하는 자동 설정

  - 태스크 실행
    @EnableAsync 사용시 자동 설정(TaskExecutionAutoConfiguration) 적용
    spring.task.execution 프로퍼티로 제공
    TaskExecutorBuilder 제공

  - 태스크 스케줄링
    @EnableScheduling 사용시 자동 설정(TaskSchedulingAutoConfiguration) 적용
    spring.task.scheduling 프로퍼티 제공
    TaskSchedulerBuilder 제공

  - 스프링 데이터 JDBC
    spring-boot-starter-data-jdbc 의존성 추가시 지원
    - 장점은 jpa에 비하여 단순하다.
  - 그밖에
    카프카 스트림 지원
    JMS ConnectionFactory 캐시 지원
    엘라스틱 서치 REST 클라이언트 지원
    ...

 * */

@EnableScheduling
@EnableAsync
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);

	}

}
