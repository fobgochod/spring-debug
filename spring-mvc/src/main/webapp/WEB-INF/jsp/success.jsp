<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SpringMVC Success</title>
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
        }
    </style>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>This is SpringMVC demo success page</h1>

<h3>Message</h3>
<table>
    <tr>
        <th>信息</th>
    </tr>
    <tr>
        <td>${message}</td>
    </tr>
</table>

<h3>UserList</h3>
<table>
    <tr>
        <th>ID</th>
        <th>名称</th>
        <th>年龄</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.id}"/></td>
            <td><c:out value="${user.name}"/></td>
            <td><c:out value="${user.age}"/></td>
        </tr>
    </c:forEach>
</table>

<h3>InitBinder</h3>
<table>
    <tr>
        <th>名称</th>
        <th>年龄</th>
        <th>日期</th>
        <th>密码</th>
        <th>性别</th>
    </tr>
    <tr>
        <td>${name}</td>
        <td>${age}</td>
        <td>${date}</td>
        <td>${gd.password}</td>
        <td>${gd.gender}</td>
    </tr>
</table>

<h3>InitBinder</h3>
<table>
    <tr>
        <th>类型</th>
        <th>名称</th>
        <th>年龄</th>
    </tr>
    <tr>
        <td>User</td>
        <td>${user.name}</td>
        <td>${user.age}</td>
    </tr>
    <tr>
        <td>Student</td>
        <td>${student.name}</td>
        <td>${student.age}</td>
    </tr>
</table>

<h3>FlashMap</h3>
<table>
    <tr>
        <th>作者</th>
        <th>单号</th>
        <th>语言</th>
    </tr>
    <tr>
        <td>${author}</td>
        <td>${orderCode}</td>
        <td>${local}</td>
    </tr>
</table>

</body>
</html>
