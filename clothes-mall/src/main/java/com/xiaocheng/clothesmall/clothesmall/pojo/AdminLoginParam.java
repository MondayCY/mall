package com.xiaocheng.clothesmall.clothesmall.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AdminLoginParam {
    private String id;
    private String pwd;

}
