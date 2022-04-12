<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringMVC - Java Thread Info</title>
</head>
<body>

<h1>服务器线程信息</h1>

<pre>
<%
    for (Map.Entry<Thread, StackTraceElement[]> stackTrace : Thread.getAllStackTraces().entrySet()) {
        Thread thread = stackTrace.getKey();
        StackTraceElement[] stack = stackTrace.getValue();
        if (thread.equals(Thread.currentThread())) {
            continue;
        }
        out.print("\n线程" + thread.getName() + "\n");
        for (StackTraceElement element : stack) {
            out.print("\t" + element + "\n");
        }
    }
%>
</pre>

</body>
</html>
