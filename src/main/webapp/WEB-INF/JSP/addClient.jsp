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

<form action="/admin/client/addClient1" id="client" method="post">
    <p>id:<input name="clientId" type="number"></p>
    <p>idCard:<input name="idCard" type="number"></p>
    <p>addTime:<input name="addTime" type="date"><p/>
    <p>clientType:<select name="clientType">
        <option value=${typeMap.get("0")}>${typeMap.get("0")}</option>
        <option value=${typeMap.get("1")} >${typeMap.get("1")}</option>
        <option value=${typeMap.get("2")}>${typeMap.get("2")}</option>
        <option value=${typeMap.get("3")}>${typeMap.get("3")}</option></select></p>
    <p>workPlace:<input name="clientType"></p>
    <p>phoneNumber:<input name="clientType"></p>
    <p>telephoneNumber:<input name="clientType"></p>
    <p>address:<input name="clientType"></p>
    <p>postCode:<input name="clientType"></p>
    <p>contact:<input name="clientType"></p>
    <p>email:<input name="clientType"></p>
    <p>id:<input name="repairId" type="number"></p>
    <p><input type="submit" value="提交"/></p>
</form>
<p>${msg}</p>
</body>
</html>
