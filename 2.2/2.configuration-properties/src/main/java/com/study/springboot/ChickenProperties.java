package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@AllArgsConstructor
@ConstructorBinding // Immutable 지원을 위해서, 생성자로 들어갈 수 있게 해준다.
@ConfigurationProperties(prefix = "chicken")
//@Component // or @EnableConfigurationProperties(ChickenProperties.class), or @ConfigurationPropertiesScan(2.2부터 추가)
public class ChickenProperties {
	
	private int count;
	private String name;
	private DataSize size;
	

}
