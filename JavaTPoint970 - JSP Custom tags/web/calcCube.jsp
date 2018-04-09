<%-- 
    Document   : calcCube
    Created on : Apr 9, 2018, 7:55:00 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/mytags" prefix="m" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Nav.html"/>

        <h1>Calculate the cube of 10: <m:cube number="10"/></h1>
    </body>
</html>
