<%@ page language="java" import="com.wp.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录成功页面</title>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
</head>

<%
    User user = (User) session.getAttribute("SESSION_USER");
    String ip = request.getLocalAddr();
    String id = session.getId();
    String username = "";
    if (user != null) {
        username = user.getUserId() + "------->>" + user.getUsername() + "----->>" + user.getPassword();
    }
%>
<body>
<h2 class="title"><%=ip %> 服务器处理结果 SESSIONID = <%=id %> </h2>
<h2 class="title">当前登录用户：<%=username %> <a href="index.html">主页</a></h2>
</body>
</html>