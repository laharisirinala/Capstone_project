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
<body>
<div id = "header">
<center>
<h1 style="color:white; font-size:40px;  float:center;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ICIN BANK  (Admin Login)</h1>
<h3   style="float:right"><a href="BankHomePage.jsp" style="color:white;">HOME</a>&nbsp;&nbsp;&nbsp;<a href="bankadminlogin.jsp" style="color:white;" >LOGOUT</a>&nbsp;&nbsp;&nbsp; </h3>
<h3   style="float:left">
<a href="blockuser" style="color:white;" target="right_side"  >Block User</a>&nbsp;&nbsp;&nbsp; 
<a href="permissioncashwithdraw" target="right_side" style="color:white;">Permissions for cashwithdraw</a>&nbsp;&nbsp;&nbsp; 
<a href="permissioncashdeposit" target="right_side" style="color:white;">Permissions for deposit</a>&nbsp;&nbsp;&nbsp; 
<a href="permissiontransferbtwaccounts" target="right_side" style="color:white;" >Permission for Cash Transfer</a>&nbsp;&nbsp;&nbsp; 
<a href="admingetcheckbook" target="right_side" style="color:white;" >CheckBook</a>&nbsp;&nbsp;&nbsp; 
</h3>
<iframe name="right_side" src="" width="99.8%"  
        height="320%" frameBorder="1" style="border:2px solid black;" allowfullscreen></iframe>
</center>
</div>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</center>
</div>
<div id = "footer" >
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<center><table>
<tr><th> <p style="font-style: italic; color:white;">We'd love for you to get in touch with us!<a href="#" class="fa fa-facebook"></a>
<a href="#" class="fa fa-twitter"></a>
<a href="#" class="fa fa-linkedin"></a></th></tr>
<tr> <td>     <p style="font-style: italic; color:white;">&copy;Copyright 2021 | ICIN BANK |ALL Rights Reserved</p>
</td></tr>
</tr>
</table>
</center>
</div>
</body>
</html>







