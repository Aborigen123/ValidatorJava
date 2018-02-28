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


<h3>
<a href="${pageContext.request.contextPath}access/access1">Увійти</a>
</h3>

<h3>Якщо ви ще не раєструвалися
<a href="${pageContext.request.contextPath}access/registration">Зареєструйтеся</a>
</h3>
<div align="center">
<h1>Інструкція</h1>
<h3>1. В класі AccessController описаний основний контроллер<br>
2.В класі RegRepository @Query("Select r from Registration r where r.password1 = r.confirmationPassword") який повинен перевіряти вхідні дані  (r.password1 = r.confirmationPassword) (моя логіка) ми порівнюємо між собою і якщо вони правильні то записуємо хз чи правильно<br>
Далі в класі ConfirmationPasswordValidation повинні передаватися дані для перевірки (if) не знаю чи це взагалі правильно<br>
3.На рахунок входу то 1 і 2 бази даних заповнюються одночасно і працює валідатор я написав зразу на перевірку 2-х умов (інтерфейс AutoRepository) я думаю помилка в тому чи правильно 2 валідатора писати разом (хотів попробувати і на 1 параметер валідатор ми писали на уроці він знаходиться в клас CorrectAutorizationValidation)) і не знаю як правильно викликати перевірку в контроллері (клас AccessController) 

</h3>
</div>
</body>
</html>