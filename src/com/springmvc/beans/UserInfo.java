package com.springmvc.beans;

import java.util.Arrays;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UserInfo {
	private String userId;
	private String userName;
	private String passWord;
	private String[] userXq;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date userTime;
	
	public Date getUserTime() {
		return userTime;
	}
	public void setUserTime(Date userTime) {
		this.userTime = userTime;
	}
	public String[] getUserXq() {
		return userXq;
	}
	public void setUserXq(String[] userXq) {
		this.userXq = userXq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", passWord=" + passWord + ", userXq="
				+ Arrays.toString(userXq) + ", userTime=" + userTime + "]";
	}
	
	
	
}
