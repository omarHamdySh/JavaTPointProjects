<%-- 
    Document   : fntrim
    Created on : Apr 7, 2018, 7:45:39 PM
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
        <h2>Let's remove the blank spaces from both ends of a string, and print its length before and after trimming.</h2>
        <c:set var="sentence" value="   Contact Us:        www.    7alabessa.   com               "/>
        <h2><span style="color: darkgreen">String before Trim:</span> ${fn:length(sentence)}</h2>
        <c:set var="trimmedSentence" value="${fn:trim(sentence)}"/>
        <h2><span style="color: darkgreen">String length after Trim:</span>${fn:length(sentence)}</h2>
        

        <h3 style="color: red;">its supposed to be different but apparently this version of JSTL doing Trim implicitly without doing it manually</h3>
    </body>
</html>
