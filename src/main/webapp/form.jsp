<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${pageContext.request.contextPath}/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="user/submitUser.do" method="post">
姓名：<input type="text" name="name" value=""><br>
手机：<input type="text" name="mobile" value=""><br>
<input type="hidden" name="rows" value="10"><br>
<input type="hidden" name="page" value="1">
<input type="submit" value="submit">
</form>
</body>
</html>