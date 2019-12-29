package com.lxw.g_Design.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lxw.g_Design.model.JsonResult;
import com.lxw.g_Design.model.PersonalInfoVO;
import com.lxw.g_Design.model.error.BusinessException;
import com.lxw.g_Design.service.CustomerService;

import io.swagger.annotations.ApiOperation;

/**
 * 用户管理
 * @author 11099
 *
 */
@RestController
@RequestMapping(value="/customer")
public class CustomerRestController extends BaseController {
	
	@Autowired
	private CustomerService customerService;
	
	/**
	 * 用户登录
	 * @param mobile
	 * @param password
	 * @return
	 * @throws BusinessException
	 */
	@ApiOperation(value="用户登录",notes="输入手机号码和密码进行登录")
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public JsonResult login(@RequestParam(value="phone",required=true) String mobile,
							@RequestParam(value="password",required=true) String password) throws BusinessException {
		PersonalInfoVO personalInfoVO = customerService.login(mobile,password);
		return JsonResult.getInstance("success", personalInfoVO);
	}
	
	/**
	 * 用户注册
	 * @param personalInfoVO
	 * @return
	 */
	@ApiOperation(value="用户注册",notes="输入用户相关信息进行注册")
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public JsonResult register(PersonalInfoVO personalInfoVO) {
		
		customerService.register(personalInfoVO);
		
		return JsonResult.getInstance("success", "用户注册成功");
		
	}
	
}
