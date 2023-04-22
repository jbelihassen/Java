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
<title>Insert title here</title>
</head>
<body>
<div  class="container   col-4    ">
       <h1>   Update Book  </h1>
       
       <form action="/books/${thebook.id}"    method='POST'>
            <input type="hidden" name="_method" value="put">
         <div  class="form-group" >
         <label>Title</label>
    	 <input  class="form-control"  path="title"           value="${thebook.title}"   type="text"    name="title">
    	 </div>
    	 <div  class="form-group"   >
	     <label>Description</label>
    	 <input  class="form-control"   path="description"        value="${thebook.description}"            type='text' name='description'>
    	 </div>
    	 
    	 <div class="form-group" >
    	 <label>Numbers Of Pages</label>
    	 <input class="form-control"      path="numberOfPages"               value="${thebook.numberOfPages}"         min="100"  max="9999"       type='number' name='pages'>
    	 </div>
    	 
    	 <div  class="form-group">
    	 <label>Language</label>
    	 <input class="form-control"   path="language"          value="${thebook.language}"                    type='text' name='language'>
    	 </div>
    	
    	 <div  class="form-group">
    	 <label>Create Book</label>	 
    	 <button class="btn btn-primary "> Update </button>
          </div> 
         
         </form>
       
    
       
      </div> 
       
       
       
       
       
</body>
</html>