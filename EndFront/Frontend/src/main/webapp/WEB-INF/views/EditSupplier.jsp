<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <form:form method="post" action="EditSupp" modelAttribute="EditSupplier">
    Supplier ID:<form:input path="id" readonly="true"/> <br>
    Enter SupplierName:<form:input path="suppliername"/><br>
    <br>
    Enter SupplierDescription:<form:input path="supplierdesc"/><br>
    <br>
   
    <input type="submit" value="Edit"/>
    </form:form>
    
</div>

</body>
</html>