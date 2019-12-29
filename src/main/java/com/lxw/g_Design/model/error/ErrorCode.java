package com.lxw.g_Design.model.error;

public enum ErrorCode implements ResException{
	
	//参数相关错误
	PARAMETER_VIOLATION_ERROR("00001","参数不合法"),
	
	//用户相关错误
	USER_LOGIN_ERROR("10001","手机号或者密码不正确，请重新输入！")
	
	;
	private String errCode;
	private String errMsg;
	private ErrorCode(String errCode,String errMsg){
		this.errCode = errCode;
		this.errMsg = errMsg;
	}
	
	@Override
	public String getErrCode() {
		return this.errCode;
	}
	@Override
	public String getErrMsg() {
		return this.errMsg;
	}
	@Override
	public ResException setErrMsg(String errMsg) {
		this.errMsg = errMsg;
		return this;
	}
}
