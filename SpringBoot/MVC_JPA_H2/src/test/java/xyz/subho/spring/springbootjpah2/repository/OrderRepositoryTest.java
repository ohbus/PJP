package xyz.subho.spring.springbootjpah2.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import xyz.subho.spring.springbootjpah2.entity.Order;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * created by pc on Mar, 2020
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class OrderRepositoryTest {

    @Autowired
    private OrderRepostiroty orderRepostiroty;


    @Test
    public void test_SaveOrder() {

        Order order = new Order();
        order.setId("1");
        order.setDescription("desc");
        order.setName("name");
        orderRepostiroty.save(order);

        Order savedOrder = orderRepostiroty.findById("1").get();

        assertNotNull(savedOrder);
        assertEquals(savedOrder.getName(), order.getName());
    }

    @Test(expected = NoSuchElementException.class)
    public void test_OrderIsNotPresent() {

        Order order = new Order();
        order.setId("1");
        order.setDescription("desc");
        order.setName("name");
        orderRepostiroty.save(order);

        orderRepostiroty.findById("2").get();
    }

}
