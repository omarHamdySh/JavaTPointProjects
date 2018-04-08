<%-- 
    Document   : fmtbundle
    Created on : Apr 7, 2018, 11:13:27 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Nav.html"/>
        <h2>Let's instantiate bundle class and print its bundle messages using fmt:bundle tag</h2>
        <fmt:bundle basename="Bundles.colourBundle" prefix="colour.">  
            <fmt:message key="Violet"/><br/>  
            <fmt:message key="Indigo"/><br/>  
            <fmt:message key="Blue"/><br/> 
        </fmt:bundle>  
    </body>
</html>
