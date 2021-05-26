 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE Html>
<html>
<head>  
<style>
.box{
  background:#FEF5E7;
  width:300px;
  border-radius:6px;
  margin: 0 auto 0 auto;
  padding:0px 0px 70px 0px;
  border: black  ; 
} 
.login-form{
	text-security:circle;
	-webkit-text-security:circle;
}
 body {
  overflow-y: hidden; /* Hide vertical scrollbar */
  overflow-x: hidden; /* Hide horizontal scrollbar */
}
</style>
<title>  
Bank Registration Form
</title>  
</head>  
<body bgcolor=white>  
<jsp:include page="header.jsp"></jsp:include>
<center><br><br>
<div class="box"><br>
<H2>Bank Login Form</H2>

        <form method="post" action="banklogin">
        <center>
            <table align="center">
                <tr><td> <h3>Customer ID</h3> </td><td> <input type="text" name="cid"></td></tr>
                <tr><td><h3> Password</h3> </td><td> <input type="password" name="pass"></td></tr>
                <tr><td colspan="2"> <center><button type="submit" name="button">Login</button></center></td></tr>
            </table>
             <h2 style="color:red">  ${msg} </h2>
           </center>
        </form>
 </div>    
</center><br><br><br><br><br><br>
<jsp:include page="footer.jsp"></jsp:include>
</body>  
</div>
</html> 

