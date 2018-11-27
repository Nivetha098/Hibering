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
<c:url var="url" value="/all/EditCateg"></c:url>
  <form:form method="post" action="EditCateg" modelAttribute="EditCateg">
   Category ID:<form:input path="id" readonly="true"/> <br>
    Enter CategoryName:<form:input path="categoryname"/><br>
    <br>
    Enter CategoryDescription:<form:input path="categorydesc"/><br>
    <br>
    
    <input type="submit" value="Edit"/>
    </form:form>
    
</div>

</body>
</html>