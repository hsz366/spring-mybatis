<%--
  Created by IntelliJ IDEA.
  User: Filter
  Date: 2020/6/12
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello,
    <c:forEach var="p" items="${all}">
        <p>${p.id}</p>
        <p>${p.name}</p>
        <p>${p.password}</p>
    </c:forEach>
</body>
</html>
