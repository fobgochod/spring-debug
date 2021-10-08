<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("ctx", request.getContextPath());
%>
<html>
<head>
    <title>FileUpload</title>
</head>

<body>

<h1>单个文件上传</h1>
<form action="${ctx}/upload/file" enctype="multipart/form-data" method="post">
    <label>
        <span>文件描述：</span>
        <input type="text" name="desc"/>
        <br><br>
    </label>
    <label>
        <span>选择文件：</span>
        <input type="file" name="file"/>
        <br><br>
    </label>
    <label>
        <input type="submit" value="上传">
    </label>
</form>

<h1>多个文件上传</h1>
<form action="${ctx}/upload/files" enctype="multipart/form-data" method="post">
    <label>
        <span>选择文件：</span>
        <input type="file" name="files"/>
        <br><br>
    </label>
    <label>
        <span>选择文件：</span>
        <input type="file" name="files"/>
        <br><br>
    </label>
    <label>
        <input type="submit" value="上传">
    </label>
</form>

</body>
</html>
