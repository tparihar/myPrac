<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calvin Klein - Preferred Program</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<!-- <script type="text/javascript" src="/resources/js/jquery-1.12.0.js">  -->
<script type="text/javascript"
	src="<c:url value="/resources/js/javascript.js"/>"></script>
<%-- <script type="text/javascript" src="<c:url value="/resources/js/jquery-1.12.0.js"/>"></script> --%>


<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/home.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/style1.css"/>" />
</head>
<body>
	<%@ include file="/resources/html/header.html"%>
	<div class="joinlayout">
		<div>
			<br> <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
				&nbsp;SIGN UP FOR THE PREFERRED PROGRAM </b><br> <br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;please
			complete the following registration form to become a preferred
			program member.
		</div>
		<br>
		<form action="./register" method="post">
			<div>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;<b>Local
					store</b>
			</div>
			<div id="join">
				<b style="color: red; font-size: 120%">*</b> Indicates mandatory
				fields & must be entered <br> <br>&nbsp;&nbsp;Select your
				home store
				<div align="center">
					<select id="country" name="country" style="height: 30px" required>
						<option value="0">Select Country</option>
						<c:forEach items="${countries}" var="countries">
							<option value="${countries.key}">${countries.value}</option>
						</c:forEach>
					</select>&nbsp;<b style="color: red; font-size: 170%">*</b> <select
						id="state" name="state" style="height: 30px">
						<option value="0">Select State/Province</option>
					</select>&nbsp;<b style="color: red; font-size: 170%">*</b><br> <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; <select name="storeId"
						id="store" style="height: 30px">
						<option value="0">Select your home store</option>
						<%-- <c:forEach items="${store}" var="store">
							<option value="${store['key']}">${store['value']}</option>
						</c:forEach> --%>
					</select>&nbsp;<b style="color: red; font-size: 170%">*</b>

				</div>

			</div>
			<div>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;<b>Registration</b>
			</div>
			<div id="join">
				<label id="emaillabel" style="color: red; font-size: 100%"></label><br>
				<label id="pwdlabel" style="color: red; font-size: 100%"></label><br>
				<br>
				<table align="center">
					<tr>
						<td align="right">Email Id&nbsp;/&nbsp;User
							name&nbsp;&nbsp;&nbsp;</td>
						<%-- <b style="color: red">${requestScope.invalid}</b> --%>
						<td align="left"><input id="user" type="text"
							name="user.email" required="required" placeholder="username"
							onchange="validateEmail();" />&nbsp;<b
							style="color: red; font-size: 120%">*</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align="right">Password&nbsp;&nbsp;&nbsp;</td>
						<td align="left"><input id="pwd" type="password"
							name="user.password" placeholder="password" required="required"
							onchange="validatePassword();" />&nbsp;<b
							style="color: red; font-size: 120%">*</b></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>


				</table>

			</div>
			<div>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; <b>Personal
					Information</b>
			</div>
			<div id="personaljoin">
				<div>
					<label id="perlabel" style="color: red; font-size: 100%"></label> <br>
					<br>
					<table align="center">
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">First Name&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input id="fname" type="text" name="firstName"
								required="required" onchange="validate();" />&nbsp;<b
								style="color: red; font-size: 120%">*</b></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Last Name&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input id="lname" type="text" name="lastName"
								required="required" onchange="validate();" />&nbsp;<b
								style="color: red; font-size: 120%">*</b></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Country&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input id="country1" type="text" name="adr.country"
								required="required" onchange="validate();" />&nbsp;<b
								style="color: red; font-size: 120%">*</b></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">State&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input id="state1" type="text" name="adr.state"
								required="required" onchange="validate();" />&nbsp;<b
								style="color: red; font-size: 120%">*</b></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Address 1&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input id="addr1" type="text" name="adr.address1"
								required="required" onchange="validate();"/>&nbsp;<b
								style="color: red; font-size: 120%" ">*</b></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Address 2&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input id="addr2" type="text" name="adr.address2"
								onchange="validate();" />&nbsp;</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">City&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input id="city" type="text" name="adr.city"
								required="required" onchange="validate();" />&nbsp;<b
								style="color: red; font-size: 120%">*</b></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Zip&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input id="zip" type="text" name="adr.zip"
								required="required" required="required"
								onchange="validate();" />&nbsp;<b
								style="color: red; font-size: 120%">*</b></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Alternative email&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input id="aemail" type="text" name="emailId"
								onchange="validateAemail();" />&nbsp;
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Phone&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input id="phone" type="text" name="phone"
								onchange="validatePhone();" />&nbsp;</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Gender&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input type="radio" name="gender"
								value="male" checked id="radio">Male&nbsp;&nbsp;<input
								type="radio" name="gender" value="female" id="radio">Female</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Marital Status&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input type="radio" name="maritalStatus"
								value="single" checked id="radio">Single<input
								type="radio" name="maritalStatus" value="married" id="radio">
								Married</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Birth date&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input type="date" name="dob" id="date"
								style="font-size: 1.5rem" /></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Household income&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input type="radio" name="income"
								value="$25000-&40,000" checked id="radio">$25000-&40,000<input
								type="radio" name="income" value="$40001-&55,000" id="radio">$40001-&55,000<br>
								<input type="radio" name="income" value="$55001-&70,000"
								id="radio">$55001-&70,000<input type="radio"
								name="income" value="&70,000+" id="radio">&70,000+</td>
						</tr>

					</table>
					<br> <b>by joining our preferred program, and providing
						personal data, you are certifying you are at least 18 years of
						age. do not provide any information if you're under the age of 18.</b><br>
					<br>
					<div align="center">
						<input type="submit" value="Update profile" onclick="validate();"/>
					</div>

				</div>
			</div>
		</form>
	</div>

	<%@ include file="/resources/html/footer.html"%>
</body>
</html>