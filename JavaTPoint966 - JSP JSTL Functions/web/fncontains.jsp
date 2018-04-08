<%-- 
    Document   : fncontains
    Created on : Apr 7, 2018, 6:51:27 PM
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
        <h2>Let's search for a word within a given text using fn:contains function.</h2>
        <c:set var="sentence" value="The visually impaired person, the one who is blind or can't see at all."/>
        <h2>The given text:<c:out value="${sentence}"/></h2>
        <h2>Search for: 1)visually impaired. 2)Night vision impaired</h2>
        <c:if test="${fn:contains(sentence,'visually impaired')}">
            <h2>This person is totally blind.</h2>
        </c:if>
        <c:if test="${fn:contains(sentence,'Night vision impaired')}">
            <h2>This person is can't see clearly in low lightning.</h2>
        </c:if>
            <h3 style="color: red;">Notice that fn:containsIgnoreCase() is case-sensitive function</h3>
    </body>
</html>
