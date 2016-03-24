<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="homepage">

<c:url var="appctx" value="/" />


	
		<span style='float: left'>
			<div>
				<a href="<c:url value="/"/>">
				<img src="<c:url value="/img/logo.gif"/>" />
				</a>
			</div>
		</span> 
		<span class="fRight" style="padding-top: 3px; padding-right: 10px;">
			<span class="copyright" id="sddm"> 
			
					<c:if test="${empty sessionScope.logged}">
        					<a id="MenuTop1_lbtnEng"
				href="<c:url value="/"/>signup/form">Sign up</a>
    				</c:if>
					
					
        		
    				
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

				<c:choose>
					<c:when
						test="${ not empty sessionScope.logged}">
						<a id="MenuTop1_lbtnFren"
							href="${appctx}page/logout">Logout</a>
					</c:when>
					<c:otherwise>
						<a id="MenuTop1_lbtnFren"
							href="<c:url value="/"/>login/form">Login</a>
					</c:otherwise>
				</c:choose>





		</span>
		</span>
	


</div>