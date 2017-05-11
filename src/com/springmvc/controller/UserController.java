package com.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.beans.UserInfo;

@Controller
@RequestMapping("/user")
public class UserController {
	//	如何传递参数
	@RequestMapping(value="/add.do")
	public String add(UserInfo user,String passWord){
		System.out.println(user);
		return "useradd";
	}
}
