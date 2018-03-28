<%-- 
    Document   : home
    Created on : Mar 27, 2018, 12:15:14 AM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello <%=config.getInitParameter("dbname")%></h1>
    </body>
</html>
