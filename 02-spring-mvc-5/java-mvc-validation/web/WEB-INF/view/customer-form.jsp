<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>
        ua.alvin.Customer Registration Form
    </title>
    <style>
        .error{
            color: coral;
        }
    </style>

</head>
<body>

<form:form action="processedForm" modelAttribute="customer">

    <i>Fill out the form:</i>
    <br>
    First name: <form:input path="firstName"/>
    <br>
    Last name: (*) <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br>
    <input type="submit" value="Register">

</form:form>
</body>
</html>