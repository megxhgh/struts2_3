package com.gxh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void validate(){	
		super.validate(); 
		//system.out.println(getUsername());
		if(getUsername() == null || "".equals(getUsername().trim())){	// 
			this.addFieldError("username", getText("username.required"));
		}
		if(getPassword() == null || "".equals(getPassword().trim())){
			this.addFieldError("password", getText("password.required"));
		}
	}
	public String execute(){
		LoginCheck lc = new LoginCheck();
		if(lc.isLogin(getUsername(), getPassword())){
			ActionContext.getContext().getSession().put("login", "true");
			return "success";
		}
		else{
			return "failure";
		}
	}
}
