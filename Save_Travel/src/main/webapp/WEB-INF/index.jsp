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
    <title>Travel</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>

       <div class="container col-8">
		<h1  style="color: rgb(0,0,255);" >Save a Travel</h1>
		<table class="table table-bordered">
		<thead>
		      <tr>
		          <th> Expense Name </th>
		          <th> Vendor </th>
		          <th> Amount </th>
		          <th>  Edit </th>
		          <th>  Delete </th>	          
		      </tr>
		</thead>
		 <tbody>
		<c:forEach  items="${allTravels}" var ="oneTravel"><tr>
		       
		
		<td><a href="/expenses/${oneTravel.id }"><c:out value="${oneTravel.expenseName }" /></a></td>
		<td> <c:out value="${oneTravel.vendor }"></c:out> </td>
		<td> <c:out value="${oneTravel.amount }"></c:out> </td>
		<td><a href="/expenses/edit/${oneTravel.id }" class="btn btn-outline-primary">Edit</a></td>
		<td> <form action="/travels/${oneTravel.id}" method="post">
                   <input type="hidden" name="_method" value="delete">
                   <input type="submit" value="Delete" class="btn btn-outline-danger">
                </form> </td>
		
		        </tr>
		</c:forEach>
		</tbody>
		</table>	
		</div>


    <div class="container   col-4">
			       <h1    style="color: rgb(0,0,255);"   >Add an expense</h1>
			
			 <form:form action="/travels" method="post" modelAttribute="travel">
			         <form:errors path="*"  style="color:red;" />     
			    <div  class="form-group" >
			        <form:label path="expenseName">Expense Name</form:label>
			<%--         <form:errors path="title"/> --%>
			        <form:input  class="form-control"          path="expenseName"/>
			    </div>
			    
			     <div  class="form-group" >
			        <form:label path="vendor">Vendor</form:label>
			<%--         <form:errors path="author"/> --%>
			        <form:input   class="form-control"     path="vendor"/>
			       
			    </div>
			    
			    
			    <div  class="form-group" >
			        <form:label path="amount">Amount</form:label>
			<%--         <form:errors path="pages"/>      --%>
			   <form:input   class="form-control"   min="0"  step="0.1"  type="number" path="amount"/>
			    </div>    

			     <div  class="form-group" >
			        <form:label path="description">Description</form:label>
			<%--         <form:errors path="pages"/>      --%>
			         <form:textarea    class="form-control"            path="description"/>
			    </div> 
			    
			    
			    <div  class="form-group">
			    
			    <input   class="btn btn-primary"     type="submit" value="Update"/>
			    </div>

			</form:form>    
 </div>
   
</body>
</html>



