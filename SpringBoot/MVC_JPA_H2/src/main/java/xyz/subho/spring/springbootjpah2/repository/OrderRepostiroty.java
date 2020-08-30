package xyz.subho.spring.springbootjpah2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import xyz.subho.spring.springbootjpah2.entity.Order;

/**
 * created by niraj on Jul, 2018
 */
@Repository
public interface OrderRepostiroty extends CrudRepository<Order, String> {

}
