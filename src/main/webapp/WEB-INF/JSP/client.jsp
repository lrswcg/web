<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.web.entity.ClientEntity" %><%--
  Created by IntelliJ IDEA.
  User: cnhhdn
  Date: 2016/6/27
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ClientList</title>
</head>
<body>
<a href="<c:url value="/admin/client/addClient"/>">
    添加
</a>
<c:forEach items="${clientList}" begin="0" var="client">
    <a href="<c:url value="/admin/client/detail?id=${client.clientId}"/>">
    ${client.clientId}
    </a>
    <p>${client.idCard}</p>
    <p>${client.addTime}</p>
    <a href="<c:url value="/admin/client/delete?id=${client.clientId}"/>">
        删除
    </a>
    <a href="<c:url value="/admin/client/detail?id=${client.clientId}"/>">
        更新
    </a>
</c:forEach>
<p>${msg}</p>
</body>
</html>
