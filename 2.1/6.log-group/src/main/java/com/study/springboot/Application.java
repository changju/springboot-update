package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/*
8. 로그 그룹
  같은 로그 레벨을 적용할 패지키 묶음을 만들 수 있는 기능으로 여러 패키지의 로그 레벨을 손쉽게 변경할 수 있다.

  로그 그룹 정의하는 방법
    logging.group.{그룹 이름}={패키지}, {패키지}, {패키지}, ...
    logging.level.{그룹 이름}={로그 레벨} 

  스프링 부트가 미리 정의해둔 로그 그룹
    web = 스프링 웹 MVC 관련 패키지 로그 그룹
    sql = 스프링 JDBC와 하이버네이트 SQL을 묶어둔 로그 그룹

  SQL 파라미터 출력하는 프로퍼티
    logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE

  참고: https://docs.spring.io/spring-boot/docs/2.1.17.RELEASE/reference/html/boot-features-logging.html#boot-features-custom-log-groups
  ---------------------------------------------
  로그의 기본은 info 이다.
  logging.level.web=xxx 는 기본으로 grouping 되어 있다.
  
 * */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
		
	}
}
