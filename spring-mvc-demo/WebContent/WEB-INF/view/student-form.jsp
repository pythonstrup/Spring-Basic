<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
	First name: <form:input path="firstName"/>
	<br><br>
	
	Last name: <form:input path="lastName"/>
	<br><br>
	
	Country: 
	<form:select path="country">
	
		<form:options items="${ student.countryOptions }" />
	
	<!-- 	<form:option value="Korea" label="Korea" />
		<form:option value="America" label="America" />
		<form:option value="Japan" label="Japan" />
		<form:option value="China" label="China" />  -->
	</form:select>
	<br><br>
	
	
	Favorite Language:
	
	<form:radiobutton path="favoriteLanguage" value="Java"/>Java 
	<form:radiobutton path="favoriteLanguage" value="C#"/>C# 
	<form:radiobutton path="favoriteLanguage" value="PHP"/>PHP 
	<form:radiobutton path="favoriteLanguage" value="Ruby"/>Ruby 
	<br><br>
	
	
	Operating Systems:
	
	<form:checkbox path="operatingSystems" value="Linux"/> Linux 
	<form:checkbox path="operatingSystems" value="Mac OS"/> Mac OS 
	<form:checkbox path="operatingSystems" value="MS Window"/> MS Window 
	
	<br><br>
	<input type="submit" value="Submit"/>
	
	</form:form>

</body>

</html>