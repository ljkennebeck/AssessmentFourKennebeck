<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>
	The average of ${AverageCalculator.getNumOne() }, 
	${AverageCalculator.getNumTwo() }, and 
	${AverageCalculator.getNumThree() } is 
	${AverageCalculator.getAverage() }
	</p>
	<input type="button" onclick="location.href='index.jsp'" value="Home Page">
</body>
</html>