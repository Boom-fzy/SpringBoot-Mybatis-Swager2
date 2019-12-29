package com.lxw.g_Design.service;

import com.lxw.g_Design.model.PersonalInfoVO;
import com.lxw.g_Design.model.error.BusinessException;

public interface CustomerService {

	PersonalInfoVO login(String mobile, String password) throws BusinessException;

	void register(PersonalInfoVO personalInfoVO);

}
