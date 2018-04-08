<%-- 
    Document   : fnstartsWith
    Created on : Apr 7, 2018, 7:57:41 PM
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
        <h2>Let's search for a word within a given text using fn:startsWith() function.</h2>
        <c:set var="sentence" value="www.7alabessa.com"/>
        <h2>The given text:<c:out value="${sentence}"/></h2>
        <h2>Search for text at the start of the given text: "www." or "http" </h2>
        <c:choose>
            <c:when test="${fn:startsWith(sentence,'www.') or fn:startsWith(sentence,'http')}">
                <h2>This is a valid Website.</h2>
            </c:when>
            <c:otherwise>
                <h2>This Website isn't valid.</h2>
            </c:otherwise>
        </c:choose>
        <h3 style="color: red;"></h3>
    </body>
</html>
