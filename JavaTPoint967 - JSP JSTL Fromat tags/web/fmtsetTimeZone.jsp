<%-- 
    Document   : fmtsetTimeZone
    Created on : Apr 7, 2018, 11:22:54 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<html>  
    <head>  
        <title>fmt:setTimeZone Tag</title>  
    </head>  
    <body>  
        <jsp:include page="Nav.html"/>
        <c:set var="date" value="<%=new java.util.Date()%>" />  
        <p><b>Date and Time in Indian Standard Time(IST) Zone:</b> <fmt:formatDate value="${date}"  
                        type="both" timeStyle="long" dateStyle="long" /></p>  
            <fmt:setTimeZone value="GMT-2" />  
        <p><b>Date and Time in GMT-2 time Zone: </b><fmt:formatDate value="${date}"  
                        type="both" timeStyle="long" dateStyle="long" /></p>  
    </body>  
</html>  