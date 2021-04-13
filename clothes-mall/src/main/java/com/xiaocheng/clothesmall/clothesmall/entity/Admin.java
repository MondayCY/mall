package com.xiaocheng.clothesmall.clothesmall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Admin {
    @Id
    private String id;
    private String pwd;

}
