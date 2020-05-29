package com.kycb.demo.Pojo;

import java.util.Date;

public class MyJson {
	private int code;
	private String message;
	private Object data;
	private Date timeStamp;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public MyJson(Object data, String message) {
		super();
		this.code = 100;
		this.message = message;
		this.data = data;
		this.timeStamp = new Date();
	}

	public MyJson(int code, String message) {
		super();
		this.code = code;
		this.message = message;
		this.timeStamp = new Date();
	}

}
