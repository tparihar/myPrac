 <%@ page import="com.ck.reward.service.StoreService" %>
<%@ page import="com.ck.reward.entities.Store" %>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
  <%
  String countryId="2";//request.getParameter("country");
  String stateId="2";//request.getParameter("state");

  StoreService storeService=new StoreService();
  java.util.List<Store> stores=storeService.getStores(countryId, stateId);

  
  

pageContext.setAttribute("stores", stores, PageContext.PAGE_SCOPE);

%>      

        <option value="0" selected="selected">select store</option>
        <c:forEach items="${stores}" var="store">   
		<option value="${store.id}">${store.name}-${store.address1} ${store.address2} ${store.city} ${store.zip}</option>
		</c:forEach> 

