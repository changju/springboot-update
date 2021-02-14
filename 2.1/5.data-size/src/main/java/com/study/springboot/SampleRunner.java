package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;


@Component
public class SampleRunner implements ApplicationRunner{

	@Value("${chickenSize}")
	private DataSize chickenSize;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("======================");
		System.out.println(chickenSize);
		System.out.println(chickenSize.toMegabytes());
		System.out.println("======================");
		
	}

}
