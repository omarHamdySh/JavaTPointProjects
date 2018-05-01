<%-- 
    Document   : errPage
    Created on : May 1, 2018, 7:06:33 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2><%=exception%></h2>
        <h2>${sessionScope.type}</h2>
    </body>
</html>
