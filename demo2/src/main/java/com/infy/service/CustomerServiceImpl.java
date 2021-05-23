package com.infy.service;

import com.infy.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService{
	@Value("${value}")
	private int count;
	@Autowired
	private CustomerRepository repository;




	public String fetchCustomer() {
		return repository.fetchCustomer(count);
	}

	public String createCustomer() {
		return repository.createCustomer();
	}

}
