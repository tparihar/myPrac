<%@page import="java.util.HashMap"%>
<%@page import="com.calvinklein.rewards.service.DataHandler"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calvin Klein - Preferred Program</title>
<link rel="stylesheet" type="text/css" href="../css/home.css" />
<link rel="stylesheet" type="text/css" href="../css/style1.css" />
</head>
<body>
	<%@ include file="../html/header.html"%>
	<%
		DataHandler dataHandler = new DataHandler();
		HashMap<String, String> hm = dataHandler.retriveStoreDetails();
		request.setAttribute("store", hm);
	%>
	<div class="joinlayout">
		<div>
			<br> <b>SIGN UP FOR THE PREFERRED PROGRAM </b><br> <br>
			please complete the following registration form to become a preferred
			program member.
		</div>
		<br>
		<form action="./join" method="post">
			<div>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;<b>Local
					store</b>
			</div>
			<div id="join">
				* Indicates mandatory fields & must be entered <br> <br>
				Select your home store
				<div align="center">
					<select name="country" style="height: 30px">
						<option>Select Country</option>
						<option value="United States">United States</option>
					</select>&nbsp;* <select name="state" style="height: 30px">
						<option>Select State/Province</option>
						<option value="Texas">Texas</option>
					</select>&nbsp;*<br> <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select
						name="homestore" id="store" style="height: 30px">
						<option>Select your home store</option>
						<c:forEach items="${store}" var="store">
							<option value="${store['key']}">${store['value']}</option>
						</c:forEach>
						<br>
						<br>
					</select>&nbsp;*

				</div>

			</div>
			<div>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;<b>Registration</b>
			</div>
			<div id="join">
				<b style="color: red""></b> <br> <br> <br>
				<table align="center">
					<tr>
						<td align="right">Email Id&nbsp;/&nbsp;User
							name&nbsp;&nbsp;&nbsp;</td>
						<b style="color: red">${requestScope.invalid}</b>
						<td align="left"><input type="text" name="email"
							placeholder="username" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align="right">Password&nbsp;&nbsp;&nbsp;</td>
						<td align="left"><input type="password" name="password"
							placeholder="password" />&nbsp;*</td>
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
					<br> <br> <br>
					<table align="center">
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">First Name&nbsp;&nbsp;&nbsp</td>
							<td align="left"><input type="text" name="fname" />&nbsp;*</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Last Name&nbsp;&nbsp;&nbsp</td>
							<td align="left"><input type="text" name="lname" />&nbsp;*</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Country&nbsp;&nbsp;&nbsp</td>
							<td align="left"><input type="text" name="country1" />&nbsp;*</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">State&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input type="text" name="state1" />&nbsp;*</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Address 1&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input type="text" name="addr1" />&nbsp;*</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Address 2&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input type="text" name="addr2" />&nbsp;*</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">City&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input type="text" name="city" />&nbsp;*</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Zip&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input type="text" name="zip" />&nbsp;*</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Email&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input type="text" name="emailid" />&nbsp;*</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Phone&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input type="text" name="phone" />&nbsp;*</td>
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
							<td align="left"><input type="radio" name="mstatus"
								value="single" checked id="radio">Single<input
								type="radio" name="mstatus" value="married" id="radio">
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
						<input type="submit" value="Update profile" />
					</div>

				</div>
			</div>
		</form>
	</div>

	<%@ include file="../html/footer.html"%>
</body>
</html>