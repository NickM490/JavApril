<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome to Witcher Land</h1>
	
	<h5>${name}</h5>
	
	<c:forEach>
		
	</c:forEach>
	
	<c:if test="">
	
	</c:if>
	
	<c:choose>
		<c:when test="Amanda's userId is in session">
			<h3>COngrats on the new Mac</h3>
		</c:when>
		
		<c:otherwise>
			<h4>Matt is very good at Rocket League</h4>
		</c:otherwise>
	
	</c:choose>
	
	
	
	<c:out value="${name}"></c:out>

</body>
</html>