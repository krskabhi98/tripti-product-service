package com.tripti.ecommerce.tripti_product_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "PRODUCT")
@Entity
public class Product {

    @Id
    private Long id;

    private String name;

    private String description;
}
