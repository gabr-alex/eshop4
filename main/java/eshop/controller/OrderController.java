package eshop.controller;


import eshop.domain.Order;
import eshop.domain.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private List<Order> getOrders;

    @Autowired
    SessionFactory factory;

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String getAddNewProductForm(Model model, @ModelAttribute("newOrder") Order newOrder) {

        return "addOrder"; // cia JSP failo pav!!!!!
    }

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public String processAddNewProductForm(@ModelAttribute("newOrder") Order newOrder) {

        getOrders.add(newOrder);
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(newOrder);
        session.getTransaction().commit();
        return "redirect:/market/products";
    }
}
