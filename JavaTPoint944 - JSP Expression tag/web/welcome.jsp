<%-- 
    Document   : welcome
    Created on : Mar 26, 2018, 5:18:14 PM
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
                     <!-- Expression Tag -->
        <h1><%= "Welcome "+ request.getParameter("name")%></h1>
    </body>
</html>
