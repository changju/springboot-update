package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/*
9. Actuator
  /info와 /health 엔드포인트가 스프링 시큐리티를 추가하더라도 기본적으로 “공개"하도록 변경 됨.
    스프링 부트 2.0.*에서는 스프링 시큐리티를 추가하면 모든 엔드포인트가 인증을 거쳐야 했음.
    물론, 스프링 시큐리티 설정을 추가해서 컨트롤 할 수 있음.

  /info 엔드포인트에 정보 추가하는 방법
    1. Info 키값에 들어있는 모든 프로퍼티
    2. git.properties 에 들어있는 프로퍼티
    3. META-INF/build-info.properties 에 들어있는 프로퍼티

  Info 키값에 프로퍼티 추가하기
    info.app.encoding=@project.build.sourceEncoding@
    info.app.java.version=@java.version@
    info.app.spring.vrsion=@spring-framework.version@
    info.app.name=Keesun's Spring Boot Update
      빌드 프로퍼티를 애플리케이션 프로퍼티로 맵핑하는 방법 메이븐은 @...@, 그래들은 ${...}

  Git 프로퍼티 생성하는 방법
    <build>
      <plugins>
          <plugin>
              <groupId>pl.project13.maven</groupId>
              <artifactId>git-commit-id-plugin</artifactId>
          </plugin>
      </plugins>
    </build>

  빌드 프로퍼티 생성하는 방법
  <build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <executions>
                <execution>
                    <goals>
                        <goal>build-info</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>

------------------------------------------------------
http://localhost:8080/actuator/health
http://localhost:8080/actuator/info

- spring boot 2.0 에서는 spring security 를 포함하면 health/info 같은 것또한 막혀버린다.
  spring boot 2.1 부터는 spring security 를 추가하더라 health/info 를 막지 않는다.
  

 * */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);

	}

}
