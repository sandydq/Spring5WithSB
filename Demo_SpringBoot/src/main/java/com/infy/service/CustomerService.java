package com.infy.service;

import com.model.CustomerDTO;

public interface CustomerService {
    public String fetchCustomer();
    public String createCustomer(CustomerDTO request);
    public String callingSample();
    public String updateService(String name);
}
