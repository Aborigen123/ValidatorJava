<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Profile</h1>
<a href="${pageContext.request.contextPath}/listUser/profile/setting">Settings</a> <br> <br> <br>

<img src="data:image/png;base64, ${imageSrc}" width="250"/> <br>
</div>
</body>
</html>