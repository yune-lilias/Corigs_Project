<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	font-size: 24px;
}

</style>
</head>
<body>
         <div class="starter-template">
		   <h1>${type} Fail</h1>
         </div>
			<h2>${errormess}</h2>
           

<form:form method="POST"
           action="/home" modelAttribute="noused">
  <input type="submit" value="Home Page"/>
</form:form>


</body>
</html>