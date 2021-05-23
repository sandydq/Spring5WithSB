package com.infy.util;

import org.springframework.context.annotation.*;

import com.infy.repository.CustomerRepository;
import com.infy.service.CustomerServiceImpl;

@Configuration
@ComponentScan(basePackages = {"com.infy.service","com.infy.repository"})
@PropertySources({
        @PropertySource("classpath:dev.properties"),
        @PropertySource("classpath:int.properties")
})
public class SpringConfiguration {


}
