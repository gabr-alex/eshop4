package eshop.service;

import eshop.domain.Order;
import eshop.domain.Product;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    void addOrder(Order order);
}
