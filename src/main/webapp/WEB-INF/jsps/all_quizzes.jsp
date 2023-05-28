<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Quizzes</title>
</head>
<body>
 <h1>All Quizzes</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Question</th>
            <th>Options</th>
            <th>Right Answer</th>
            <th>Start Date</th>
            <th>End Date</th>
         
        </tr>
        <c:forEach items="${quizzes}" var="quiz">
            <tr>
                <td>${quiz.id}</td>
                <td>${quiz.question}</td>
                <td>${quiz.options}</td>
                <td>${quiz.rightAnswer}</td>
                <td>${quiz.startDate}</td>
                <td>${quiz.endDate}</td>
                 
            </tr>
        </c:forEach>
    </table>

</body>
</html>