package com.lxw.g_Design.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.lxw.g_Design.mapper.PersonalInfoVOMapper;
import com.lxw.g_Design.model.PersonalInfoVO;
import com.lxw.g_Design.model.error.BusinessException;
import com.lxw.g_Design.model.error.ErrorCode;
import com.lxw.g_Design.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private PersonalInfoVOMapper personalInfoVOMapper;
	
	@Override
	public PersonalInfoVO login(String mobile, String password) throws BusinessException {
		// TODO Auto-generated method stub
		if(StringUtils.isEmpty(mobile)) {
			throw new BusinessException(ErrorCode.PARAMETER_VIOLATION_ERROR,"手机号码为空，请重新输入！");
		}
		if(StringUtils.isEmpty(password)) {
			throw new BusinessException(ErrorCode.PARAMETER_VIOLATION_ERROR, "密码为空，请重新输入！");
		}
		PersonalInfoVO personalInfoVO = personalInfoVOMapper.findByMobileAndPassword(mobile,password);
		if(personalInfoVO == null) {
			throw new BusinessException(ErrorCode.USER_LOGIN_ERROR);
		}
		return personalInfoVO;
	}

	@Override
	public void register(PersonalInfoVO personalInfoVO) {
		personalInfoVOMapper.insertSelective(personalInfoVO);
	}

}
