package com.tripti.ecommerce.tripti_product_service.model;

import jakarta.persistence.*;

@Table(name = "REVIEW")
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="REVIEW_TEXT")
    private String reviewText;

    @Column(name="PRODUCT-RATING")
    private int rating;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
