package com.subho.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.subho.service.CustomerService;
import com.subho.service.CustomerServiceImpl;

import java.io.IOException;

@WebServlet("/customer/delete")
public class DeleteCustomerServlet extends HttpServlet {

    private CustomerService customerService = new CustomerServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("customerId");
        customerService.deleteCustomer(Integer.parseInt(id));
        response.sendRedirect("/customer/list");
    }
}
