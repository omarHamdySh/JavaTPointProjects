<%-- 
    Document   : page2
    Created on : Apr 2, 2018, 3:25:43 PM
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
        <h1>Welcome <jsp:getProperty name="user" property="name"/> at Application Scope By Expression Language.</h1>
        <h3>Server info: ${pageContext.servletContext.serverInfo}</h3>
        <h3>Virtual Server Name: ${pageContext.servletContext.virtualServerName}</h3>
        <h3>Welcome Init Parameter: ${pageContext.servletContext.getInitParameter("welcome")}</h3>
        <jsp:include page="pages.html"/>
    </body>
</html>
