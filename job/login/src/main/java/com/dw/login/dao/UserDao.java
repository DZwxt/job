package com.dw.login.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import domain.UserDO;

@Mapper
public interface UserDao {

	/**
	 * 根据用户名查询所有的用户
	 * @param username
	 * @return
	 */
	List<UserDO> list(Map<String, Object> params);
}
