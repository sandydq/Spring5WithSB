package com.DAO;


import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

import com.model.CustomerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;


@Repository
@Scope(value = "prototype")
public class CustomerRepository {
    private static final Logger logger = LoggerFactory.getLogger(CustomerRepository.class);
    List<CustomerDTO> customers = null;
    //Equivalent/similar to constructor. Here, populates the DTOs in a hard-coded way
    @Value("${value}")
    private String count;
    @PostConstruct
    public void initializer()
    {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setAddress("Chennai");
        customerDTO.setName("Jack");
        customerDTO.setEmail("Jack@infy.com");
        customerDTO.setPhoneNo(9951212222l);
        customers = new ArrayList<>();
        customers.add(customerDTO);
    }

    //adds the received customer object to customers list
    public void createCustomer(CustomerDTO customerDTO)
    {
        customers.add(customerDTO);
    }

    //returns a list of customers
    public List<CustomerDTO> fetchCustomer()
    {
        logger.info("Inside customer repository method "+ count);
        return customers;
    }
}

