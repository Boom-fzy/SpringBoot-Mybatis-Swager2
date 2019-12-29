package com.lxw.g_Design.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.lxw.g_Design.model.PersonalInfoVO;

@Mapper
public interface PersonalInfoVOMapper {
    int insert(PersonalInfoVO record);

    int insertSelective(PersonalInfoVO record);

	PersonalInfoVO findByMobileAndPassword(String mobile, String password);
}