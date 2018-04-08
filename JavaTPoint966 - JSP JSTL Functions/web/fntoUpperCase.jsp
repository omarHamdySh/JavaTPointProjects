<%-- 
    Document   : fntoUpperCase
    Created on : Apr 7, 2018, 8:13:51 PM
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
        <h2>Let's turn a given text to lower case.</h2>  
        <c:set var="str1" value="constant"/>  
        <h2>String before turning text to Upper case: ${str1}</h2>
        <c:set var="str2" value="${fn:toUpperCase(str1)}" />  
        <h2>String Turning the text to Upper case: ${str2}</h2>

        <h3 style="color: red;"></h3>

    </body>  
</html>  