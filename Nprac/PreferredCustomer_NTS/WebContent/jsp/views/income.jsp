
<%@ page import="com.ck.reward.service.MemberService"%>
<%@ page import="com.ck.reward.entities.Income"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	

	MemberService memberService = new MemberService();
	java.util.List<Income> incomeRange = memberService.getIncomeRange();

	pageContext.setAttribute("incomeRange", incomeRange, PageContext.PAGE_SCOPE);
%>


<c:forEach items="${incomeRange}" var="income">
	<span class="radio"><input type="radio"  value="${income.id}"  
		name="income_range" id="income_range${income.id}"><label for="income_range${income.id}">${income.range}</label></span>
</c:forEach>

