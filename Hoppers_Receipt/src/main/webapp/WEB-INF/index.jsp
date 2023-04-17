<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
		<!-- New line below to use the JSP Standard Tag line  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Receipt</title>
</head>
<body>
	<h1>
	 Customer Name : <c:out value="${nameKey}" />
	</h1>
	<p>
	ItemName :	<c:out value="${itemKey}" />
	</p>
	<p>
	Price : $	<c:out value="${priceKey}" />
	</p>
	<p>
	Description :	<c:out value="${descriptionKey}" />
	</p>
	<p>
	Vendor :	<c:out value="${vendorKey}" />
	</p>

</body>
</html>