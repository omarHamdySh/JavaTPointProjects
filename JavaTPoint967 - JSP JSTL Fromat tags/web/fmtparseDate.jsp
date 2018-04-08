<%-- 
    Document   : fmtparseDate
    Created on : Apr 7, 2018, 10:18:37 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  

<html>  
    <head>  
        <title>fmt:parseDate Tag</title>  
    </head>  
    <body>  
        <jsp:include page="Nav.html"/>
        <h3>Parsed Date:</h3>  
        <c:set var="date" value="12-08-2016" />  

        <fmt:parseDate value="${date}" var="parsedDate"  pattern="dd-MM-yyyy" />  
        <p><c:out value="${parsedDate}" /></p>  
        <h3 style="color: red;">Notice that this fmt:parseDate is used only to parse 
            string as a date<br> it make the date represented as date which will
        make the string numbers, each means something else not just a number.</h3>
    </body>  
</html>  
