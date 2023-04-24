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
    <title>Burger</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
 <div class="container col-8">
		<h1>Burger Tracker</h1>
		<table class="table">
		<thead>
		<tr>
		<th> Burger Name </th>
		<th> Restaurant Name </th>
		<th> Rating </th>
		<th> Action </th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${allBurgers}" var ="oneBurger">
		<tr>
		
		<td> <c:out value="${oneBurger.burgerName }"/> </td>
		<td> <c:out value="${oneBurger.restaurantName }"></c:out> </td>
		<td> <c:out value="${oneBurger.rating }"></c:out> </td>
		<td><a href="/edit/${oneBurger.id }" class="btn btn-danger">Edit</a> 
		
		
		</tr>
		</c:forEach>
		</tbody>
		</table>	
		</div>



      <div class="container   col-4">
   <h1>Add a Burger</h1>

 <form:form action="/burgers" method="post" modelAttribute="burger">
         <form:errors path="*"  style="color:red;" />     
    <div  class="form-group" >
        <form:label path="burgerName">Burger Name</form:label>
<%--         <form:errors path="title"/> --%>
        <form:input  class="form-control"          path="burgerName"/>
    </div>
     <div  class="form-group" >
        <form:label path="restaurantName">Restaurant Name</form:label>
<%--         <form:errors path="author"/> --%>
        <form:input   class="form-control"     path="restaurantName"/>
       
    </div>
    <div  class="form-group" >
        <form:label path="rating">Rating</form:label>
<%--         <form:errors path="pages"/>      --%>
        <form:input   class="form-control"   min="0"   max="5"         type="number" path="rating"/>
    </div>    
    
     <div  class="form-group" >
        <form:label path="notes">Note</form:label>
<%--         <form:errors path="pages"/>      --%>
         <form:textarea    class="form-control"            path="notes"/>
    </div> 
    <div  class="form-group">
    <input   class="btn btn-primary"     type="submit" value="Submit"/>
    </div>
</form:form>    
</div>
</body>
</html>



