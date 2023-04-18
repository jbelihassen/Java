<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<meta charset="ISO-8859-1">
<title>Omikuju</title>
</head>
<body>

      <div  class="myDiv"      >
         <h1> Here's Your Omikuji !!! </h1>
         
         <p> In <c:out value="${year}"/> years,you will  </p>
         <p> live in <c:out value="${city}"/> with   </p>
         <p><c:out value="${name}"/> as your </p> 
         <p> roommate,<c:out value="${hobby}"/></p>
         <p>  for a living.</p>
         <p> The next time you  </p>
         <p> see a <c:out value="${type}"/>, you will have good luck,also  </p>
         <p>  <c:out value="${description}"/>  </p>
         
         <p><a href="/omikuji">Go Back</a></p> 
      </div> 

</body>
</html>