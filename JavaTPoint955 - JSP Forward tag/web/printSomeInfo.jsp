<%-- 
    Document   : printSomeInfo
    Created on : Mar 30, 2018, 11:03:30 AM
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
        <h1>
            <%=request.getParameter("name")%>
        </h1>
    </body>
</html>
