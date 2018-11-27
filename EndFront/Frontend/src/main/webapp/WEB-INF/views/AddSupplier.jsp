<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="Header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<title>Insert title here</title>
</head>
<body>
<div class="container">
<c:url var="url" value="/all/addsupp"></c:url>
  <form:form method="post" action="addsupp" modelAttribute="AddSupplier">
  
   
    
    Enter SupplierName:<form:input path="suppliername"/><br>
    <br>
    Enter SupplierDescription:<form:input path="supplierdesc"/><br>
    <br>
   
    <input type="submit" value="AddSuppplier"/>
    </form:form>
    
    
</div>

</body>
</html>