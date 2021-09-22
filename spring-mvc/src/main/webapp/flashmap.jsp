<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FlashMap</title>
</head>
<%
    pageContext.setAttribute("ctx", request.getContextPath());
%>
<body>
<form action="${ctx}/flashmap" method="post">
    <input type="submit" value="提交">
</form>
</body>
</html>
