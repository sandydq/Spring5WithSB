package com.infy.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.infy.service")
@PropertySource("classpath:dev.properties")
public class SpringConfiguration {

}
