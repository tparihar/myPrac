   
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <option value="0">select state</option>
        <c:forEach items="${states}" var="state">   
		<option value="${state.id}">${state.name}</option>
		</c:forEach> 

