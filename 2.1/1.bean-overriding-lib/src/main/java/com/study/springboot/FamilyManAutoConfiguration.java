package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
public class FamilyManAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public FamilyMan familyMan() {
		FamilyMan familyMan = new FamilyMan();
		familyMan.setName("cblee");
		return familyMan;
	}

}
