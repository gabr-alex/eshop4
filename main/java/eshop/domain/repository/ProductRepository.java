package eshop.domain.repository;

import eshop.domain.Product;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;


public interface ProductRepository {

    List<Product> getAllProducts();

    void addProduct(Product product);
}
