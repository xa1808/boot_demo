<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>index</h2>
	<fmt:setBundle basename="msg" var="myBundle" />

	<fmt:message key="index.welcome" bundle="${myBundle}"></fmt:message>

	${welcome_msg}
</body>
</html>