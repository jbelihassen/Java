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
           <h1> Welcome <c:out value="${user.userName}"/> </h1>
           <p>Books from everyone's shelves!</p>
           
           <form action="/logout" method="post">
				<input  class="btn btn-outline-primary"   type="hidden" name="_method" value="LogOut"> 
				<input	type="submit" value="LogOut" class="btn btn-outline-primary">				
		   </form>
           
           <div>
                <a href="/books/new"> Add A Book</a>
           </div>
  
           </div> 

          <div class="container col-8">
		<h1  style="color: rgb(0,0,255);" >Save a Travel</h1>
		<table class="table table-bordered">
		<thead>
		      <tr>
		          <th> Title </th>
		          <th> Author Name  </th>
		          <th> Posted By </th>
		          <th> Created_at</th>
		          <th> Edit </th>
		          <th> Delete </th>
		                  
		      </tr>
		</thead>
		 <tbody>
		<c:forEach  items="${allBooks}" var ="oneBook">
		      <tr>
		       
		
		<td><a href="/books/${oneBook.id}"><c:out value="${oneBook.title }" /></a></td>
		<td> <c:out value="${oneBook.author}"></c:out> </td>
		<td> <c:out value="${oneBook.user.userName}"></c:out> </td>
		<td>   <fmt:formatDate type = "date" dateStyle = "long"  value = "${oneBook.createdAt}" />   </td>
		
		<c:if test="${user.id == oneBook.user.id}">
		<td><a href="/books/${oneBook.id}/edit" class="btn btn-outline-primary">Edit</a></td>
		     <td> <form action="/books/${oneBook.id}" method="post">
                   <input type="hidden" name="_method" value="delete">
                   <input type="submit" value="Delete" class="btn btn-outline-danger">
                </form> </td>
		</c:if>
		        </tr>
		</c:forEach>
		</tbody>
		</table>	
		</div>
</body>
</html>



