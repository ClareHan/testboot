package com.hcl.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.boot.mapper.UserMapper;
import com.hcl.boot.proj.User;
import com.hcl.boot.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User checkLogin(String phone, String md5Pwd) {
		return userMapper.checkLogin(phone, md5Pwd);
	}

	@Override
	public User getUserBaseInfo(int id) {
		return userMapper.getUserBaseInfo(id);
	}

}
