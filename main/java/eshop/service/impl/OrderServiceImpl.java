package eshop.service.impl;

import eshop.domain.Order;
import eshop.domain.repository.OrderRepository;
import eshop.domain.repository.ProductRepository;
import eshop.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public void addOrder(Order order) {
        orderRepository.addOrder(order);

    }
}
