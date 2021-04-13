package com.xiaocheng.clothesmall.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Porder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String user;
    private String product;
    private String image;
    private Integer number;
    private Integer money;
    private String  iphone;
    private String address;
    private String status;
}
