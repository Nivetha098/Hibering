 <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">The CrEaMy</a>
    </div>
    <ul class="nav navbar-nav">
     <li class="active"><a href="<c:url value="/Home"></c:url>"><span class="glyphicon glyphicon-home"></span>Home</a></li>
      
      <li><a href="<c:url value="/all/AboutUs"></c:url>">Aboutus</a></li>
      <li><a href="<c:url value="/all/Products"></c:url>">Products</a></li>
       
          <li><a href="<c:url value="/cart/getcart"></c:url>"><span class="glyphicon glyphicon-shopping-cart"></span></a></li>	
          
          
        </ul>
     
    
    
    <ul class="nav navbar-nav navbar-right">
      <li><a href="<c:url value="/all/getregistrationform"></c:url>"><span class="glyphicon glyphicon-user"></span>Register</a></li>	
      <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
             <li><a href="<c:url value="/logout"></c:url>">Logout</a></li>
      
    </ul>
  </div>
</nav>

</body>
  

</head>
</html>
