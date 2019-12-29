package com.lxw.g_Design.model.error;

public interface ResException {
	
	String getErrCode();
	String getErrMsg();
	ResException setErrMsg(String errMsg);
	
}
