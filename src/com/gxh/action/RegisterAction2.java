package com.gxh.action;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RegisterAction2 extends ActionSupport{
	private String username;
	private String password;
	private String repassword;
	private int age;
	private Date birth;
	private String email;
	
	//1,set和get方法
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
	
	//2,输入校验
	public void validate(){
		//验证用户名
		if(username == null || "".equals(username)){
			this.addFieldError("username", "用户名不能为空！");
		}else if(!Pattern.matches("\\w{6,20}", username.trim())){
			this.addFieldError("username", "用户名必须是字母和数字，长度6-20之间！");
		}
		
		//验证密码
		if(password == null || "".equals(password)){
			this.addFieldError("password", "密码不能为空！");
		}else if(!Pattern.matches("\\w{6,20}", username.trim())){
			this.addFieldError("password", "密码必须是字母和数字，长度6-20之间！");
		}
		
		//验证确认密码和密码是否相同
		if(!repassword.equals(password)){
			this.addFieldError("repassword", "确认密码和密码必须相同！");
		}
		
		//验证年龄
		if(age < 18 || age > 120){
			this.addFieldError("age", "年龄必须在18-120岁之间！");
		}
		
		//验证出生日期
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
		
		//验证邮箱
		if(email == null || "".equals(email)){
			this.addFieldError("email", "邮箱不能为空！");
		}else if(!Pattern.matches("[a-zA-Z][a-zA-Z0-9._-]*@([a-zA-Z0-9-_]+\\.)+(com|gov|net|com\\.cn|edu\\.cn)",
				email.trim())){
			this.addFieldError("email", "邮箱名非法！");
		}
	}
	
	//3,execute执行方法
	public String execute(){
		return SUCCESS;
	}
}
