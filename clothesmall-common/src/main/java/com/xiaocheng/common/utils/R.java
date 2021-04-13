/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.xiaocheng.common.utils;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

//统一返回结果的类
@Data
public class R {

	@ApiModelProperty(value = "是否成功")
	private Boolean success;
	@ApiModelProperty(value = "返回码")
	private Integer code;
	@ApiModelProperty(value = "返回消息")
	private String message;
	@ApiModelProperty(value = "返回数据")
	private Map<String, Object> data = new HashMap<String, Object>();

	//把构造方法私有
	private R() {}

	//成功静态方法
	public static R ok() {
		R r = new R();
		r.setSuccess(true);
		r.setCode(ResultCode.SUCCESS);
		r.setMessage("成功");
		return r;
	}

	//失败静态方法
	public static R error() {
		R r = new R();
		r.setSuccess(false);
		r.setCode(ResultCode.ERROR);
		r.setMessage("失败");
		return r;
	}

	public R success(Boolean success){
		this.setSuccess(success);
		return this;
	}

	public R message(String message){
		this.setMessage(message);
		return this;
	}

	public R code(Integer code){
		this.setCode(code);
		return this;
	}

	public R data(String key, Object value){
		this.data.put(key, value);
		return this;
	}

	public R data(Map<String, Object> map){
		this.setData(map);
		return this;
	}
}



/**
 * 返回数据
 *
 * @author Mark sunlightcs@gmail.com
 */
