<%-- 
    Document   : welcome
    Created on : Mar 26, 2018, 4:30:05 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>              <!-- Scriptlet tag -->
        <h1>Hello <% String n= request.getParameter("name");out.print(n);%></h1>
    </body>
</html>
