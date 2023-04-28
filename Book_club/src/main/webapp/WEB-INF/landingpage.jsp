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
    <title>Login And Registration</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>

        
         <div class="container">
         
			 <div  class="col-6">
                   <h1>Landing Page</h1>
             </div>	   
				   <!-- REGISTER A NEW USER  -->
				   <!-- bring in the newUser empty Object -->
						
		<div class="row mt-3">
		<div class="register col bg-light">
			<h3>Register:</h3>
			<form:form action="/register" method="post" modelAttribute="newUser">
			
				<div class="form-group">
					<label>User Name:</label>
					<form:input path="userName" class="form-control" />
					<form:errors path="userName" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Email:</label>
					<form:input path="email" class="form-control" />
					<form:errors path="email" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Password:</label>
					<form:password path="password" class="form-control" />
					<form:errors path="password" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Confirm Password:</label>
					<form:password path="confirm" class="form-control" />
					<form:errors path="confirm" class="text-danger" />
				</div>
				<div class="mt-3" >
				     <input type="submit" value="Register" class="btn btn-primary" />
				</div>
				
			</form:form>
		</div>
        
        
        <div class="col-3" ></div>
		<!-- LOGIN -->
		<!-- newLogin object will touch the model to validate only -->
		
		
		<div  class="login col bg-light">
			<h3>Login:</h3>
			<form:form action="/login" method="post" 
			modelAttribute="newLogin">
				<div class="form-group">
					<label>Email:</label>
					<form:input path="email" class="form-control" />
					<form:errors path="email" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Password:</label>
					<form:password path="password" class="form-control" />
					<form:errors path="password" class="text-danger" />
				</div>
				<div class="mt-3" >
				<input type="submit" value="Login" class="btn btn-success" />
				</div>
			</form:form>
		</div>
   </div>
   </div>
</body>
</html>



