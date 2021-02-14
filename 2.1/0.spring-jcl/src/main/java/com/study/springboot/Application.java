package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/*
2. 의존성 변경

의존성 변경
  스프링 프레임워크 5.0 -> 스프링 프레임워크 버전 5.1
    로거 설정 개선 spring-jcl
    컴포넌트 스캐닝 성능 개선이 가능한 “컴포넌트 인덱스" 기능 제공
    함수형 프로그래밍 스타일 지원
    코틀린 지원
    리액티브 프로그래밍 모델 지원
    JUnit 5 지원
    참고
  JUnit 4.12 -> JUnit 5.2
    Jupiter
    Extension 모델
    람다 지원
    참고
    더 자바, 애플리케이션을 테스트 하는 다양한 방법
  톰캣 8.5.39 -> 톰캣 9
    BIO 커넥터 사라지고 NIO 커넥터 기본으로 사용
    HTTP/2 지원
    웹소켓 2.0 지원
    서블릿 4.0 / JSP 2.4 지원
    참고
  하이버네이트 5.2 -> 하이버네이트 5.3
    JPA 2.2 지원
    Java 8의 Date와 Time API 지원
    참고

---------------------------------------------------------------
JCL 혹은 SLF4J 를 로깅 퍼사드를 사용하여 
로거 인터페이스를 사용하고 로거 인터페이스의 구현체는 Log4j, Logback, Log4j2, JUL 이다.
 JCL은 레거시로 동적으로 바인딩하는 문제가 있기에 컴파일타임에 하는 SLF4J 를 사용하도록 한다.

--------------------------------------------------------------
로깅 시스템 Log4J 2로 변경하기
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter</artifactId>
<exclusions>
		<exclusion>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-logging</artifactId>
		</exclusion>
</exclusions>
</dependency>

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-log4j2</artifactId>
</dependency>

 * */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);

	}

}
