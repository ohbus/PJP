package com.subho.servlet;

import com.subho.model.Customer;
import com.subho.service.CustomerService;
import com.subho.service.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/customer/update")
public class UpdateCustomerServlet extends HttpServlet {

    private CustomerService customerService = new CustomerServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("customerId");
        Customer customer = customerService.getCustomerById(Integer.parseInt(id));
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("/WEB-INF/view/customer-form.jsp").forward(request,response);
    }
}
