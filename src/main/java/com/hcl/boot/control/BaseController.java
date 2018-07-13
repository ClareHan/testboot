package com.hcl.boot.control;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.boot.common.ResponseData;

@RestController
@RequestMapping("/")
public class BaseController {
	
	@RequestMapping("/")
	public String sayHello(String name){
		System.out.println(name);
		return name + ":" + new Date().toString();
	}
	
	@RequestMapping("/404")
	public ResponseData<Void> handlError(){
		return new ResponseData<Void>().error("错误");
	}
}
