<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Average Calculator</h2>
	<form action="averageNumServlet" method="post">
		Enter first number:
		<input type="text" name="numOne" size="10"><br>
		Enter second number:
		<input type="text" name="numTwo" size="10"><br>
		Enter third number:
		<input type="text" name="numThree" size="10"><br>
		<input type="submit" value="Calculate" />
	</form>
</body>
</html>