package com.tripti.ecommerce.tripti_product_service.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "CATEGORY")
@Entity
public class Category {

    @Id
    private Long id;
}
