package eshop.config;


import eshop.domain.Order;
import eshop.domain.Product;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("eshop")

public class RootApplicationContextConfig {

    @Bean
    public List<Product> createProducts(){

        List<Product> products = new ArrayList<>();
        products.add(new Product("e36a", "Dakar Yellow"));
        products.add(new Product("e36b", "Techno Violet Metallic"));
        products.add(new Product("e36c", "Santorin Blue"));

        return products;
    }

    @Bean
    public List<Product> getProducts(){

        return createProducts();
    }

    @Bean
    List<Order> getOrders(){

        List<Order> orderList = new ArrayList<>();


        return orderList; // cia as noreciau kad jis man returnintu i duomenu baze
    }
    @Bean
    public SessionFactory factory(){
        SessionFactory factory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();

        return factory;
    }

}
