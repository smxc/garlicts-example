<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/submitUser.do" method="post" id="">
	<input type="text" name="username" value=""><br>
	<input type="text" name="password" value=""><br>
	
	<input type="checkbox" name="c" value="a">a 
	<input type="checkbox" name="c" value="b">b 
	<input type="checkbox" name="c" value="c">c <br>
	
	<input type="submit" value="submit">
</form>
</body>
</html>