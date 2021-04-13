package com.xiaocheng.clothesmall.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Qun {
    @Id
    private Integer id;
    private Integer proid;
    private String qun;
    private String qunimage;
    private Integer qunmoney;
}
