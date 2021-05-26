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
<H2>ICIN Bank Withdrawal Form</H2>

        <form method="post" action="bankdraw">
        <center>
            <table align="center">
            <tr><td> <h3>Account ID</h3> </td><td> <input type="text" name="aid"></td></tr>
            <tr><td> <h3>Amount</h3> </td><td> <input type="text" name="amount"></td></tr>
            <tr><td> <h3>Password</h3> </td><td> <input type="text" name="pass"></td></tr>
                <tr><td colspan="2"> <center><button type="submit">Withdraw</button></center></td></tr>
            </table>
           </center>
        </form>
</center>
</body>  
</div>
</html> 

