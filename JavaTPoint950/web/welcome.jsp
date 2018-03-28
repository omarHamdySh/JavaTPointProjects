<%-- 
    Document   : welcome
    Created on : Mar 27, 2018, 4:21:02 AM
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
        <h1>Welcome back <%= ((String)pageContext.getAttribute("user",PageContext.SESSION_SCOPE))%> </h1>
    </body>
</html>
