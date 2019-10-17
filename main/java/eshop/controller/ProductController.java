package eshop.controller;


import eshop.domain.Product;
import eshop.domain.repository.ProductRepository;

import eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("market")
public class ProductController {

    @Autowired
    private List<Product> getProducts;

    @RequestMapping("/products")
    public String productList(Model model) {

        model.addAttribute("produktai", getProducts);
        return "product";
    }


    @RequestMapping(value = "/products/add", method = RequestMethod.GET)
    public String getAddNewProductForm(Model model, @ModelAttribute("newProduct") Product newProduct) {
        return "addProduct";
    }

    @RequestMapping(value = "/products/add", method = RequestMethod.POST)
    public String processAddNewProductForm(@ModelAttribute("newProduct") Product newProduct, BindingResult resul, HttpServletRequest requestt) {

        getProducts.add(newProduct);
        return "redirect:/market/products";
    }

}
