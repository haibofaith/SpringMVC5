<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>用户信息添加</h1>
<form action="user/add.do" method="post">
	编号：<input type="text" name="userId">
	账号：<input type="text" name="userName">
	密码：<input type="text" name="passWord">
	<input type="submit" value="提交">
</form>
</body>
</html>