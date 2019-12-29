package com.lxw.g_Design.model;

public class JsonResult {
	
	private String status;
	private Object responseData;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getResponseData() {
		return responseData;
	}
	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}
	
	public static JsonResult getInstance(String status,Object responseData) {
		return new JsonResult(status, responseData);
		
	}
	public JsonResult(String status, Object responseData) {
		super();
		this.status = status;
		this.responseData = responseData;
	}

}
