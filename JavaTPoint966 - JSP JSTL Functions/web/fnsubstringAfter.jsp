<%-- 
    Document   : substringAfter
    Created on : Apr 7, 2018, 8:28:19 PM
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
        <h2>Let's get and print a sub string of a givin string using substringAfter()</h2>  
        <c:set var="str1" value="My name is omar"/>  
        <h2>The full string is: ${str1}</h2>
        <h2>Name(sub-string): ${fn:substringAfter(str1,'is')}</h2>
        <h3 style="color: red;"></h3>

    </body>  
</html>  