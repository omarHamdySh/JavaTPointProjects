<%-- 
    Document   : fnescapeXml
    Created on : Apr 7, 2018, 7:24:27 PM
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
        <h2>Let's print everything inside or outside XML tags, removing anything looks like XML tags</h2>
        <c:set var="sentence" value="Contact Us:<Website>www.7alabessa.com</Website>"/>
        <h2>With XML:<br>${fn:escapeXml(sentence)}</h2>
        <h2>Without XML:<br>${sentence}</h2>


        <h3 style="color: red;"></h3>
    </body>
</html>