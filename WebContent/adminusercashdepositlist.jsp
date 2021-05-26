<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>display</title>
   <style>
    .button {
    display: block;
    width: 59px;
    height: 18px;
    background: black;
    padding: 10px;
    text-align: center;
    border-radius: 5px;
    color: white;
    font-weight: bold;
    line-height: 25px;
}
</style>
</head>
<body bgcolor=e6e6ff>
<center><h2>User Details</h2></center>
<table  width=60% align="center">
		
	   
	    
		<tr>
		<th><h3>CustID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
		<th><h3>UserName&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>AccountId&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>AccountType&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>AdharNo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>Mobileno&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>Address&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			
		</tr>
		
		<c:forEach var="s" items="${ll}">
			<tr>
				<td>${s.custid}</td>
				<td>&nbsp;&nbsp;${s.uname}</td>
				<td>${s.accountno}</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${s.accounttype}</td>
				<td>${s.adharno}</td>
				<td>${s.mobno}</td>
				<td>&nbsp;&nbsp;&nbsp;${s.address}</td>
				<td><a class="button" href="cashdepositallow/${s.custid}">Grant</a></td>
				<td><a class="button" href="cashdepositdeny/${s.custid}">Deny</a></td>
				
			</tr>
		</c:forEach>
				
	</table>
</body>
</html>