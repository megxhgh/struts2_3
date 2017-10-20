<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户注册</title>
  </head>
  <body>
    <center>
    	<%-- <s:actionerror/> --%>
    	<h2>用户注册2</h2>
    	<form action="register.action" method="post">
    		<table>
    			<tr>
    				<td>用户名：</td>
    				<td><input type="text" name="username" value="${requestScope.username}"/></td>
    			</tr>
    			<tr>
    				<td>密码：</td>
    				<td><input type="password" name="password" value="${requestScope.password}" /></td>
    			</tr>
    			<tr>
    				<td>确认密码：</td>
    				<td><input type="password" name="repassword" value="${requestScope.repassword}" /></td>
    			</tr>
    			<tr>
    				<td>年龄：</td>
    				<td><input type="text" name="age" value="${requestScope.age}" /></td>
    			</tr>
    			<tr>
    				<td>出生日期：</td>
    				<td><input type="text" name="birth" value="${requestScope.birth}"/></td>
    			</tr>
    			<tr>
    				<td>邮箱：</td>
    				<td><input type="text" name="email" value="${requestScope.email}"/></td>
    			</tr>
    			<tr>
    				<td colspan="2" align="center"><input type="submit" value="注册"/></td>
    			</tr>
    			
    		</table>
    	
    	</form>
    </center>
  </body>
</html>
