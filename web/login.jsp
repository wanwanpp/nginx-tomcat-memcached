<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>登录页面</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
</head>
<%
    String ip = request.getLocalAddr();
    String id = session.getId();
%>
<body>

<form method="post" action="loginServlet.do">
    <table class="table">
        <tr>
            <td colspan="2">
                <b>SESSION_ID = <%=id %></b>
            </td>
        </tr>
        <tr>
            <td height="15" colspan="2">
                <b><%=ip %> 用户登录</b>
            </td>
        </tr>
        <tr>
            <td width="80"><b>用户名</b></td>
            <td><input type="text" name="userName" value="" /></td>
        </tr>
        <tr>
            <td><b>密 码</b></td>
            <td><input type="password" name="password" value="" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="登 录" />
                <input type="reset" value="重 置" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
