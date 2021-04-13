package com.markerhub.shiro;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountProfile implements Serializable {

    private Integer id;

    private String iphone;
    private String password;
    private String userimage;
    private String name;

    private String adress;

}
