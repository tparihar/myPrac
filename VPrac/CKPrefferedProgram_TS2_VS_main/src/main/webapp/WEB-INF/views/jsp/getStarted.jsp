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
	<%@ include file="/resources/html/header.html"%>
	<div class="layout">
		<div id="layout1">
			<div>
				<br> <b>Get Started</b><br> <br> <br>
				<div id="getstartedgrid">
					<br> <img src="<c:url value="/resources/images/vertical.jpg"/>"
						style="border-width: 0px; width: 50px; height: 280px"
						align="middle" />
					<div style="float: left; width: 40%;">
						<u>ALREADY A PREFERRED MEMBER?</u><br> <br> <br> <br>
						Look at your reward point by logging in to our portal<br> <br>
						If you are a preferred member and like to Login. <br> <br>
						click below to continue with your login process.<br> <br>
						<br> <b> <a href="./login">log in</a></b><br> <br>

					</div>
					<div style="float: right; width: 50%;">
						<u>JOIN PREFERRED TODAY</u><br>(United States residents only)<br>
						<br> <br> I would like to become a preferred member. <br>
						<br> joining the preferred program only takes a few minutes.<br>
						<br> click below to join.<br> <br> <br> <b>
							<a href="./join">Join</a>
						</b><br> <br>
					</div>
				</div>
			</div>
			<br>
			<div></div>
		</div>
	</div>
	<%@ include file="/resources/html/footer.html"%>
</body>
</html>