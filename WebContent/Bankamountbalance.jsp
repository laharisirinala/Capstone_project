<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>display</title>
</head>
<body bgcolor=FEF5E7>
<br>
<center>
		
		<c:forEach var="shoe" items="${kk}">
			
		<h2>Amount Balance	 <p style="font-style: italic; color:green;">	Rs/- ${shoe.balance}</p></h2>
		
		</c:forEach>
				
	</center>
	</body>
	</html>