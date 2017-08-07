<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ include file="/WEB-INF/jsp/includes.jsp" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Manegment</title>
</head>
<body>
<h1>Student Form</h1>
<form:form action="student.do" method="post" commandName="student">
	<table>
<tr>
<td>SudentId</td>
<td><form:input path="studentId"/></td>
</tr>

<tr>
<td>Student Name</td>
<td><form:input path="studentName"/></td>
</tr>

<tr>
<td>Address</td>
<td><form:input path="address"/></td>
</tr>

<tr>
<td>Mobile NO</td>
<td><form:input path="mobileNo"/></td>
</tr>

<tr>
<td colspan="2">
<input type="submit" name="action" value="ADD"/>
<input type="submit" name="action" value="Edit"/>
<input type="submit" name="action" value="Delete"/>
<input type="submit" name="action" value="Search"/>
</td>

</tr>

	</table>
</form:form>
<br><br><br>

<table border="2">

<th>ID</th>
<th>NAME</th>
<th>ADRESS</th>
<th>MOBILE</th>

<c:forEach items="${studentList}" var="student">
<tr>
<td>${student.studentId}</td>
<td>${student.studentName}</td>
<td>${student.address}</td>
<td>${student.mobileNo}</td>

</tr>
</c:forEach>


</table>

</body>
</html>