<%-- 
    Document   : DoLoop
    Created on : Apr 9, 2018, 9:06:19 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="loopTags" prefix="m"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Nav.html"/>
        <m:loop end="5" start="0">  
            <h2>Hi!</h2>  
        </m:loop>  
    </body>
</html>
