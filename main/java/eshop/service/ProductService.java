package eshop.service;

import eshop.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import eshop.domain.Product;



public interface ProductService {

    List<Product> getAllProducts();

    void addProduct(Product product);
}
