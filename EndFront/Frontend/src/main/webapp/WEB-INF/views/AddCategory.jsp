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
<c:url var="url" value="/all/addCateg"></c:url>
  <form:form method="post" action="addCateg" modelAttribute="AddCategory">
  
   
    
    Enter CategoryName:<form:input path="categoryname"/><br>
    <br>
    Enter CategoryDescription:<form:input path="categorydesc"/><br>
    <br>
   
    <input type="submit" value="AddCategory"/>
    </form:form>
    
    
</div>


</body>
</html>