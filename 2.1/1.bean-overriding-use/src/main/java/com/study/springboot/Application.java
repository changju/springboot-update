package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/*
3. 빈 오버라이딩 기본 설정 변경
(스프링 프레임워크가 아니라) 스프링 부트는 빈 등록 과정이 두 개.
  1. 애플리케이션에 정의한 빈 등록
  2. 자동설정이 제공하는 빈 등록 (spring.factories)
  
----------------------------------------------------------------------------------------------------
이때 1번에서 정의한 빈을 2번 과정에 등록하는 빈이 재정의(overriding) 할 수도 있는데, 스프링 부트 2.1 이전까지는 그런 기능을 기본으로 허용했지만 2.1 이후부터는 허용하지 않는다.

  자동 설정으로 등록하는 빈이 오버라이딩을 시도한 경우 아래 메시지 출력하며 애플리케이션 구동을 멈춤.
  
  ***************************
  APPLICATION FAILED TO START
  ***************************

  Description:

  The bean 'familyMan', defined in class path resource [me/whiteship/demofamiliymanprep/FamilyManAutoConfiguration.class], could not be registered. A bean with that name has already been defined in me.whiteship.demobootoverriding.App and overriding is disabled.

  Action:

  Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true

----------------------------------------------------------------------------------------------------
  프로퍼티를 변경해서 빈 오버라이딩을 허용할 수도 있다.
  spring.main.allow-bean-definition-overriding=true

    오버라이딩이 일어나지 않도록, 자동 설정을 제공하는 쪽에 @Condition* 애노테이션을 활용할 것
  @Configuration
  public class FamilyManAutoConfiguration {
      @Bean
      @ConditionalOnMissingBean
      public FamilyMan familyMan() {
        FamilyMan familyMan = new FamilyMan();
        familyMan.setName("whiteship");
        return familyMan;
      }
  }
----------------------------------------------------------------------------------------------------

 * */
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
			FamilyMan familyMan;
			
			@Override
			public void run(ApplicationArguments args) throws Exception {
				System.out.println("====================");
				System.out.println(familyMan.getName());
				System.out.println("====================");
			}
		};
	}

	// spring.main.allow-bean-definition-overriding=true 로 자동설정을 허용하도록 한다.
	// spring.main.allow-bean-definition-overriding=true 를 사용 하는 것 보다 @ConditionalOnMissingBean 을 사용하는게 더 좋은 선택이다.
	
	@Bean
	public FamilyMan familyMan() {
		FamilyMan familyMan = new FamilyMan();
		familyMan.setName("cjlee");
		return familyMan;
	}

}
