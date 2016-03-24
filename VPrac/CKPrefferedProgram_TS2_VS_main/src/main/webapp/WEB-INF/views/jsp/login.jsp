<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calvin Klein - Preferred Program</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<!-- <script type="text/javascript" src="<c:url value="/resources/js/jquery-1.12.0.js"/>"></script> -->
<script type="text/javascript"
	src="<c:url value="/resources/js/javascript.js"/>"></script>
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
				<br> <b>Account login</b><br> <br> To update your
				account information online or view your points balance, please log
				in below.
			</div>
			<br>
			<div id="login">
				* Indicates mandatory fields & must be entered <br>
				&nbsp;&nbsp;<label id="emaillogin"
					style="color: red; font-size: 100%"></label>
				<p id="dynamic" style="color: red">&nbsp;&nbsp;${message}</p>
				<form align="center" action="./processlogin" method="post">
					<table align="center">
						<tr>
							<td align="right">Email Id/User name&nbsp;&nbsp;&nbsp;</td>

							<td align="left"><input id="user1" type="text" name="email"
								placeholder="username" onchange="validateEmail1();"
								required="required" /><b style="color: red; font-size: 120%">&nbsp;*</b></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Password&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input type="password" name="password"
								placeholder="password" required="required" /><b
								style="color: red; font-size: 120%">&nbsp;*</b></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td></td>
							<td align="left"><input type="submit" value="login"></td>
						</tr>

					</table>

				</form>
				<br>
				<p align="center">
					Forgot username or password? <a href="">click here</a>
				</p>
			</div>
		</div>
	</div>
	<%@ include file="/resources/html/footer.html"%>
</body>
</html>