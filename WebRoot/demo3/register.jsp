<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户注册3</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <center>
    	<s:actionerror/>
    	<h1>用户注册3</h1>
    	<s:form action="register" validate="true">
    	<%-- <s:form action="#" validate="true"> --%>
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
