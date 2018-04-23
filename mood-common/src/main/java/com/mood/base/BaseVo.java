package com.mood.base;

import com.mood.common.HttpCode;

import java.io.Serializable;

/**
 * 应用模块
 * @author chaiwei
 * @time 2018-01-07 下午08:00
 */
public class BaseVo implements Serializable {

	private static final long serialVersionUID = 1L;

	protected int code;

	protected String msg;
	
	public BaseVo(){}
	
	public BaseVo(HttpCode errorEnum){
		this.code=errorEnum.getCode();
		this.msg=errorEnum.getMsg();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	

}
