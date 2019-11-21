package com.spring.demo.service;

import com.spring.demo.model.Customer;
import com.spring.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public Customer readCustomer(){

        return customerRepository.readCustomer();
    }
}
