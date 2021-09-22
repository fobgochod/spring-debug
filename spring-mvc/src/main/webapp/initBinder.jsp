<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("ctx", request.getContextPath());
%>
<html>
<head>
    <title>InitBinder</title>
</head>
<body>
<form action="${ctx}/param2" method="post">
    User name:<br>
    <input type="text" name="u.name">
    <br>
    User age:<br>
    <input type="text" name="u.age">
    <br>
    <br>

    Student name:<br>
    <input type="text" name="s.name">
    <br>
    Student age:<br>
    <input type="text" name="s.age">
    <br>
    <br>

    <input type="submit">
</form>
</body>
</html>
