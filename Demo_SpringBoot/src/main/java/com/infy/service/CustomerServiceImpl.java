package com.infy.service;
import com.DAO.CustomerRepository;
import com.DAO.UpdateCustomer;
import com.infy.service.CustomerService;
import com.model.CustomerDTO;
import com.sample.SampleClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

   private static Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
   // @Value("${value}")
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Autowired
    private SampleClass sampleClass;

    @Autowired
    private UpdateCustomer UpdateCustomer;

    @Autowired
    private CustomerRepository customerRepository;

    public String fetchCustomer() {
        logger.info("Inside fetch customer method");
        //count = customerRepository.fetchCustomer().size();
        return " The no of customers fetched are : " + count;
    }
    public String createCustomer(CustomerDTO request) {
        logger.info("Inside create customer method");
        customerRepository.createCustomer(request);
        return "Customer is successfully created";
    }

    @Override
    public String callingSample() {
        String result = sampleClass.sampleMethod();
        return result;
    }

    @Override
    public String updateService(String name) {
        return UpdateCustomer.update(name);
    }

    public List<CustomerDTO> fetchCustomerData() {
        logger.info("Inside fetch customer data method");
        return customerRepository.fetchCustomer();
    }
}
