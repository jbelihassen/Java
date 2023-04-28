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
        <div class="container   col-4">
			       <h1    style="color: rgb(0,0,255);"   >Add a Book</h1>
			
			 <form:form action="/books/create" method="post" modelAttribute="book">
			         <form:errors path="*"  style="color:red;" />     
			    <div  class="form-group" >
			        <form:label path="title">Title</form:label>
			<%--         <form:errors path="title"/> --%>
			        <form:input  class="form-control"          path="title"/>
			    </div>
			    
			     <div  class="form-group" >
			        <form:label path="author">Author</form:label>
			<%--         <form:errors path="author"/> --%>
			        <form:input   class="form-control"     path="author"/>
			       
			    </div>
			    

			     <div  class="form-group" >
			        <form:label path="thoughts">Thoughts</form:label>
			<%--         <form:errors path="pages"/>      --%>
			         <form:textarea    class="form-control"            path="thoughts"/>
			    </div> 
			    
			    
			    <div  class="form-group">
			     <form:hidden      path="user"       value="${user.id}" />
			    <input   class="btn btn-primary"     type="submit" value="Create"/>
			    </div>

			</form:form>    
 </div>
</body>
</html>



