

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head><title>
	Calvin Klein - Preferred Program
</title><link href="${pageContext.request.contextPath}/css/global.css" media="all" rel="stylesheet" rev="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/master.css" media="all" rel="stylesheet" rev="stylesheet" type="text/css" />    

<style type="text/css"> 
        
#graybackground-div
{
position:absolute;
top:0px;
left:0px;
overflow:hidden;
width:100%;
height:100%;
background-color:#D3D3D3;
opacity:0.5;
filter:alpha(opacity=50);
z-index:10;
display:none;
}

#message-div
{
position: absolute;
top: 60%;
left: 40%;
margin-left: -100px;
margin-top: -150px;
background-color: white;
filter: progid:DXImageTransform.Microsoft.Gradient(
GradientType=0,StartColorStr='white',
EndColorStr='white');
width: 500px;
height: 150px;
border: 2px solid white;
font-family: Arial, Helvetica;
text-align:center;
color:#000000;
font-size: 20px;
display:none;
} 
#message-div div
{
padding:70px;
} 

</style>


    
     <!-- SiteCatalyst code version: H.17. Copyright 1997-2008 Omniture, Inc. More info available at http://www.omniture.com --> 

<!-- End SiteCatalyst code version: H.17. --> 
</head>
<body>
    <form name="form1" method="post" action="login" id="form1">







    <div id="hor">
    <div id="wrap">
     <div class="rel" id="content">
<%@ include file="logo_signin_out.jsp"%> 
    
      <div class="abs" style="top:70px; left: 15px; right:-2%">
      <%@ include file="menubar.jsp"%>
     <table width="100%">
      <tr>
      <td>
          <span id="lblLogin" class="title">ACCOUNT LOGIN</span>          
       </td>
       </tr>
       <tr><td> &nbsp;</td>
       </tr>
       <tr>
       <td>
           <span id="lblContent1" class="contents">to update your account information online or view your points balance, please log in below.</span></td>
       </tr>
       <tr><td>&nbsp;</td></tr>
       </table>
       <%@ include file="loginbox.jsp"%>

      </div>
      </div>
      
<div id="footer">
<%@ include file="footer.jsp"%>

</div>
        
   
      </div>      
    </div>
    
    


</form>
</body>
</html>
