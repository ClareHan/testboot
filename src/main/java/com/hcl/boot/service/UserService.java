package com.hcl.boot.service;

import com.hcl.boot.proj.User;

public interface UserService {
	
	public User checkLogin(String phone, String md5pwd);
	
	public User getUserBaseInfo(int id);
}
