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
<body bgcolor=FEF5E7>
<br>
<table align="center"><tr><td><h2>User Details</h2></td></tr><br></table><br>
<table  width=35% align="center">
		
	   
	    
		<tr>
		<th>CustID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
		<th>UserName&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th>AccountId&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th>AccountType&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th>AdharNo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th>Mobno&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th>Address&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			
		</tr>
		
		<c:forEach var="s" items="${ll}">
			<tr>
				<td>${s.custid}</td>
				<td>${s.uname}</td>
				<td>${s.accountno}</td>
				<td>${s.accounttype}</td>
				<td>${s.adharno}</td>
				<td>${s.mobno}</td>
				<td>${s.address}</td>
				<td><a class="button" href="block/${s.custid}">Block</a></td>
				<td><a class="button" href="unblock/${s.custid}">UnBlock</a></td>
				
			</tr>
		</c:forEach>
				
	</table>
</body>
</html>