<%-- 
    Document   : page1
    Created on : Apr 2, 2018, 3:25:34 PM
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
        <h1>Welcome <jsp:getProperty name="user" property="name"/> at Request Scope By Expression Language.</h1>
        <h3>Context Path: ${pageContext.request.contextPath}</h3>
        <h3>Servlet Path: ${pageContext.request.servletPath}</h3>
        <h3>Request Method: ${pageContext.request.method}</h3>
        <h3>Request URL: ${pageContext.request.requestURL}</h3>
        <jsp:include page="pages.html"/>
    </body>
</html>
