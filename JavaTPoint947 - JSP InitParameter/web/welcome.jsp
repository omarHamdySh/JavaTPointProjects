<%-- 
    Document   : welcome
    Created on : Mar 26, 2018, 11:53:16 PM
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