<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
div#header {
background-color: black;
height:75px;
font-color: white;

}
div#main {
border: solid 2px black;
margin-left: 0px;
min-height: 510px;
margin-right: 0px;
background-image: url("https://images.unsplash.com/photo-1579621970795-87facc2f976d?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmFua2luZ3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
background-position: center center;
}

div#footer {
border: 2px solid black;
min-height: 60px;
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
</style>
 </head>
<body>
<div id = "header" >
<br>
<h3  style="float:right"><a href="BankLogin.jsp" style="color:white;" >LOGIN</a>&nbsp;&nbsp;&nbsp; <a href="BankRegistrationForm.jsp" style="color:white;">REGISTER</a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
This is a heading</h3>
</div>

<div id = "main" >
 <center>
<br><br><br>
<h1 style=font-size:100px>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ICIN BANK</h1>
</center>
</div>
<div id = "footer" >
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<center><table>
<tr><th><p style="font-style: italic; color:white;">We'd love for you to get in touch with us!<a href="#" class="fa fa-facebook"></a>
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