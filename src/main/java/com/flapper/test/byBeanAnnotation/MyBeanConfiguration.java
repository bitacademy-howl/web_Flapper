package com.flapper.test.byBeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.flapper.test.BeanClassInterface.MyBeanInterface;
import com.flapper.test.BeanClassInterface.Mybean;



@Configuration
public class MyBeanConfiguration {
	
	@Bean
	public MyBeanInterface MyBean() {
		return new Mybean("어노테이션에 의한 bean 객체의 text");
	}
}
