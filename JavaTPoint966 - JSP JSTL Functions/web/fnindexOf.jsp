<%-- 
    Document   : fnindexOf
    Created on : Apr 7, 2018, 7:38:27 PM
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
        <h2>Let's find the start index of a text within another text.</h2>
        <c:set var="sentence" value="Contact Us:<Website>www.7alabessa.com</Website>"/>
        <h2><span style="color: darkgreen">Index of www.:</span>
            ${fn:indexOf(sentence,'www.')} <span style="color: darkgreen"> within</span>
            ${sentence}</h2>


        <h3 style="color: red;"></h3>
    </body>
</html>
