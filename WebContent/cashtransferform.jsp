<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE Html>
<html>
<head>   
<title>  
Bank Registration Form
</title>  
</head>  
<body bgcolor=FEF5E7> 
<table align="center">
<tr><td><a href="addrecipient/${cid}"  target="right_side"><h2>Add New Receipient</h2><br></a></td></tr>
</table>
<center><h2>Existing Recipient Details</h2>
<table  width=50% align="center">

		<tr>
			<th><h3>Recipient Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>AccountId&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>Account Type&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th><h3>Mobileno&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
		</tr>
		
		<c:forEach var="s" items="${a}">
			<tr>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${s.name}</td>
				<td>${s.accid}</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${s.acctype}</td>
				<td>${s.mobno}</td>
				<td><a href="transfer/${cid}/${s.accid}"  target="right_side"><h3>Transfer</h3></a></a></td>
			</tr>
		</c:forEach>		
</table>
</center>
</body>  
</div>
</html> 
