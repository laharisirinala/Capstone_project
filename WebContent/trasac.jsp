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
<H2>Money Transfer</H2><br><br>
<table  width=35% align="center">
		<c:forEach var="s" items="${kk}">
	   
	   <h3>
			NAME&nbsp;&nbsp;&nbsp;&nbsp; ${s.name}<br>
		    ACCOUNT ID&nbsp;&nbsp;&nbsp;&nbsp;${s.accid}<br>
			ACCOUNT TYPE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${s.acctype}<br>
			MOBILE NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${s.mobno}<br>			
		</h3>
</table>

        <form action="val/${s.name}/${s.accid}/${s.acctype}/${s.mobno}" method="post">
        <center>
            <table align="center">
            <tr><td> <h3>Amount</h3> </td><td> <input type="number" name="amount"></td></tr>
            <tr><td> <h3>Password</h3> </td><td> <input type="text" name="pass"></td></tr>
                <tr><td><button type="submit">Transfer</button></center></td></tr><center>
            </table>
           </center>
        </form>
        	</c:forEach>
</center>
</body>  
</div>
</html> 

