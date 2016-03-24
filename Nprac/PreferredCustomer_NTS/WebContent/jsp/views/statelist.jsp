 <%@ page import="com.ck.reward.service.StoreService" %>
<%@ page import="com.ck.reward.entities.State" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
  <%java.util.List<State> states=new StoreService().getStates(request.getParameter("country"));

pageContext.setAttribute("states", states, PageContext.PAGE_SCOPE);

%>      <option value="0" selected="selected">select state</option>
        <c:forEach items="${states}" var="state">   
		<option value="${state.id}">${state.name }</option>
		</c:forEach> 

