<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 04-06-2024
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>User Registration Form</h3>
<form :form action="register" modelAttribute="user" method="POST">
    <table>

        <tr>
            <td>USER NAME :: </td>
            <td><form:input path="userName"  /> ></td>
        </tr>
        <tr>
            <td>Password :: </td>
            <td><form:input path="userPass"  /> ></td>
        </tr>
        <tr>
            <td>Email :: </td>
            <td><form:input path="userEmail"  /> ></td>
        </tr>
        <tr>
            <td>Phone :: </td>
            <td><form:input path="userPhone"  /> ></td>
        </tr>
        <tr>
            <td>Age :: </td>
            <td><form:input path="userAge"  /> ></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Register" >
            </td>
        </tr>
    </table>
</form>

</body>
</html>
