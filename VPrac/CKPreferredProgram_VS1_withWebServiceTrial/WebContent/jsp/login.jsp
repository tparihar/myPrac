<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calvin Klein - Preferred Program</title>
<link rel="stylesheet" type="text/css" href="../css/home.css" />
</head>
<body>
	<%@ include file="/html/header.html"%>
	<div class="layout">
		<div id="layout1">
			<div>
				<br> <b>Account login</b><br> <br> To update your
				account information online or view your points balance, please log
				in below.
			</div>
			<br>
			<div id="login">
				* Indicates mandatory fields & must be entered <br> <br> <b
					style="color: red"><u>${requestScope.failed}</u></b>
				<form align="center" action="./login" method="post">
					<br>
					<table align="center">
						<tr>
							<td align="right">Email Id/User name&nbsp;&nbsp;&nbsp;</td>

							<td align="left"><input type="text" name="email"
								placeholder="username" />*</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align="right">Password&nbsp;&nbsp;&nbsp;</td>
							<td align="left"><input type="password" name="password"
								placeholder="password" />*</td>
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
	<%@ include file="../html/footer.html"%>
</body>
</html>