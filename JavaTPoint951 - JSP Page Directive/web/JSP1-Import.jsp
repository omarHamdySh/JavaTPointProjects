<%-- 
    Document   : JSP-Import
    Created on : Mar 29, 2018, 1:11:33 AM
    Author     : omarhamdy
--%>

<%@page import="java.util.Date" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>The first directive "import"</h1>
        <h3> we'd imported "Java.util.Date" and printed the system date</h3>
        <h5>Today is: <%= new Date().toString() %> </h5>
    </body>
</html>
