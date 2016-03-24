<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<option value="0">select store</option>
		
	 <c:forEach items="${stores}" var="store">   
		<option value="${store.id}">${store.name}-${store.address1}</option>
		</c:forEach> 
		
