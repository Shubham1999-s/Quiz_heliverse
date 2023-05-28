<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Quiz</title>
</head>
<body>
 <h2>Create Quiz</h2>
    <form action="saveQuiz" method="post">
        <label>Question:</label><br>
        <input type="text" name="question" required><br><br>
        
         <label>Options:</label><br>
        <input type="text" name="options[0]" required><br>
        <input type="text" name="options[1]" required><br>
        <input type="text" name="options[2]" required><br>
        <input type="text" name="options[3]" required><br><br>
        
        <label>Right Answer:</label><br>
        <input type="number" name="rightAnswer" required><br><br>
        
        <label>Start Date:</label><br>
        <input type="datetime-local" name="startDate" required pattern="^\d{2}-\d{2}-\d{4}T\d{2}:\d{2}$"><br><br>
        
        <label>End Date:</label><br>
        <input type="datetime-local" name="endDate" required pattern="^\d{2}-\d{2}-\d{4}T\d{2}:\d{2}$"><br><br>
         
         
        
        <input type="submit" value="Create Quiz">
    </form>

</body>
</html>