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
<h1>Registration</h1>
<form:form action="${pageContext.request.contextPath}/access/registration" 
method="POST" modelAttribute="registrationModel">

Login:<form:input path="login1"/> <form:errors path="login1"/><br>
Password:<form:input type="password" path="password1"/> <form:errors path="password1"/> <br>
Email:<form:input path="email1"/><form:errors path="email1"  /> <br>
ConfirmationPassword:<form:input type="password" path="confirmationPassword"/> <form:errors path="confirmationPassword"  />

<input type = "submit" value="Add User">
</form:form>
</body>
</html>