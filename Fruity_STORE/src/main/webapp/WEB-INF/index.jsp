<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">

<meta charset="ISO-8859-1">
<title>Fruit Store</title>
</head>
<body>

	<h1> Fruit Store </h1>
	
	<table>
	<tbody>
	<tr>
	       <th> Name </th>
	       <th> Price </th>
	</tr>
	<c:forEach var="element" items="${fruits}">
	<tr>
	
	   <td>  <c:out value="${element.name}" /> </td>
	   <td>  <c:out value="${element.price}" /> </td>
	
	    
	</tr>
	 </c:forEach>
	 </tbody>
	</table>
		

</body>
</html>