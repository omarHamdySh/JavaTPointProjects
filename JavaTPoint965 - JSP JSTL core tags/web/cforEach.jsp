<%-- 
    Document   : cforEach
    Created on : Apr 6, 2018, 7:34:10 PM
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
        <h2>Here we will use c:forEach tag to iterate through a fixed times to repeat HTML piece of code</h2>
        <c:forEach var="i" begin="1" end="5">
            <h3>Print number ${i}</h3>
        </c:forEach>
    </body>
</html>
