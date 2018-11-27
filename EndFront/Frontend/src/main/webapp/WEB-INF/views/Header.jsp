<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ page isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <p> The CrEaMy </p>
    </div>
    <ul class="nav navbar-nav">
    
      <li><a href="<c:url value="/home"></c:url>"><span class="glyphicon glyphicon-home"></span>Home</a></li>
      
      <li><a href="<c:url value="/all/AboutUs"></c:url>">AboutUs</a></li>
      <li><a href="<c:url value="/all/Products"></c:url>">Products</a></li>
       <security:authorize access="hasRole('ROLE_ADMIN')">
                 <li><a href="<c:url value="/all/Admin"></c:url>">Administrator</a></li>
       
      
        
          </security:authorize>
          <li><a href="<c:url value="/cart/getcart"></c:url>"><span class="glyphicon glyphicon-shopping-cart"></span></a></li>	
          
          
        </ul>
     
    
    
    <ul class="nav navbar-nav navbar-right">
      <li><a href="<c:url value="/all/getregistrationform"></c:url>"><span class="glyphicon glyphicon-user"></span>Register</a></li>	
      <li><a href="<c:url value="/Login"></c:url>"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>	
       <li><a href="<c:url value="/logout"></c:url>">Logout</a></li>
      
    </ul>
  </div>
  
</nav>



</body>
</html>