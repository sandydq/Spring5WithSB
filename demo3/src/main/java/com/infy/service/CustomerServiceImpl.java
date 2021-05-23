package com.infy.service;

import com.infy.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Value("${dev.value}")
	private int count;
	@Autowired
	private CustomerRepository repository;

	public CustomerServiceImpl() {
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setRepository(CustomerRepository repository) {
		this.repository = repository;
	}

	public String fetchCustomer() {
		return repository.fetchCustomer(count);
	}

	public String createCustomer() {
		return repository.createCustomer();
	}

}
