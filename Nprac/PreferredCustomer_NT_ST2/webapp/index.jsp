<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="resources/staticpage/externalcsslink.jsp"%>
<body>








	<div id="wrap">

		<div class="rel" id="content">
			<%@ include file="resources/staticpage/logo_signin_out.jsp"%>

			<%@ include file="resources/staticpage/menubar.jsp"%>
			<div class="main_contents" style="top: 15px; left: 15px; right: -2%">

				<c:choose>
					<c:when test="${empty page}">
        				<%@include file="resources/staticpage/index.html" %>
    				</c:when>
					<c:otherwise>
					
        			<jsp:include page="WEB-INF/jsp/${page}" />
    				</c:otherwise>
				</c:choose>
				

			</div>
		</div>


		<div id="footer">
			<%@ include file="resources/staticpage/footer.jsp"%>

		</div>


	</div>


</body>
</html>
