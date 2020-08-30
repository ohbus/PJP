package xyz.subho.spring.springbootjpah2.service;

import java.util.List;

import xyz.subho.spring.springbootjpah2.entity.Order;

/**
 * created by pc on Mar, 2020
 */
public interface IOrderService {


    Order createOrder(Order order);

    List<Order> getAllOrder();

    Order getOrderById(String id);

    boolean deleteOrderById(String id);
}
