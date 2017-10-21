<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 	<title>用户注册3</title>
  </head>
  
  <body>
  	<center>
	    <h1>用户注册3，附加客户端校验</h1>
	    <s:form action="register3" validate="true">
	    	<s:textfield name="username" label="用户名"></s:textfield>
	    	<s:password name="password" label="密码"></s:password>
	    	<s:password name="repassword" label="确认密码"></s:password>
	    	<s:textfield name="age" label="年龄"></s:textfield>
	    	<s:textfield name="birth" label="出生日期"></s:textfield>
	    	<s:textfield name="email" label="邮箱"></s:textfield>
	    	<s:submit value="注册"></s:submit>
	    </s:form>
    </center>
  </body>
</html>
