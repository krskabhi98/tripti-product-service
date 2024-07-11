package com.tripti.ecommerce.tripti_product_service.service;

import com.tripti.ecommerce.tripti_product_service.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    IProductRepository productRepository;

    @Override
    public List getAllProducts() {
        return productRepository.getAllProductsFromRepository();
    }
}
