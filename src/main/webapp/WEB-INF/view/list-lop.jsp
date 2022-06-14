<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Customers</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Lop Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Ma lop</th>
					<th>Ten Lop</th>
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
				
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/sinhvien/list">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>					

										
					
					<tr>
						<td> ${tempCustomer.id} </td>
						<td> ${tempCustomer.tenLop} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Sinh vien</a>
							
							
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









