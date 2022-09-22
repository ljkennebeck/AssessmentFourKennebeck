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
		You chose: ${RPS.getPlayerOne() } <br>
		Opponent chose: ${RPS.getPlayerTwo() } <br>
		Winner: ${RPS.getWinner() }
	</p>
	<input type="button" onclick="location.href='index.jsp'" value="Home Page">
</body>
</html>