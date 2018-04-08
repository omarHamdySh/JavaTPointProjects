<%-- 
    Document   : fmtFormatDate
    Created on : Apr 7, 2018, 11:33:14 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<html>  
    <head>  
        <title>fmt:formatDate</title>  
    </head>  
    <body> 
        <jsp:include page="Nav.html"/>
        <h2>Different Formats of the Date</h2>  
        <c:set var="Date" value="<%=new java.util.Date()%>" />  
        <p>  
            Formatted Time (short time style) :  
            <fmt:formatDate type="time" value="${Date}" timeStyle="short" />  
        </p>  
        <p>  
            Formatted Date (short date style):  
            <fmt:formatDate type="date" value="${Date}" dateStyle="short" />  
        </p>  
        <p>  
            Formatted Time (medium time style) :  
            <fmt:formatDate type="time" value="${Date}" timeStyle="medium" />  
        </p>  
        <p>  
            Formatted Date (medium date style):  
            <fmt:formatDate type="date" value="${Date}" dateStyle="medium" />  
        </p> 
        <p>  
            Formatted Time (long time style):  
            <fmt:formatDate type="time" value="${Date}" timeStyle="long" />  
        </p>  
        <p>  
            Formatted Date (long date style):  
            <fmt:formatDate type="date" value="${Date}" dateStyle="Long" />  
        </p>  
        <p>  
            Formatted Date and Time :  
            <fmt:formatDate type="both" value="${Date}" />  
        </p>  
        <p>  
            Formatted Date and Time in short style :  
            <fmt:formatDate type="both" dateStyle="short" timeStyle="short"  
                            value="${Date}" />  
        </p>  
        <p>  
            Formatted Date and Time in medium style :  
            <fmt:formatDate type="both" dateStyle="medium" timeStyle="medium"  
                            value="${Date}" />  
        </p>  
        <p>  
            Formatted Date and Time in long style :  
            <fmt:formatDate type="both" dateStyle="long" timeStyle="long"  
                            value="${Date}" />  
        </p>  

    </body>  
</html> 