<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calvin Klein - Preferred Program</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/home.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style1.css" />
</head>
<body>
	<%@ include file="../html/header.html"%>
	<div class="layout">
		<div id="layout1">
			<br>
			<div id="sploffer">
				<b>SPECIAL OFFER <br> receive 20% off your next in-store
					purchase when you register for the Calvin Klein Preferred Program.
				</b>
			</div>
			<div id="prefer">
				<b>PREFERRED PROGRAM </b>
			</div>
			<div>The Calvin Klein Preferred Program is designed to reward
				our best customers for their frequent purchases. as a Calvin Klein
				preferred customer, you accumulate points with each purchase.</div>

			<div>For every $200 spent (taxes not included) you will receive
				at $20 Calvin Klein reward via email. the more you spend, the more
				you earn. preferred rewards may be used towards your subsequent
				purchases at Calvinklein.com or certain Calvin Klein stores.</div>

			<div>
				Additional benefits:<br> 1. Exclusive sales email offers<br>
				2. Birthday gift<br> 3. Plus, complete your profile and earn
				100 points towards your next preferred reward (for example, spend
				$100 at your local Calvin Klein company store today, complete your
				profile below and you will receive your $20 reward!

			</div>

			<div>
				Certain restrictions apply, see full <a
					href="https://www.calvinkleinpreferred.com/TermsConditions.aspx">terms
					and conditions.</a>
			</div>
			<br> <br>
			<div id="box">
				<b>Existing members <a
					href="${pageContext.request.contextPath}/jsp/login.jsp">log in</a></b><br>
				If you are an existing member and have already registered online for
				the Calvin Klein Preferred Program, you can login to view your
				points balance or update member enrollment information online. login
				to add the purchase to your account.
			</div>
			<br>
			<div id="box">
				<b>Get started </b><br> Did you know that by completing your
				profile, you will also earn points towards your next reward?
				registering or completing your profile takes just a few minutes.
				please click below to proceed: <br>
				<p align="center">
					<a href="${pageContext.request.contextPath}/jsp/getStarted.jsp">Get
						Started</a>
				</p>
			</div>
		</div>
	</div>
	<%@ include file="../html/footer.html"%>
</body>
</html>