<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanDao" class="com.infinite.hib.EmployDAO"/>
	<table border="3" align="center">
	<tr>
		<th>Employ Id</th>
		<th>Employ Name</th>
		<th>Mail</th>
		<th>Mobile No</th>
		<th>Date Of Join</th>
        <th>Department</th>
		<th>Manager Id</th>
		<th>Leave Bal</th>
		
	</tr>
	<c:forEach var="employ" items="${beanDao.showEmploy()}">
		<tr>
			<td>${employ.empId}</td>
			<td>${employ.empName}</td>
			<td>${employ.mail}</td>
			<td>${employ.mobileNo}</td>
			<td>${employ.dateOfJoin}</td>
			<td>${employ.dept}</td>
			<td>${employ.managerId}</td>
			<td>${employ.leaveBal}</td>
			
		</tr>
	</c:forEach>
	</table>
	
</body>
</html>