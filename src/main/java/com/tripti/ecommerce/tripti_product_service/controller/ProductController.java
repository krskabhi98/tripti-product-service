package com.tripti.ecommerce.tripti_product_service.controller;

import com.tripti.ecommerce.tripti_product_service.model.Product;
import com.tripti.ecommerce.tripti_product_service.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping("/product/get_all_products")
    public List<Product> getAllProduct(){

        return productService.getAllProducts();
    }
}
