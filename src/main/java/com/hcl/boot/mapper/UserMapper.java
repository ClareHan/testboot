package com.hcl.boot.mapper;

import org.apache.ibatis.annotations.Param;

import com.hcl.boot.proj.User;

public interface UserMapper {
	
	public User checkLogin(@Param("phone")String phone, @Param("password")String password);
	
	public User getUserBaseInfo(int id);
}
