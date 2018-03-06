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

<%-- <form:form action="${pageContext.request.contextPath}/userList/profile/setting" method="POST" modelAttribute="">
Phone number:<form:input path="phone"/> <br>
City:<form:input path="city"/> <br>
<input type="submit" value="Upload">
</form:form>--%>


<form action="${pageContext.request.contextPath}/listUser/profile/setting/to-project" 
method = "POST"
enctype = "multipart/form-data">

Choose photo on profile:<br>
<input type = "file" name="photo1"><br> <br>

<input type="submit" value="Upload file">
</form>


</body>
</html>