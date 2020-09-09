<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Employee Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="employee">
	
		Employee name: <form:input path="employeeName" />
		
		<br><br>
	
		Employee Id: <form:input path="employeeId" />
		
		<br><br>
	
		Employee Grade:
		
		<form:select path="employeeGrade">
		
			<form:options items="${employee.gradeOptions}" />
			
		</form:select>
				
		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>
