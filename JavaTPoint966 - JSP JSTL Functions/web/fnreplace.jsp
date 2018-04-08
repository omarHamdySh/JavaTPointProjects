<%-- 
    Document   : fnreplace
    Created on : Apr 7, 2018, 8:37:29 PM
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
        <h2>Let's replace a sub string of a givin string using fn:replace(str,str,str)</h2>  
        <c:set var="str1" value="My name is omar."/>  
        <h2>The original string is: ${str1}</h2>
        <h2>after replacing: ${fn:replace(str1,'omar','sayed')}</h2>
        <h3 style="color: red;"></h3>

    </body>  
</html>  
