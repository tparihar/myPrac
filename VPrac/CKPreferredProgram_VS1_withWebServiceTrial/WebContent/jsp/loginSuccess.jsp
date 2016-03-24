<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calvin Klein - Preferred Program</title>
<link rel="stylesheet" type="text/css" href="../css/home.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style1.css" />
</head>
<body>
	<div class="header">
		<div>
			<div>
				<img src="${pageContext.request.contextPath}/images/logo.jpg"
					width="400px" height="100px" class="logo" /> <br> <br> <br>
				<br> <br> <br> <br> <br> <br> <br>
			</div>
			<br>
		</div>
		<div class="headerlinks">
			<hr />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="${pageContext.request.contextPath}/home.jsp"">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${pageContext.request.contextPath}/jsp/about.jsp">About</a>
		</div>
	</div>


	<div class="layout">
		<div id="layout1">
			<div id="success">
				<br> <b>Hello,${requestScope.member.firstName}</b><br> <br>
				Congratulation!!!!!! You have Successfully logged in.<br><br>
				Your Calvin Klein MemberShip number is :${requestScope.member.memshipNumber}<br>
				
				<img src="${pageContext.request.contextPath}/images/Calvin-klein-logo-7.jpg" width="500px" align="right"/>
			</div>
	
		</div>
	</div>
	<%@ include file="../html/footer.html"%>
</body>
</html>