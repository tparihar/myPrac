  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <c:url var="loginUrl" value="/login/do" />
    <form:form method="post" action="${loginUrl}" modelAttribute="loginDetail">







  
     

    
    
     
 
        <table width="50%" class="border">
        <tr align="center">
        <td>
        <table width="70%" border="0" cellspacing="5px">
        <tr>
        <td align="left" colspan="3">
        <span id="lblCont1">* indicates mandatory fields & must be entered
       
        </span></td>
        </tr>
        <tr>
        <td align="right"><span id="lblContent2" class="contents" style="display:inline-block;width:200px;">email address/user name</span></td>
        <td align="left">
        <form:input path="username" type="text" maxlength="255" id="username" class="textbox" /> *
        <form:errors path="username" cssClass="error" />
        </td>
        <td align="center">
        <div style="text-overflow : ellipsis; overflow: hidden; width: 157px; overflow-y: hidden">
        
        </div>
        </td>
        </tr>
        <tr>
        <td align="right"><span id="lblContent3" class="contents">password</span></td>
        <td align="left">
        <form:input path="password" type="password" maxlength="10" id="password" class="textbox" /> *
        <form:errors path="password" cssClass="error" />	
        </td>
                <td align="center">
                <div style="text-overflow : ellipsis; overflow: hidden; width: 157px; overflow-y: hidden">
                
                </div>
        </td>
        </tr>
        <tr><td colspan="3"><span style='color:red'>${requestScope.message}</span>&nbsp;</td></tr>
        <tr align="center"><td colspan="3">
       <input type="submit" style="font-weight:bold"													
														 class="bullets submitLink" tabindex="36"
														id="btnUpdate"
														value="login"/>
        </td></tr>
        <tr><td colspan="3">&nbsp;</td></tr>
        <tr><td colspan="3"><span id="lblContent4" class="contents">forgot user name or password?</span>&nbsp;<a href="RetrievePassword.aspx" class="bullets"><span id="lblCont2">click here</span></a></td></tr>
        <tr><td colspan="3">&nbsp;</td></tr>
        <tr><td colspan="3"></td></tr>
        </table>
        </td>
        </tr>
        </table>
      
    
      

        
   
     
    


</form:form>

