<%-- 
    Document   : fmtsetBundle
    Created on : Apr 7, 2018, 11:28:06 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<html>  
    <head>  
        <title>fmt:setBundle Tag</title>  
    </head>  
    <body>  
        <jsp:include page="Nav.html"/>
        <h2>Instantiate & use Bundle class and print its bundle messages using fmt:setBundle tag</h2>
        <fmt:setBundle basename="Bundles.colourBundle" var="lang"/>  
        <fmt:message key="colour.Blue" bundle="${lang}"/><br/>  
        <fmt:message key="colour.Violet" bundle="${lang}"/><br/>  
        <fmt:message key="colour.Indigo" bundle="${lang}"/><br/>  
    </body>  
</html>  