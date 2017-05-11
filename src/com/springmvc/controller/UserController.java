package com.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.beans.UserInfo;

@Controller
@RequestMapping("/user")
public class UserController {
	// 如何传递参数
	@RequestMapping(value = "/add.do")
	public String add(UserInfo user, String passWord) {
		System.out.println(user);
		return "useradd";
	}

//	/**
//	 * 时间属性编辑器
//	 * */
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		CustomDateEditor cust = new CustomDateEditor(sdf, true);
//		binder.registerCustomEditor(Date.class, cust);
//	}
}
