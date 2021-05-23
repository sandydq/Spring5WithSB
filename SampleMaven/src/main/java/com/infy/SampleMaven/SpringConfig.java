package com.infy.SampleMaven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.infy.SampleMaven")
public class SpringConfig {
	
	@Bean
	@Scope(value = "prototype")
	public MobileService mobileService() {
		return new MobileService(822044355,"Samsung");
	}
	
	@Bean
	public MobileService mobileService1() {
		return new MobileService(12345,"3432523");
	}

}
