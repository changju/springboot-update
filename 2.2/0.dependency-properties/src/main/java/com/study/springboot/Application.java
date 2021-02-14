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

-----------

11. 의존성 및 프로퍼티 변경
 의존성 변경
  -스프링 프레임워크 5.2
    스프링 웹플럭스 기반 코틀린 코루틴 지원
    RSocket 지원 (Backpressure 지원)
    R2DBC 지원
    JUnit Jupiter 5.7 지원
    @Configuration에 proxyBeanMethods 속성 추가
      > 
  -스프링 시큐리티 5.2 (클라이언트 기능, 리소스 서버 기능 는 스프링코어 쪽으로 들어갔다)
    OAuth 2.0 클라이언트 기능 추가 
    OAuth 2.0 리소스 서버 기능 추가
    OAuth 2.0 인증 서버 기능은 별도의 커뮤니티 프로젝트로 분리
    스프링 시큐리티 5.2 소개 영상 
  -스프링 데이터 Moore
    선언전인 리액티브 트랜잭션 지원 (@Transactional)
    리액티브 QueryDSL
    성능 향상
  -스프링 HATEOAS 0.25 -> 1.0.*
    API가 바뀌어 버림!
    마이그레이션 사례 커밋 참고.
  -JUnit 5

 프로퍼티 변경
  -logging.file -> logging.file.name
  -logging.path -> logging.file.path
  -https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.2.0-Configuration-Changelog

 * */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);

	}

}
