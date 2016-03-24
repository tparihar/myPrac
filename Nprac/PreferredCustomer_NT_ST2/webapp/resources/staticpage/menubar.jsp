<table class="tblMain">
<tbody>
<tr>
<td>
<c:url var="homeUrl" value="/" />
					<c:if test="${ not empty sessionScope.logged}">
						<c:url var="homeUrl" value="/page/main" />
					</c:if>
					
<div id='menubar'>
<a href="${homeUrl}">Home</a>  
<a href="<c:url value="/page/about" />">About</a></div>

</td>
</tr>
</tbody>
</table>