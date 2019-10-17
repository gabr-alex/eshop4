package eshop.domain.repository.impl;


import eshop.domain.Order;
import eshop.domain.Product;
import eshop.domain.repository.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryOrderRepository implements OrderRepository {

    List<Order> createOrders;

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public void addOrder(Order order) {

    }
}
