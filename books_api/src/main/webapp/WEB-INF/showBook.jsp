<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>


<meta charset="ISO-8859-1">
<title>Book</title>
</head>
<body>

           <div class="container col-6  text-bg-success p-3  mt-5"   >     
            <h1><h4> Title </h4> ${theBook.title} </h1>
             
            
            <p> <h4>  Description</h4> ${theBook.description} </p>
            <p>  <h4>  Language:</h4>  ${theBook.language}  </p>
            <p> <h4>  numberOfPages   </h4>  ${theBook.numberOfPages}  </p>
           </div>

</body>
</html>