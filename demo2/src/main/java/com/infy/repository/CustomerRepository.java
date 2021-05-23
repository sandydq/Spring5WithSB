package com.infy.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

	public String fetchCustomer(int count) {
		return " The no of customers fetched are : " + count;
	}

	public String createCustomer() {
		return "Customer is successfully created";
	}

}
