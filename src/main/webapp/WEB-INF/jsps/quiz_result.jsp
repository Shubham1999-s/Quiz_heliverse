<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quiz result</title>
</head>
<body>
 <h2>Quiz Result</h2>
    <c:if test="${quizResult != null}">
        <p>Quiz ID: ${quizResult.quizId}</p>
        <p>Right Answer Index: ${quizResult.rightAnswer}</p>
    </c:if>
    <c:if test="${quizResult == null}">
        <p>No result found for the specified quiz ID.</p>
    </c:if>

</body>
</html>