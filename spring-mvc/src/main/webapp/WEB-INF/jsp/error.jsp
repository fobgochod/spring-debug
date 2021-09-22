<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SpringMVC Error</title>
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

<h1>This is SpringMVC demo error page</h1>

<table>
    <tr>
        <th>提示信息</th>
    </tr>
    <tr>
        <td>${message}</td>
    </tr>
</table>

</body>
</html>
