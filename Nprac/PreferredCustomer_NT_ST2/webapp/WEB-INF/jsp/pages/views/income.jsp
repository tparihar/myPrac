<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:forEach items="${incomeRanges}" var="incomeRange">
	<span class="radio"><form:radiobutton path="profile.incomeRange.id" value="${incomeRange.id}"  
		name="income_range" id="income_range${incomeRange.id}"/><label for="income_range${incomeRange.id}">${incomeRange.range}</label></span>
</c:forEach>

