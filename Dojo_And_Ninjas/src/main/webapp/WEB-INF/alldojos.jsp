<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
         	<div class="container col-6">
		<a href="/dojos/new" class="btn btn-secondary">Add New</a>
		<a href="/" class="btn btn-info">Home</a>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>

					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="oneDojo" items="${allDojos}">
					<tr>
						<td><a href="/dojos/${oneDojo.id}"> ${oneDojo.name}</a></td>

						<td>
						<a href="/dojos/edit/${oneDojo.id}"
							class="btn btn-secondary">Edit</a>
							<form action="/dojos/${oneDojo.id}" method="post" style="display: inline;">
								<input type="hidden" name="_method" value="delete"> <input
									type="submit" value="Delete" class="btn btn-danger">
							</form>
						</td>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>
</body>
</html>



