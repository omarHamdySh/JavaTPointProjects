<%-- 
    Document   : page3
    Created on : Apr 2, 2018, 3:25:57 PM
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
        <h1>Welcome <jsp:getProperty name="user" property="name"/> at Session Scope By JSP Expression Language.</h1>
        <h3>session number: ${pageContext.session.id}</h3>
        <h3>session attribute (temp): ${sessionScope.temp}</h3>
        <jsp:include page="pages.html"/>
    </body>
</html>
