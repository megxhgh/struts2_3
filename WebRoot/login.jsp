<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><s:text name="login.title"></s:text> </title>
  </head>
  
  <body>
  	<%-- 错误提示的三种形式
	  	<s:fielderror></s:fielderror>
	  	<s:fielderror key="username"></s:fielderror> 
	  	<s:fielderror cssStyle="color: red">
           <s:param>username</s:param>
        </s:fielderror>
  	--%>
  	
  	<!--  1,国际化struts表单 --> 
  	<center>
    	<s:text name="login.title"></s:text>
    	<s:form action="login">
    		<!-- 用key代替label -->
    		<s:textfield name="username" key="login.username"></s:textfield>
    		<s:password name="password" key="login.password"></s:password> 
   			<%-- <s:radio list="#{'1':'男','0':'女'}" name="gender" label="性别"></s:radio> --%>
    		<s:submit value="登录"></s:submit>
			<s:reset value="重置"></s:reset>
    	</s:form> 	
    </center>
  	
   <!-- 2,普通struts表单 --> 
  	<%--  
    <center>
    	<s:text name="登录"></s:text>
    	<s:form action="login">
    		<s:textfield name="username" label="用户名"></s:textfield>
    		<s:password name="password" label="密码"></s:password> 
   			<s:radio list="#{'1':'男','0':'女'}" name="gender" label="性别"></s:radio>
    		<s:submit value="登录"></s:submit>
			<s:reset value="重置"></s:reset>
    	</s:form> 	
    </center>
    --%>
     
   <!-- 3,传统表单 -->
   <!--  
	   <center>
	    	<form action="login" method="post">
	    		用户名：<input type="text" name="username"/><br/><br/>   		
	    		密码：<input type="password" name="password"/><br/><br/>
	    		<input type="submit" value="登录"/>&nbsp;
	    		<input type="reset" value="重置"/><br/><br/>
	    	</form>    
	    </center> 
 	-->
    
  </body>
</html>
