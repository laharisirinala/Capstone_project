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
<h1 style="color:white; font-size:40px;  float:center;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ICIN BANK</h1>
<h2   style="float:right"><a href="BankHomePage.jsp" style="color:white;">HOME</a>&nbsp;&nbsp;&nbsp;<a href="BankLogin.jsp" style="color:white;" >LOGOUT</a>&nbsp;&nbsp;&nbsp; </h2>
<h3   style="float:left">
<a href="bankamountbalance/<c:out value='${cid}'/>" style="color:white;" target="right_side"  >Account Balance</a>&nbsp;&nbsp;&nbsp; 
<a href="checkdeposit/<c:out value='${cid}'/>" target="right_side" style="color:white;" >Deposit</a>&nbsp;&nbsp;&nbsp; 
<a href="checkwithdrawal/<c:out value='${cid}'/>" target="right_side" style="color:white;" >Withdrawal</a>&nbsp;&nbsp;&nbsp; 
<a href="checktransferbtwacc/<c:out value='${cid}'/>" target="right_side" style="color:white;" >Cash Transfer</a>&nbsp;&nbsp;&nbsp; 
<a href="transhistory/<c:out value='${cid}'/>"  target="right_side" style="color:white;">Transaction History</a>&nbsp;&nbsp;&nbsp;
<a href="request/<c:out value='${cid}'/>"  target="right_side"  style="color:white;">Request Check Book</a>&nbsp;&nbsp;&nbsp;
<a href="notification/<c:out value='${cid}'/>"  target="right_side"  style="color:white;">Notifications</a>&nbsp;&nbsp;&nbsp;
</h3>
<iframe name="right_side" src="" width="99.8%"  
        height="317%" frameBorder="1" style="border:2px solid black;" allowfullscreen></iframe>
</center>
</div>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
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