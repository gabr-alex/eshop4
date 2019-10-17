package eshop.domain.repository;

import eshop.domain.Order;
import eshop.domain.Product;

import java.util.List;

public interface OrderRepository {

    List<Order> getAllOrders();

    void addOrder(Order order);
}
