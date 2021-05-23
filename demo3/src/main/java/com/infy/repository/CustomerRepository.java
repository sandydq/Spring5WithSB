package com.infy.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

	@Value("${int.value}")
	private int counting;

	public String fetchCustomer(int count) {
		return " The no of customers fetched are : " + count+" "+counting;
	}

	public String createCustomer() {
		return "Customer is successfully created";
	}

}
