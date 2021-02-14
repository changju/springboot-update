package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/*
14. Actuator, health 엔드 포인트 변경
  -Health 엔드포인트
    애플리케이션의 상태 점검 용도로 사용할 수 있다.
    HealthContributor를 사용해서 커스텀한 Health 체크를 추가할 수 있다.
    스프링 부트가 기본으로 다양한 구현체를 제공하고 있다.
    Management.endpoint.health.show-details 또는 management.endpoint.health.show-components를 통해 구체적인 정보를 출력할 수 있다.
    
  -스프링 부트 2.2에서 변경 사항
    /actuator/health 엔드포인트 응답이 details 에서 components로 바뀜
        Actuator 버전 헤더를 사용해서 이전 버전의 응답을 받을 수도 있다.
    curl -H "Accept: application/vnd.spring-boot.actuator.v3+json" http://localhost:8080/actuator/health

  -Health 그룹  ( HealthEndpointProperties )
    여러 HealthIndicator를 묶어서 설정할 수 있는 기능 스프링 부트 2.1에서 소개한 “로그 그룹”과 비슷하다.
      management.endpoint.health.group.server.include=db,ping
      management.endpoint.health.group.server.show-details=always
      Rquest: http://localhost:8080/actuator/health/server 로 요청이 가능해진다.

  참고: https://docs.spring.io/spring-boot/docs/2.2.0.RELEASE/reference/html/production-ready-features.html#production-ready-health
 * */
@ConfigurationPropertiesScan
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);

	}



}
