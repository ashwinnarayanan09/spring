package com.spring.demo.repository;

import com.spring.demo.model.Address;
import com.spring.demo.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

    public Customer readCustomer(){

        Customer customer = new Customer();
        customer.setFirstName("Ashwin");
        customer.setLastName("Narayanan");

        Address address = new Address();
        address.setStreet("Hagalundsgatan 18");
        address.setCity("Stockholm");
        customer.setAddress(address);

        return customer;
    }
}
