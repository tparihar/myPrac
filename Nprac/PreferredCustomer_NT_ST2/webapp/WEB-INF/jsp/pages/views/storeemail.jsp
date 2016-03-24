<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach items="${emails}" var="email" varStatus="loop">
	<span class="radio">
	<input type="checkbox" name="subscribedEmail[${loop.index}].emailId" 
		 id="emailpref${email.id}" value="${email.id}"/>
		<label for="emailpref${email.id}">${email.name}</label></span>
</c:forEach>

