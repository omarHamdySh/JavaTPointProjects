<%-- 
    Document   : home
    Created on : Apr 6, 2018, 4:01:03 PM
    Author     : omarhamdy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Nav.html"/>
        <h1>Hello at the home page</h1>
        <h2>You could navigate through this nav bar to see the JSTL code results.</h2>
        <c:if test="${param.authorName ne null}">
            <h2>Author name: ${param.authorName}</h2>
            <h2>Author job title: ${param.authorProfession}</h2>
        </c:if>
    </body>
</html>
