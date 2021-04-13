package com.xiaocheng.clothesmall.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Xia {
    @Id
    private Integer id;
    private Integer proid;
    private String xia;
    private String xiaimage;
    private Integer xiamoney;
}
