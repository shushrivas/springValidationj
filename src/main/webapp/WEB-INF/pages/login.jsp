<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginDemo</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
</head>
<body {background-color: coral;}>
	<div align="Center">
		<pre>	
		<form:form class="form-horizontal" modelAttribute="user"
				action="http://localhost:8080/SpringValidation/signin?u=shubham&p=shubham123" method="get">
			<b>UserName::<form:input type="text" name="userName" path="userName"/>
				<br>
			<b>Password::<form:input type="text" name="password" path="password" />

			<input type="submit" value="validate" id="b1" />



		</form:form>
	</pre>
	</div>

</body>
</html>