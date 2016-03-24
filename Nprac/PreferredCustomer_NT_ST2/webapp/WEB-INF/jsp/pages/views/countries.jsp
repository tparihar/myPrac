<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<form:select path="store.country.id" onChange="getStateList(this,'store_state','store_address')" id="store_country"  tabindex="1" class="textbox" style="width: 120px;">
		<option value="0">select country</option>
		
		<c:forEach items="${countries}" var="country">   
		<option value="${country.id}">${country.name}</option>
		</c:forEach> 
		

</form:select>