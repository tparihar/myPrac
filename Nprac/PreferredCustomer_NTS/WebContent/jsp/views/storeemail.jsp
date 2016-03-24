<%@ page import="java.util.List"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.Set"%>
<%@ page import="java.util.HashMap"%>


<%@ page import="com.ck.reward.service.StoreService"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	String countryId = "2";//request.getParameter("country");
	String stateId = "2";//request.getParameter("state");

	StoreService storeService = new StoreService();
	Map<String, String> emailList = storeService.getEmails();
	
	
	

	pageContext.setAttribute("emailList", emailList, PageContext.PAGE_SCOPE);
%>


<c:forEach items="${emailList}" var="emails">
	<span class="radio"><input type="checkbox" tabindex="32"
		checked="checked" name="emailpref" id="emailpref${emails.key}" value="${emails.key}"><label
		for="emailpref${emails.key}">${emails.value}</label></span>
</c:forEach>

