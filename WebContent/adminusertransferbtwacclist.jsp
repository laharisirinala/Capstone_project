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
<table  width=50% align="center">
		
	   
	    
		<tr>
		<th><h3>CustID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
		<th><h3>UserName&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>AccountId&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>AccountType&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>AdharNo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>Mobno&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>Address&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			
		</tr>
		
		<c:forEach var="s" items="${ll}">
			<tr>
				<td>&nbsp;${s.custid}</td>
				<td>&nbsp;&nbsp;${s.uname}</td>
				<td>${s.accountno}</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${s.accounttype}</td>
				<td>${s.adharno}</td>
				<td>${s.mobno}</td>
				<td>&nbsp;&nbsp;&nbsp;${s.address}</td>
				<td><a class="button" href="transferbtwaccallow/${s.custid}">&nbsp;GRANT</a></td>
				<td><a class="button" href="transferbtwaccdeny/${s.custid}">&nbsp;DENY</a></td>
				
			</tr>
		</c:forEach>
				
	</table>
</body>
</html>