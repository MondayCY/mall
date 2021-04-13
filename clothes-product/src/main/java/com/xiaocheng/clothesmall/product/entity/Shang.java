package com.xiaocheng.clothesmall.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Shang {
    @Id
    private Integer id;
    private Integer proid;
    private String shang;
    private String shangimage;
    private Integer money;
}
