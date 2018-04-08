<%-- 
    Document   : fnsplit
    Created on : Apr 7, 2018, 8:02:02 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
    <head>  
        <title>Using JSTL Functions</title>  
    </head>  
    <body>  
        <jsp:include page="Nav.html"/>
        <h2>Let's split a given text according to a specific delmiter.</h2>  
        <c:set var="str1" value="Welcome-to-JSP-Programming."/>  
        <h2>String before split: ${str1}</h2>
        <c:set var="str2" value="${fn:split(str1, '-')}" />  
        <c:set var="str3" value="${fn:join(str2, '<br>')}" />  
        <h2>String after join:<br> ${str3}</h2>

        <h3 style="color: red;"></h3>

    </body>  
</html>  