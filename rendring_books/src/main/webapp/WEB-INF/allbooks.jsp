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
<title>Books</title>
</head>
<body>
<div class="container">
    <h1> All Books </h1>
    
    <table  class="table table-hover">
	<tbody>
	<tr>
	       <th> Id </th>
	       <th> Title </th>
	       <th> Description </th>
	       <th> Language </th>
	       <th> Pages </th>
	       <th> Edit </th>
	       <th> Delete </th>
	</tr>
	<c:forEach var="book"  items="${allBooks}">
	<tr>
	
	    <td> ${book.id}</td>
	    <td>  <a href="/books/${book.id}">${book.title}</a></td>
	    <td>  ${book.description}  </td>
	    <td>  ${book.language}  </td>
	    <td>  ${book.numberOfPages}  </td>
	    <td>  <a class="btn btn-primary" href="/books/update/${book.id}" role="button">Edit</a></td>    
	    <td>  <form action="/books/${thebook.id}"      method="post">
             <input type="hidden" name="_method" value="delete">
             <input  class="btn btn-danger"    type="submit" value="Delete">
              </form>   </td>   
	    
	</tr>
	 </c:forEach>
	 </tbody>
	</table>
</div>
</body>
</html>