package com.subho.dao;

import com.subho.model.Customer;
import com.subho.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateCustomerDAO implements CustomerDAO {

    @Override
    public List<Customer> getCustomers() {
        Session currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
        currentSession.beginTransaction();
        Query<Customer> query = currentSession.createQuery("from Customer order by lastName", Customer.class);
        List<Customer> customers = query.getResultList();
        currentSession.getTransaction().commit();
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        Session currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
        currentSession.beginTransaction();
        System.out.println(customer);
        currentSession.saveOrUpdate(customer);
        currentSession.getTransaction().commit();
    }

    @Override
    public void deleteCustomer(int id) {
        Session currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
        currentSession.beginTransaction();
        Query query = currentSession.createQuery("delete from Customer where id=:customerId");
        query.setParameter("customerId", id);
        query.executeUpdate();
        currentSession.getTransaction().commit();
    }

    @Override
    public Customer getCustomerById(int id) {
        Session currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
        currentSession.beginTransaction();
        Customer customer = currentSession.get(Customer.class, id);
        currentSession.getTransaction().commit();
        return customer;
    }
}
