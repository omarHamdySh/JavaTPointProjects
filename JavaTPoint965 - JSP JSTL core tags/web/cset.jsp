<%-- 
    Document   : cset
    Created on : Apr 6, 2018, 4:44:17 PM
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
            <jsp:include page="Nav.html"/>
        <h2>We gonna declare and do a specific expression language operation and save its<br>
            value inside a variable and will share it within a specific scope, <br>
             Here in this example we will share the variable within the session scope.
        </h2>
        <h2>Do: 10 * 232, create and share the variable and initialize it with OP result within session scope.<br>
        Value of result:
        <c:set var="MultiplicationOP" scope="session" value="${10*232}"/>
        <c:out value="${MultiplicationOP}"/>
        </h2>
    </body>
</html>
