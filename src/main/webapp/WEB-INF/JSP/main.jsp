<%--
  Created by IntelliJ IDEA.
  User: cnhhdn
  Date: 2016/6/24
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

${hello} ${client}
${clientInfo.idCard}
${clientInfo.clientId}
${clientInfo.addTime}
${clientInfo.clientType}


<form action="/main" method="post">
    <p><input name="clientId" ></p>
    <p><input name="addTime"></p>
    <input type="submit" value="Submit" />
</form>

<form action="/addClient" method="post">
    <p><input name="clientId" type="text"></p>
    <p><input name="idCard" type="text"></p>
    <p><input name="addTime" type="date"></p>
    <input type="submit" value="Submit" />
</form>
<form action="/addClient1" method="post">
    <p><input name="idCard" id="idCard"></p>
    <p><input name="date" type="date"></p>
    <input type="submit" value="Submit" />
</form>
<form action="/login" method="post">
    <p><input name="username"></p>
    <p><input name="password"></p>
    <input type="submit" value="Submit" />
</form>
<form action="/logout" method="post">
    <input type="submit" value="Submit" />
</form>
<p>${msg}</p>
</body>
</html>
