package com.gxh.action;

public class LoginCheck {
	public boolean isLogin(String username,String password){
		if("tom".equals(username) && "123".equals(password)){
			return true;
		}
		else{
			return false;
		}
	}
}
