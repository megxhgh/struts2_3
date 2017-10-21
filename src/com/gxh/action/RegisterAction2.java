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
	
	//1,set��get����
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
	
	//2,����У��
	public void validate(){
		//��֤�û���
		if(username == null || "".equals(username)){
			this.addFieldError("username", "�û�������Ϊ�գ�");
		}else if(!Pattern.matches("\\w{6,20}", username.trim())){
			this.addFieldError("username", "�û�����������ĸ�����֣�����6-20֮�䣡");
		}
		
		//��֤����
		if(password == null || "".equals(password)){
			this.addFieldError("password", "���벻��Ϊ�գ�");
		}else if(!Pattern.matches("\\w{6,20}", username.trim())){
			this.addFieldError("password", "�����������ĸ�����֣�����6-20֮�䣡");
		}
		
		//��֤ȷ������������Ƿ���ͬ
		if(!repassword.equals(password)){
			this.addFieldError("repassword", "ȷ����������������ͬ��");
		}
		
		//��֤����
		if(age < 18 || age > 120){
			this.addFieldError("age", "���������18-120��֮�䣡");
		}
		
		//��֤��������
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		start.set(1900, 1,1);
		end.set(2017, 1,1);
		if(birth == null || "".equals(birth)){
			//this.addActionError("�������ڲ���Ϊ�գ�");
			this.addFieldError("birth", "�������ڲ���Ϊ�գ�");
		}else if((birth.after(end.getTime()) || birth.before(start.getTime()))){
			//this.addActionError("��������Ч�������ڣ�");
			this.addFieldError("birth", "��������Ч�������ڣ�");
		}
		
		//��֤����
		if(email == null || "".equals(email)){
			this.addFieldError("email", "���䲻��Ϊ�գ�");
		}else if(!Pattern.matches("[a-zA-Z][a-zA-Z0-9._-]*@([a-zA-Z0-9-_]+\\.)+(com|gov|net|com\\.cn|edu\\.cn)",
				email.trim())){
			this.addFieldError("email", "�������Ƿ���");
		}
	}
	
	//3,executeִ�з���
	public String execute(){
		return SUCCESS;
	}
}
