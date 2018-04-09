<%-- 
    Document   : doPower
    Created on : Apr 9, 2018, 8:26:13 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/powerTag" prefix="m"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Nav.html"/>
        <h1> 2^2=<m:power number="2" power="2">  
</m:power>   </h1>
    </body>
</html>
