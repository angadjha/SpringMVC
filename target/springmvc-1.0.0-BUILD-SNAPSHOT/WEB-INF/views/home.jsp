<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/assets/css/participate.css" rel="stylesheet">
</head>
<body>
<div class="login">
<form action="showParticipate.do" method="post">
<h4>USER NAME</h4>
<input type="text" name="username" id="username"/>
<h4>PASSWORD</h4>
<input type="password" name="password" id="password">
<button type="submit"  id="submit">Log In </button>
</form> 
<a href="registrationParticipate.do">create new account</a>
</div>
</body>
</html>