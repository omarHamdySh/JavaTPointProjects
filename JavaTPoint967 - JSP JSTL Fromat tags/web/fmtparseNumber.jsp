<%-- 
    Document   : fmtparseNumber
    Created on : Apr 7, 2018, 9:03:40 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Nav.html"/>
        <h2>Let's parse a currency amount using fmt:parseNumber tag</h2>
        <c:set var="money" value="600.66"/>
        <fmt:parseNumber var="parsedMoney" value="${money}" integerOnly="true"  type="number"/>
        <h2> ${parsedMoney}</h2>
    </body>
</html>
