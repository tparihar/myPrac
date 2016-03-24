<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="externalcsslink.jsp"%>


    
     <!-- SiteCatalyst code version: H.17. Copyright 1997-2008 Omniture, Inc. More info available at http://www.omniture.com --> 

<!-- End SiteCatalyst code version: H.17. --> 
</head>
<body>

    <div id="hor">
    <div id="wrap">
     <div class="rel" id="content">
	<%@ include file="logo_signin_out.jsp"%> 
    
      <div class="abs" style="top:70px; left: 15px; right:-2%">
      <%@ include file="menubar.jsp"%>
     <table width="100%">
      <tr>
      <td>
          <span id="lblLogin" class="title">Welcome To Account Page</span>          
       </td>
       </tr>
       <tr><td> &nbsp;</td>
       </tr>
       <tr>
       <td>
           <span id="lblContent1" class="contents">Welcome ${sessionScope.member.firstName} <br/> Member ID:${sessionScope.member.id} </span></td>
       </tr>
       <tr><td>&nbsp;</td></tr>
       </table>
       

      </div>
      </div>
      
<div id="footer">
<%@ include file="footer.jsp"%>

</div>
        
   
      </div>      
    </div>
    </body>
</html>
