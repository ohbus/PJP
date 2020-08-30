package com.subho.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.subho.model.Customer;

public class HibernateUtil {

    private static SessionFactory factory;

    private HibernateUtil() {}

    public static synchronized SessionFactory getSessionFactory() {
        if (factory == null) {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Customer.class)
                    .buildSessionFactory();
        }
        return factory;
    }
}