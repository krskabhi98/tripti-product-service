package com.tripti.ecommerce.tripti_product_service.repository;

import com.tripti.ecommerce.tripti_product_service.model.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository implements IProductRepository{

    @Autowired
    EntityManager entityManager;

    @Override
    public List getAllProductsFromRepository() {
        Query nativeQuery = entityManager.createNativeQuery("select * from PRODUCT", Product.class);

        return nativeQuery.getResultList();
    }
}
