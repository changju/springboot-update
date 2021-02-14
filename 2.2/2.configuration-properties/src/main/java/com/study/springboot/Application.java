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
13. @ConfigurationProperties 개선
  - @ConfigurationPropertiesScan
      스프링 부트 2.2부터 @ConfigurationProperties를 스캔해서 빈으로 등록하는 기능을 제공한다.
        @SpringBootApplication에 추가로 선언하면 편하다.
        
      @SpringBootApplication
      @ConfigurationPropertiesScan
      public class DemoSpringboot22Application {
      ...
      }

  - Immutable @ConfigurationProperties 지원 (불변 되지 않게, 변경되지 않게)
    세터(setter)가 아닌 생성자를 사용해서 프로퍼티를 바인딩할 수 있는 기능을 지원한다.
      - @ConfigurationPropertiesScan 또는 @EnableConfigurationProperties를 통해 빈으로 만드는 경우에만 동작한다. 그밖에 다른 방법을 사용해서 빈으로 등록할 때는 적용되지 않는다.
      - 생성자가 여러개일 경우에는 바인딩에 사용할 생성자에 @ConstructorBinding을 추가해야 한다.
      - 롬복과 같이 사용한다면?

    @ConstructorBinding
    @ConfigurationProperties(prefix = "chicken")
    @Getter
    @AllArgsConstructor
    public class ChickenProperties {
        private int count;
        private String name;
        private DataSize size;

    }

    참고
    https://docs.spring.io/spring-boot/docs/2.2.0.RELEASE/reference/html/spring-boot-features.html#boot-features-external-config-constructor-binding
 
 * */
@ConfigurationPropertiesScan
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);

	}

	@Bean
	public ApplicationRunner applicationRunner() {
		return new ApplicationRunner() {

			@Autowired 
			ChickenProperties chickenProperties;
			
			@Override
			public void run(ApplicationArguments args) throws Exception {
				System.out.println(chickenProperties.getName());
				System.out.println(chickenProperties.getCount());
				System.out.println(chickenProperties.getSize());
				
				
			}

		};
	}

}
