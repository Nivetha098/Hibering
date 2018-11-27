<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
     <%@ include file="Header.jsp" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<div class="container">
            
  <table class="table table-hover">
    <thead>
      <tr>
        <th>SupplierId</th>
        <th>SuppplierName</th>
        <th>SupplierDesc</th>
      
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${supplierlist }" var="r">
     <tr>
        <td>${r.id}</td>
        <td>${r.suppliername}</td>
        <td>${r.supplierdesc}</td>
        <td><a href="<c:url value='/all/editsupplier?id=${r.id }'></c:url>">Edit</a>
    </td>
    <td><a href="<c:url value='/all/deletesupplier?id=${r.id }'></c:url>">Delete</a>
    </td>
     </tr>
     </c:forEach>
    </tbody>
  </table>
</div>
</html>