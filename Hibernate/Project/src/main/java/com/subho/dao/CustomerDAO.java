package com.subho.dao;

import java.util.List;

import com.subho.model.Customer;

public interface CustomerDAO {
    List<Customer> getCustomers();
    void addCustomer(Customer customer);
    void deleteCustomer(int id);
    Customer getCustomerById(int id);
}
