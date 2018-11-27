<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
 
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<c:url var="url" value="/all/EditPro"></c:url>
  <form:form method="post" action="EditPro" modelAttribute="EditProduct" enctype="multipart/form-data">
  <br>
  Product ID:<form:input path="id" readonly="true"/> <br>
   <br>
    Enter ProductName:<form:input path="productname"/><br>
    <br>
    Enter ProductDescription:<form:input path="productdesc"/><br>
    <br>
    Enter Quantity:<form:input path="quantity"/><br>
    <br>
    Enter Price:<form:input path="price"/><br>
    <br>
    Upload new Image: <form:input type="file"  path="pimage"/> <br>
    <input type="submit" value="Edit"/>
    </form:form>
    
</div>
</body>
</html>