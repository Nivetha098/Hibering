<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
<title>Insert title here</title>

</head>
<div class="container">
  <table class="table table-hover">
    <thead>
      <tr>
        <th>ProductId</th>
        <th>ProductName</th>
        <th>ProductDesc</th>
        <th>Quantity</th>
        <th>Price</th>
        <th>Image</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${productlist }" var="r">
     <tr>
        <td>${r.id}</td>
        <td>${r.productname}</td>
        <td>${r.productdesc}</td>
        <td>${r.quantity}</td>
        <td>${r.price}</td>
         <td><img src="<c:url value='/resources/images/${r.id }.png'></c:url>" height="40px" width="50px"></td><br>
          <td><a href="<c:url value='/all/edit?id=${r.id }'></c:url>">Edit</a>
    </td>
    <td><a href="<c:url value='/all/delete?id=${r.id }'></c:url>">Delete</a>
    </td>
   </tr>
     </c:forEach>
    </tbody>
  </table>
</div>
</html>
