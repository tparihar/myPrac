<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="homepage">




	
		<span style='float: left'>
			<div>
				<a href="${pageContext.request.contextPath}/index.jsp"><img
					src="${pageContext.request.contextPath}/img/logo.gif"></a>
			</div>
		</span> <span class="fRight" style="padding-top: 3px; padding-right: 10px;">
			<span class="copyright" id="sddm"> <a id="MenuTop1_lbtnEng"
				href="${pageContext.request.contextPath}/signup">SignUp</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

				<c:choose>
					<c:when
						test="${sessionScope.loggedIn != null || sessionScope.loggedIn=='true'}">
						<a id="MenuTop1_lbtnFren"
							href="${pageContext.request.contextPath}/jsp/logout.jsp">Logout</a>
					</c:when>
					<c:otherwise>
						<a id="MenuTop1_lbtnFren"
							href="${pageContext.request.contextPath}/login">Login</a>
					</c:otherwise>
				</c:choose>





		</span>
		</span>
	


</div>