<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>display</title>
</head>
<body bgcolor=FEF5E7>
<table align="center"><tr><td><h2>Transaction Details</h2></td></tr></table>
<table  width=50% align="center">
		
	   
	    
		<tr>
			<th><h3>TransactionId&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>Receiver_AccountId&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>Cash Transfered&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>Balance After Transaction&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>TransferedTo&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>ReceivedFrom&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>Type&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>DateOfTransaction&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>Time&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
		</tr>
		
		<c:forEach var="s" items="${th}">
			<tr>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${s.tid}</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;${s.accid}</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;${s.amount}</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;${s.balance}</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;${s.toperson}</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;${s.fromperson}</td>
				<td>${s.type}</td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;    ${s.date}</td>
				
				<td>${s.time}</td>
			</tr>
		</c:forEach>
				
	</table>
</body>
</html>