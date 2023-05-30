<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/5/2023
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="/ControllerServlet">
    <table>
        <tr>
            <td>Tên</td>
            <td>Ngày sinh</td>
            <td>Địa chỉ</td>
            <td>Ảnh</td>
        </tr>
        <c:forEach items="${list}" var="s">
            <tr>
                <td>${s.name}</td>
                <td>${s.dateOfBirth}</td>
                <td>${s.address}</td>
                <td><img src="${s.picture}"></td>
            </tr>
        </c:forEach>
    </table>

</form>

</body>
</html>
