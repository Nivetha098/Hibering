<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ include file="Header.jsp" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<div class="container">
<c:url var="url" value="/all/addPro"></c:url>
  <form:form method="post" action="addPro" modelAttribute="AddProduct" enctype="multipart/form-data">
  
   
    
    Enter ProductName:<form:input path="productname"/><br>
    <br>
    Enter ProductDescription:<form:textarea  path="productdesc"/><br>
    <br>
    Enter Quanity:<form:input path="quantity"/><br>
    <br>
    Enter Price:<form:input path="price"/><br>
    <br>
    Upload Image: <form:input type="file"  path="pimage"/> <br>
    <input type="submit" value="AddProduct"/>
    </form:form>
    
    
</div>
</body>
</html>