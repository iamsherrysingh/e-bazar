package com.ebazar.catalog.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "product_name")
    String productName;

    @Column(name = "product_description")
    String productDescription;

    @Column(name = "product_image")
    String productImage;

    @Column(name = "price")
    double price;
}
