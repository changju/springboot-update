package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/*
2부 스프링 부트 2.2
  10. 스프링 부트 2.2 변경 내역 소개
    https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.2-Release-Notes

    출시일: 2019년 10월

    현재 시점(2020년 9월 20일 기준) 최신 버전: 2.2.10

    주요 변경 내역
        자바 13 지원
        의존성 변경
        초기화 지연을 통해 애플리케이션 구동 시간 줄이는 기능 추가
        Immutable @ConfigurationProperties
        Actuator, health 그룹 지원
        
 * */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);

	}

}
