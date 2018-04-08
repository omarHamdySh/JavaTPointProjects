<%-- 
    Document   : fnendswith
    Created on : Apr 7, 2018, 7:13:30 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Nav.html"/>
        <h2>Let's search for a word within a given text using fn:endsWith function.</h2>
        <c:set var="sentence" value="www.7alabessa.com"/>
        <h2>The given text:<c:out value="${sentence}"/></h2>
        <h2>Search for at the end of the given text: .com , .net or .org </h2>
        <c:choose>
            <c:when test="${fn:endsWith(sentence,'.com') or fn:endsWith(sentence,'.net') or fn:endsWith(sentence,'.org')}">
                <h2>This is a valid Website.</h2>
            </c:when>
            <c:otherwise>
                <h2>This Website isn't valid.</h2>
            </c:otherwise>
        </c:choose>
        <h3 style="color: red;"></h3>
    </body>
</html>
