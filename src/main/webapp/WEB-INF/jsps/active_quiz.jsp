<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Active Quiz</title>
</head>
<body>
 <h1>Active Quiz</h1>
    <c:if test="${activeQuiz != null}">
        <p>Question: ${activeQuiz.question}</p>
        <p>Options: ${activeQuiz.options}</p>
        <p>Right Answer: ${activeQuiz.rightAnswer}</p>
         <p>Status: ${activeQuiz.status}</p>
    </c:if>
    <c:if test="${activeQuiz == null}">
        <p>No active quiz found.</p>
    </c:if>

</body>
</html>