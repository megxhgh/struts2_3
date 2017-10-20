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
		//�û���У��
		if(username == null || "".equals(username)){
			//this.addActionError("�û�������Ϊ�գ�");
			this.addFieldError("username", "�û�������Ϊ�գ�");
		}else if(!Pattern.matches("\\w{6,20}", username.trim())){
			//this.addActionError("�û�����������ĸ�����֣�����Ϊ6��20֮��");
			this.addFieldError("username", "�û�����������ĸ�����֣�����Ϊ6��20֮��");
		}
		//����У��
		if(password == null || "".equals(password)){
			//this.addActionError("���벻��Ϊ�գ�");
			this.addFieldError("password", "���벻��Ϊ�գ�");
		}else if(!Pattern.matches("\\w{6,20}", password.trim())){
			//this.addActionError("�����������ĸ�����֣�����Ϊ6��20֮��");
			this.addFieldError("password", "�����������ĸ�����֣�����Ϊ6��20֮��");
		}
		//ȷ������У��
		if(repassword == null || "".equals(repassword)){
			//this.addActionError("ȷ�����벻��Ϊ�գ�");
			this.addFieldError("repassword", "ȷ�����벻��Ϊ�գ�");
		}
		else if(!Pattern.matches("\\w{6,20}", repassword.trim())){
			//this.addActionError("ȷ�������������ĸ�����֣�����Ϊ6��20֮��");
			this.addFieldError("repassword", "ȷ�������������ĸ�����֣�����Ϊ6��20֮�䣡");
		}
		//�����ȷ������У��
		if(password != null && repassword != null && !password.equals(repassword)){
			this.addActionError("�����ȷ�����������ͬ��");
			
		}
		
		//����У��
		if(age < 18 || age >100){
			//this.addActionError("��������Ч���䣬���������18���ϣ�");
			this.addFieldError("age", "��������Ч���䣬���������18���ϣ�");
		}
		//��������У��
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
		//����У��
		if(email == null || "".equals(email)){
			//this.addActionError("���䲻��Ϊ�գ�");
			this.addFieldError("email", "���䲻��Ϊ�գ�");
		}else if(email != null && !"".equals(email) && !Pattern.matches
				("[a-zA-Z][a-zA-Z0-9._-]*@([a-zA-Z0-9-_]+\\.)+(com|gov|net|com\\.cn|edu\\.cn)", email)){
			//this.addActionError("��������ȷ�������ַ��");
			this.addFieldError("email", "��������ȷ�������ַ��");
		}
		
	}
	*/
	public String execute(){
		return SUCCESS;
	}
}
