package com.tripti.ecommerce.tripti_product_service.model;

import jakarta.persistence.*;

import javax.lang.model.element.Name;
import java.util.List;

@Table(name = "PRODUCT")
@Entity
public class Product {

    @Id
    private Long id;

    @Column(name = "PRODUCT_NAME")
    private String name;

    @Column(name="PRODUCT_DESCRIPTION")
    private String description;

    @Column(name="PRODUCT_PRICE")
    private Double price;

    @Column(name="PRODUCT_STOCK_QUANTITY")
    private Integer stockQuantity;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }


}
