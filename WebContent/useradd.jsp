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
	编号：<input type="text" name="userId"><br>
	账号：<input type="text" name="userName"><br>
	密码：<input type="text" name="passWord"><br>
	兴趣爱好：<br>
		<input type="checkbox" value="Lol" name="userXq">Lol<br>
		<input type="checkbox" value="Dota" name="userXq">Dota<br>
		<input type="checkbox" value="Dnf" name="userXq">Dnf<br>
	时间：<input type="text" name="userTime"><br>
	<input type="submit" value="提交"><br>
</form>
</body>
</html>