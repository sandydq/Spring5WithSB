package com.infy;


import com.infy.service.CustomerServiceImpl;
import com.model.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication(scanBasePackages = {"com.infy","com.sample","com.DAO"})
//@PropertySource("classpath:infyTel.properties")
//@Configuration
//@ComponentScan(basePackages = {"com.infy","com.sample","com.DAO"})
//@EnableAutoConfiguration
@RestController
@ImportResource(value = "classpath:applicationContext.xml")
public class DemoSpringBootApplication {

	@Autowired
	Environment env;

	@Autowired
	@Qualifier(value = "employee")
	CustomerServiceImpl customerServiceImpl;

	public static void main(String[] args) {
		AbstractApplicationContext context = (AbstractApplicationContext)
				SpringApplication.run(DemoSpringBootApplication.class,args);
//		CustomerServiceImpl customerServiceImpl = context.getBean("customerService",CustomerServiceImpl.class);
//		String result = customerServiceImpl.callingSample();
//		String update = customerServiceImpl.updateService("Sandy");
//		System.out.println(result);
//		System.out.println(update);
		for (String i : context.getBeanDefinitionNames()) {
			System.out.println(i);
		}

	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		System.out.println("Welcome to CommandLineRunner");
//		System.out.println(env.getProperty("sample"));
//
//	}

	@RequestMapping("/")
	public Employee home() {
		Employee employee = new Employee();
		employee.setName("Sandy");
		employee.setAge(22);
		return employee;
	}

	@RequestMapping("/fetchCount")
	public String sampleMapping() {
		return customerServiceImpl.fetchCustomer();
	}

	@RequestMapping("/fetchCustomer")
	public List<CustomerDTO> fetchCustomer() {
		return customerServiceImpl.fetchCustomerData();
	}

	@RequestMapping("/createCustomer")
	public String createCustomer() {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setName("sandy");
		customerDTO.setEmail("psanthosh1998@gmail.com");
		customerDTO.setAddress("Chennai");
		customerDTO.setPhoneNo(8220844355L);
		return customerServiceImpl.createCustomer(customerDTO);
	}
}
