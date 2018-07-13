package com.hcl.boot.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.boot.common.ResponseData;
import com.hcl.boot.proj.User;
import com.hcl.boot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/checkLogin")
	public ResponseData checkLogin(String phone, String md5pwd){
		User res = userService.checkLogin(phone, md5pwd);
		System.out.println(res);
		return new ResponseData<>().ok();
	}
	
	@RequestMapping("/getUserBase")
	public ResponseData<User> getUserBaseInfo(int id){
		System.out.println(id);
		User user = userService.getUserBaseInfo(id);
		System.out.println(user);
		return new ResponseData<User>().ok(user);
	}
}
