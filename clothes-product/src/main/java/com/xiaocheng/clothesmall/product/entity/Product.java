package com.xiaocheng.clothesmall.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer proid;
    private String kind;
    private String product;
    private String image;
    private Integer pirce;
    private String  introduce;
    private Integer number;
}
