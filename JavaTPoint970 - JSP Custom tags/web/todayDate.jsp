<%-- 
    Document   : index
    Created on : Apr 9, 2018, 7:33:56 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/mytags" prefix="m" %>  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Nav.html"/>

        <h1>Today date and time: <m:today/></h1>
    </body>
</html>
