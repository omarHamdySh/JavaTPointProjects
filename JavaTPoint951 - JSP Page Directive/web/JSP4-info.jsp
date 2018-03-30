<%-- 
    Document   : JSP-info
    Created on : Mar 29, 2018, 1:12:47 AM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" info="Created By Omar Hamdy" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Third JSP Directive "info": </br> 
            will use the getServletInfo() method to get JSP "after compiling:servlet" info:</h1>
        <h2><%=getServletInfo()%></h2>
    </body>
</html>
