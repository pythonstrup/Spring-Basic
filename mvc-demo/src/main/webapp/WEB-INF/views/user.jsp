<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>
	<head>
		<title>Welcome</title>
	</head>
	
	<body>
		<form:form method="post" modelAttribute="user">
		<form:hidden path="guid"/>
			<fieldset>
				<form:label path="name">Name</form:label>
				<form:input path="name" type="text" required="required"/>
				<form:errors path="name" cssClass="text-warning"/>
			</fieldset>
			<fieldset>
				<form:label path="userId">User Id</form:label>
				<form:input path="userId" type="text" required="required"/>
				<form:errors path="userId" cssClass="text-warning"/>
			</fieldset>
			<fieldset>
				<form:label path="password">Password</form:label>
				<form:input path="password" type="text" required="required"/>
				<form:errors path="password" cssClass="text-warning"/>
			</fieldset>
			<fieldset>
				<form:label path="password2">Password2</form:label>
				<form:input path="password2" type="text" required="required"/>
				<form:errors path="password2" cssClass="text-warning"/>
			</fieldset>
			<input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>