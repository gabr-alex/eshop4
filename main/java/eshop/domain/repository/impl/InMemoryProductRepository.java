package eshop.domain.repository.impl;

import eshop.domain.Product;
import eshop.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observer;

@Repository
public class InMemoryProductRepository implements ProductRepository {


        List<Product> createProducts;

        @Override
        public List<Product> getAllProducts() {
            return null;
        }

    @Override
    public void addProduct(Product product) {

    }


}







