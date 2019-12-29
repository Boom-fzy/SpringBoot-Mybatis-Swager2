package com.lxw.g_Design.model.error;

public class BusinessException extends Exception implements ResException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9117429501421634126L;
	
	private ResException resException;
	
	public BusinessException(ResException exception) {
		super();
		this.resException = exception;
	}
	
	public BusinessException(ResException exception,String errMsg) {
		super();
		this.resException = exception;
		this.resException.setErrMsg(errMsg);
	}
	
	@Override
	public String getErrCode() {
		return this.resException.getErrCode();
	}

	@Override
	public String getErrMsg() {
		return this.resException.getErrMsg();
	}

	@Override
	public ResException setErrMsg(String errMsg) {
		this.resException.setErrMsg(errMsg);
		return this;
	}
	
}
