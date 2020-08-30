package com.subho.service;

import java.util.List;

import com.subho.model.Customer;

public interface CustomerService {
    List<Customer> getCustomers();
    void addCustomer(Customer customer);
    void deleteCustomer(int id);
    Customer getCustomerById(int id);
}
