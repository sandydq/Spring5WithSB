package com.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class UpdateCustomerImpl implements UpdateCustomer {
    @Override
    public String update(String name) {
        String result = "update successful for name "+ name;
        return result;
    }
}
