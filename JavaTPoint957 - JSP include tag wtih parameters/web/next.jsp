<%-- 
    Document   : next
    Created on : Mar 30, 2018, 11:19:24 AM
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
        <h1><%=(Integer.parseInt(request.getParameter("n1"))*Integer.parseInt(request.getParameter("n2")))%> </h1>
    </body>
</html>
