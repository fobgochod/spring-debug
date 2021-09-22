<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("ctx", request.getContextPath());
%>
<html>
<head>
    <title>FileUpload</title>
</head>
<body>
<form action="${ctx}/upload/file" enctype="multipart/form-data" method="post">
    描述：<input type="text" name="desc"><br><br>
    文件：<input type="file" name="file"><br><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
