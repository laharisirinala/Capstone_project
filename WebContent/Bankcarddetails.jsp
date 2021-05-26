<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
div#header {
padding: 0px;
  margin-top:0px;
background-color: black;
height:142px;
font-color: white;
background-repeat:no-repeat;
    background-position:left top;
     background-size: 190px 120px;
}
div#footer {
border: 0px solid white;
min-height: 40px;
background-color: black;
}
.fa {
  padding: 7px;
  font-size: 30px;
  width: 20px;
  text-align: center;
  text-decoration: none;
}
.fa:hover {
  opacity: 0.7;
}
.fa-facebook {
  background: #3B5998;
  color: white;
}

.fa-twitter {
  background: #55ACEE;
  color: white;
}
.fa-linkedin {
  background: #007bb5;
  color: white;
}
img{  
 height: 250px;  
 width: 250px;  
 }  
 #right{    
 text-align: right;  
 }
 body {
  overflow-y: hidden; /* Hide vertical scrollbar */
  overflow-x: hidden; /* Hide horizontal scrollbar */
}
</style>
 </head>
<body  bgcolor=FEF5E7>
<div id = "header">
<center>
<h1 style="color:white; font-size:50px;">ICIN BANK</h1></center>
<h3   style="float:right"><a href="BankHomePage.jsp" style="color:white;">HOME</a>&nbsp;&nbsp;&nbsp;<a href="BankLogin.jsp" style="color:white;" >LOGIN</a>&nbsp;&nbsp;&nbsp; 
</h3>
</div>
<center>
<h1>
Account No: ${acnum}</h1><br>
<h1>Customer ID :${cid}</h1><br>
<h3> <p style="font-style: italic; color:green;">${msg}</h3>
</center><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>