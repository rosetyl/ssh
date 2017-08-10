<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%> <!-- 引入struts2标签库 -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>  
  <body>
    <form action="userAction.action" method="post">
    	<input type="text" name="username" placeholder="用户名"><br>
    	<input type="text" name="password" placeholder="密码"><br>
    	<input type="submit" value="登录"><br>
    </form>
  </body>
</html>
