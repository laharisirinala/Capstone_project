<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>display</title>
   <style>
    .button {
    display: block;
    width: 70px;
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
<center>
		<c:forEach var="shoe" items="${kk}">
		<br>
			<h3>Account No:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${shoe.accountno}<br><br>
				User Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ${shoe.uname}<br><br>
				Address:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ${shoe.address}<br><br>
				Mobile No:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ${shoe.mobno}<br><br>
				Account Type:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${shoe.accounttype}</h3>
<h2>Want to request for check book ??</h2>
<a class="button" href="checkbook/${shoe.accountno}/${shoe.uname}/${shoe.address}/${shoe.mobno}/${shoe.custid}/${shoe.accounttype}">YES</a>	<br>
<a class="button" href="no">No</a>	

</c:forEach>
</center>
</body>
</html>