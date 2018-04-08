<%-- 
    Document   : cremove
    Created on : Apr 6, 2018, 5:03:46 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Nav.html"/>
        <h2>We gonna set a variable within a specific scope and then we gonna remove it
        </h2>
        <h2>Do: 100 + 232, create and share the variable and initialize it with OP result within session scope.<br>
            Value of result after c:set:
            <c:set var="MultiplicationOP" scope="session" value="${100+232}"/>
            <c:out value="${MultiplicationOP}"/>
        </h2>
        <h2>
            value after c:remove:
            <c:remove var="MultiplicationOP"/>
            <c:out value="${MultiplicationOP}"/>  
        </h2>
    </body>
</html>
