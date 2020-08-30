package xyz.subho.spring.springbootjpah2.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import xyz.subho.spring.springbootjpah2.entity.Order;
import xyz.subho.spring.springbootjpah2.service.IOrderService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * created by pc on Mar, 2020
 */
@RunWith(SpringRunner.class)
@WebMvcTest(OrderController.class)
public class OrderControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private IOrderService orderService;

    @Test
    public void getAllOrderAPI() throws Exception {

        List<Order> orderList = new ArrayList<>();
        Order order = new Order();
        order.setId("1");
        order.setDescription("order_desc");
        orderList.add(order);

        when(orderService.getAllOrder()).thenReturn(orderList);
        mvc.perform(MockMvcRequestBuilders
                .get("/api/order")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[*].id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[*].id").isNotEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[*].id").value("1"));
    }
}
