<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calvin Klein - Preferred Program</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/home.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/style1.css"/>" />
</head>
<body>
	<div class="header">
		<div>
			<div>
				<img src="<c:url value="/resources/images/logo.jpg"/>" width="400px"
					height="100px" class="logo" /> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br>
			</div>
			<br>
		</div>
		<div class="headerlinks">
			<hr />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="./home.jsp">Home</a>&nbsp;&nbsp;&nbsp;&nbsp; <a href="./about">About</a>
		</div>
	</div>


	<div class="layout">
		<div id="layout1">
			<div id="success">Hi, Mr. ${member.firstName}<br>
				<b></b><br> <br> Congratulation!!!!!! You have
				Successfully Registered<br> <br> Click on Login to
				continue<br> <br> <b><a href="./login"
					style="color: blue">Login</a></b> <img
					src="<c:url value="/resources/images/Calvin-klein-logo-7.jpg"/>"
					width="500px" align="right" />
			</div>

		</div>
	</div>
	<%@ include file="/resources/html/header.html"%>
</body>
</html>