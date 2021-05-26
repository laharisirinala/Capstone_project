<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
div#header {
padding: 0px;
  margin-top:0px;
background-color: black;
height:120px;
font-color: white;
background-image: url("https://img.etimg.com/thumb/msid-77093694,width-1200,height-900,imgsize-125244,resizemode-8,quality-100/industry/banking/finance/banking/fairfax-backed-csb-bank-weighs-buying-out-other-old-private-banks-to-expand-its-balance-sheet.jpg");
background-repeat:no-repeat;
    background-position:left top;
     background-size: 190px 120px;
}
div#main {
border: solid 2px blue;
margin-left: 150px;
min-height: 510px;
margin-right: 0px;
background-image: url("https://images.unsplash.com/photo-1579621970795-87facc2f976d?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmFua2luZ3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
background-position: center center;
}
div#footer {
border: 2px solid black;
min-height: 60px;
background-color: powderblue;
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
</style>
 </head>
<body>
<div id = "header">
<center>
<h3   style="float:right"><a href="BankHomePage.jsp" style="color:white;">HOME</a>&nbsp;&nbsp;&nbsp;<a href="BankLogin.jsp" style="color:white;" >LOGOUT</a>&nbsp;&nbsp;&nbsp; 
<h1 style="color:white; font-size:50px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ICIN BANK</h1></center>
</h3>
</div>
<div id = "footer" >
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<center><table>
<tr><th>We'd love for you to get in touch with us!<a href="#" class="fa fa-facebook"></a>
<a href="#" class="fa fa-twitter"></a>
<a href="#" class="fa fa-linkedin"></a></th></tr>
<tr> <td>     <p style="font-style: italic;">&copy;Copyright 2021 | ICIN BANK |ALL Rights Reserved</p>
</td></tr>
</tr>
</table>
</center>
</div>
</body>
</html>