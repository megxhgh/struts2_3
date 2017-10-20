<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户输入</title>
    
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
  	<s:form action="input">
  		<s:textfield name="names" label="name1"></s:textfield>
  		<s:textfield name="names" label="name2"></s:textfield>
  		<s:textfield name="names" label="name3"></s:textfield>
  		<s:textfield name="names" label="name4"></s:textfield>
  		
  		<s:textfield name="booleanVar" label="boolean"></s:textfield>
  		<s:textfield name="charVar" label="char"></s:textfield>
  		<s:textfield name="intVar" label="int"></s:textfield>
  		<s:textfield name="longVar" label="long"></s:textfield>
  		<s:textfield name="floatVar" label="float"></s:textfield>
  		<s:textfield name="doubleVar" label="double"></s:textfield>
  		
  		<s:submit value="input"></s:submit>
  	</s:form>
  </body>
</html>
