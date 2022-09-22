<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Rock, Paper, Scissors</h2>
	<form action="rockPaperScissorsServlet" method="post">
		Rock, Paper, Scissors:
		<input type="text" name="playerOne" size="10"><br>
		<input type="submit" value="Shoot!" />
	</form>
</body>
</html>