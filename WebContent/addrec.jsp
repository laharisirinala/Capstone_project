<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE Html>
<html>
<head>   
<title>  
Bank Registration Form
</title>  
</head>  
<body bgcolor=FEF5E7>  

<center>
<H1>Adding New Recipient</H1><br>
<form action="registerrecipient/${cid}" method="post">  
<br>
<label>Name of Receiver:</label>&nbsp; &nbsp; &nbsp; &nbsp; 
<input type="text" name="rname">
<br><br>
<label> Account ID of Receiver </label>         
<input type="text" name="raid" /> <br> <br>  
<label>Account Type:</label>
<input type="radio" name="atype" value="primary"/> Primary
<input type="radio"  name="atype" value="saving"/> Savings<br><br>
<label> MobileNo: </label>&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;         
<input type="number" name="mobno" /> <br><br>
<button type="submit">Add</button>     
</form>
</center>
</body>  
</html> 