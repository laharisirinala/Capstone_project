<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE Html>
<html>
<head>   
<title>  
Bank Registration Form
</title>  
</head>  
<body bgcolor=FEF5E7>  
<center><br><br>
<H2>ICIN Bank Deposit Form</H2>

        <form method="post" action="bankdeposit">
        <center>
            <table align="center">
            <tr><td> <h3>Account ID</h3> </td><td> <input type="text" name="aid"></td></tr>
            <tr><td> <h3>Amount</h3> </td><td> <input type="text" name="amount"></td></tr>
            <tr><td> <h3>Password</h3> </td><td> <input type="password" name="pass"></td></tr>
                <tr><td colspan="2"> <center><button type="submit">Deposit</button></center></td></tr>
            </table>
           </center>
        </form>
</center>
</body>  
</div>
</html> 

