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
<title>Omikuji</title>
</head>
<body>

      <div class="container" >
         
         <h1> Send an Omikuji !!</h1>
         <form action="/form"    method='POST'>
         <div  class="form-control" >
         <label>Pich any number from 5 to 25</label>
    	 <input type="number" min="5"  max="25" name="year"  >
    	 </div>
    	 <div  class="form-control"   >
	     <label>Enter the name of any city </label>
    	 <input type='text' name='city'>
    	 </div>
    	 
    	 <div class="form-group" >
    	 <label>Enter the name of any real person </label>
    	 <input class="form-control"   type='text' name='name'>
    	 </div>
    	 
    	 <div  class="form-group"    >
    	 <label>Enter professionnal endeavor or hobby</label>
    	 <input class="form-control"        type='text' name='hobby'>
    	 </div>
    	 
    	 <div  class="form-group" >
    	 <label>Enter any type of living thing</label>
    	 <input class="form-control"    type='text' name='type'>
    	 </div>
    	 
    	 
    	 <div   class="form-group" >
    	 <label>  Say something nice to semeone </label>  
    	 <textarea class="form-control"     rows="5" cols="20"  name='description'    >  </textarea>
    	 </div>
    	 <div  class="form-group">
    	 <label>Send and show a friend </label>	 
    	 <button class="btn btn-primary "> Send </button>
          </div> 
          
          
          
          
         </form>
       
      </div>
</body>
</html>