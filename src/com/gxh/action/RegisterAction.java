package com.gxh.action;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport{
	private String username;
	private String password;
	private String repassword;
	private int age;
	private Date birth;
	private String email;
	
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
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*
	public void validate(){
		super.validate();
		//用户名校验
		if(username == null || "".equals(username)){
			//this.addActionError("用户名不能为空！");
			this.addFieldError("username", "用户名不能为空！");
		}else if(!Pattern.matches("\\w{6,20}", username.trim())){
			//this.addActionError("用户名必须是字母和数字，长度为6到20之间");
			this.addFieldError("username", "用户名必须是字母和数字，长度为6到20之间");
		}
		//密码校验
		if(password == null || "".equals(password)){
			//this.addActionError("密码不能为空！");
			this.addFieldError("password", "密码不能为空！");
		}else if(!Pattern.matches("\\w{6,20}", password.trim())){
			//this.addActionError("密码必须是字母和数字，长度为6到20之间");
			this.addFieldError("password", "密码必须是字母和数字，长度为6到20之间");
		}
		//确认密码校验
		if(repassword == null || "".equals(repassword)){
			//this.addActionError("确认密码不能为空！");
			this.addFieldError("repassword", "确认密码不能为空！");
		}
		else if(!Pattern.matches("\\w{6,20}", repassword.trim())){
			//this.addActionError("确认密码必须是字母和数字，长度为6到20之间");
			this.addFieldError("repassword", "确认密码必须是字母和数字，长度为6到20之间！");
		}
		//密码和确认密码校验
		if(password != null && repassword != null && !password.equals(repassword)){
			this.addActionError("密码和确认密码必须相同！");
			
		}
		
		//年龄校验
		if(age < 18 || age >100){
			//this.addActionError("请输入有效年龄，年龄必须在18以上！");
			this.addFieldError("age", "请输入有效年龄，年龄必须在18以上！");
		}
		//出生日期校验
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		start.set(1900, 1,1);
		end.set(2017, 1,1);
		if(birth == null || "".equals(birth)){
			//this.addActionError("出生日期不能为空！");
			this.addFieldError("birth", "出生日期不能为空！");
		}else if((birth.after(end.getTime()) || birth.before(start.getTime()))){
			//this.addActionError("请输入有效出生日期！");
			this.addFieldError("birth", "请输入有效出生日期！");
		}
		//邮箱校验
		if(email == null || "".equals(email)){
			//this.addActionError("邮箱不能为空！");
			this.addFieldError("email", "邮箱不能为空！");
		}else if(email != null && !"".equals(email) && !Pattern.matches
				("[a-zA-Z][a-zA-Z0-9._-]*@([a-zA-Z0-9-_]+\\.)+(com|gov|net|com\\.cn|edu\\.cn)", email)){
			//this.addActionError("请输入正确的邮箱地址！");
			this.addFieldError("email", "请输入正确的邮箱地址！");
		}
		
	}
	*/
	public String execute(){
		return SUCCESS;
	}
}
