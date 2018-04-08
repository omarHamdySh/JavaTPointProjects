<%-- 
    Document   : cforTokens
    Created on : Apr 6, 2018, 7:47:22 PM
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
        <h2>Here we gonna loop for a fixed text and separate it apart using white space as a delimiter.</h2>
    <c:forTokens items="In the Name of ALLAh we will start" delims=" " var="word">
        <c:out value="${word}"/><br>
    </c:forTokens>
</body>
</html>
