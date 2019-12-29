package com.lxw.g_Design.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxw.g_Design.model.JsonResult;
import com.lxw.g_Design.model.error.BusinessException;

/**
 * 异常返回
 * @author 11099
 *
 */
public class BaseController {
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public JsonResult dealHandler(Exception exception) {
		
		Map<String, String> errorMap = new HashMap<String, String>();
		
		if(exception instanceof BusinessException) {
			errorMap.put("errCode", ((BusinessException) exception).getErrCode());
			errorMap.put("errMsg", ((BusinessException) exception).getErrMsg());
		}else {
			errorMap.put("errCode", "00000");
			errorMap.put("errMsg", "未知错误！请联系Java开发人员！");
		}
		return JsonResult.getInstance("fail", errorMap);
	}
	
}
