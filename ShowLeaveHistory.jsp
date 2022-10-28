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
<jsp:useBean id="beanDao" class="com.infinite.hib.LeaveDAO"/>
	<table border="3" align="center">
	<tr>
		<th>Leave Id</th>
		<th>Leave No of Days</th>
		<th>Leave ManagerComments</th>
		<th>Employ Id</th>
		<th>Leave StartDate</th>
        <th>Leave EndDate</th>
		<th>Leave Type</th>
		<th>Leave Status</th>
		<th>Leave Reason</th>
		
	</tr>
	<c:forEach var="leave" items="${beanDao.showLeaveHistory()}">
		<tr>
			<td>${leave.leaveId}</td>
			<td>${leave.leaveNoofDays}</td>
			<td>${leave.leaveMngrCmts}</td>
			<td>${leave.empId}</td>
			<td>${leave.leaveStartDate}</td>
			<td>${leave.leaveEndDate}</td>
			<td>${leave.leaveType}</td>
			<td>${leave.leaveStatus}</td>
		    <td>${leave.leaveReason}</td>
			
			
		</tr>
	</c:forEach>
	</table>
	
</body>
</html>