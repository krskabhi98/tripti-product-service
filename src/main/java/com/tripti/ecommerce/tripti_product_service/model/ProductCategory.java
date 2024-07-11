package com.tripti.ecommerce.tripti_product_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "PRODUCT_CATEGORY")
@Entity
public class ProductCategory {

    @Id
    @GeneratedValue()
    private Long id;


}
