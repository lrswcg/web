<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: cnhhdn
  Date: 2016/6/27
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail</title>
</head>
<body>

<form:form action="/admin/client/update" commandName="client" method="post" id="client">
    <p>id:<form:input path="clientId"/></p>
    <p>idCard:<form:input path="idCard"/></p>
    <p>addTime:<form:input path="addTime" type="date"/></p>
    <p>clientType:<form:select path="clientType" items="${typeMap}"/></p>
    <p>workPlace:<form:input path="workPlace"/></p>
    <p>phoneNumber:<form:input path="phoneNumber"/></p>
    <p>telephoneNumber:<form:input path="telephoneNumber"/></p>
    <p>address:<form:input path="address"/></p>
    <p>postCode:<form:input path="postCode"/></p>
    <p>contact:<form:input path="contact"/></p>
    <p>email:<form:input path="email"/></p>
    <p>repairId:<form:input path="repairId"/></p>
    <p><input type="submit" value="提交"/></p>
</form:form>
<p>${msg}</p>
</body>
</html>
