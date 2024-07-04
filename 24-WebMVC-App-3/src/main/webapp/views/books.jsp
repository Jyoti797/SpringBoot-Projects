<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 04-06-2024
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib url="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>books</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Book ID</th>
        <th>Book Name</th>
        <th>Book Price</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${book.bookId}</td>
        <td>${book.bookName}</td>
        <td>${book.bookPrice}</td>
    </tr>
    </tbody>
</table>

</body>
</html>
