<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringMVC - Hello World</title>
    <style>
        table {
            border-collapse: collapse;
            margin: 1rem 0;
            display: block;
            overflow-x: auto;
        }

        tr {
            border-top: 1px solid #dfe2e5;
        }

        td, th {
            border: 1px solid #dfe2e5;
            padding: .6em 1em;
            text-align: left;
        }
    </style>
</head>
<body>

<h1>SpringMVC Hello World!</h1>

<table>
    <tr>
        <th>名称</th>
        <th>Controller</th>
        <th>描述</th>
    </tr>
    <tr>
        <td>文件上传</td>
        <td><a href="fileupload.jsp">FileUpload</a></td>
        <td>文件上传</td>
    </tr>
    <tr>
        <td>FlashMap</td>
        <td><a href="flashmap.jsp">FlashMap</a></td>
        <td>FlashMap为一个请求提供了一种存储用于另一个请求的属性的方法：
            FlashMap借助Session重定向前通过FlashMapManager将信息放入FlashMap,
            重定向后，再借助FlashMapManager从Session中找到重定向后需要的FlashMap
        </td>
    </tr>
    <tr>
        <td>@InitBinder</td>
        <td><a href="initBinder.jsp">InitBinder</a></td>
        <td></td>
    </tr>
    <tr>
        <td>@ModelAttribute</td>
        <td><a href="modelAttribute.jsp">ModelAttribute</a></td>
        <td></td>
    </tr>
    <tr>
        <td>拦截器</td>
        <td><a href="interceptor">Interceptor Chains</a></td>
    </tr>
</table>

</body>
</html>
