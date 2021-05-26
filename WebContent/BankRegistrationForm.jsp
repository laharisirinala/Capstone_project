<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE Html>
<html>
<head>   
<title>  
Bank Registration Form
</title>  
</head>  
<body bgcolor=FEF5E7>  
<jsp:include page="header.jsp"></jsp:include>
<div>

<center>
<H2>ICIN Bank Registration Form</H2>
<form action="userregister" method="post">  
<label> FirstName </label>         
<input type="text" name="fname" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label> LastName </label>         
<input type="text" name="lname" /> <br> <br> 
<label> Username </label>         
<input type="text" name="uname" /> <br> <br>  
<label>Password:</label>  
<input type="Password" id="pass" name="pass"><br><br>  
<label>Account Type:</label>
<input type="radio" name="atype" value="primary"/> Primary
<input type="radio"  name="atype" value="saving"/> Savings<br><br>   
<label>   
Date of Birth: 
</label>
<input type="date" name="dd" placeholder="dd-mm-yyyy">
<br><br>
<label>Gender :</label>
<input type="radio" name="gender" value="male"/> Male
<input type="radio"  name="gender" value="female"/> Female  
<input type="radio"  name="gender" value="other"/> Other<br><br>   
<label>   
Mobile_No:  
</label>  
<input type="text" id="phone" name="phone" /> <br> <br>  
Address  
<textarea cols="40" rows="1.5" name="address">  
</textarea>  
<br> <br> 
<label>   
Adhar No: 
</label>  
<input type="number" name="anum" /> <br> <br>   
Email:&nbsp;&nbsp;&nbsp;  
<input type="email" id="email" name="email"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
Country:  
<input type="text" id="text" name="country"/> <br>    
<br>    
<label>  

<button type="submit">REGISTER</button>
</form> 
</center>
<jsp:include page="footer.jsp"></jsp:include>
</body>  
</div>
</html> 