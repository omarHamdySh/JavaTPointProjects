<%-- 
    Document   : fmtformatNumber
    Created on : Apr 7, 2018, 9:36:52 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  

<html>  
    <head>  
        <title>fmt:formatNumber Tag</title>  
    </head>  
    <body>  
        <jsp:include page="Nav.html"/>
        <h3>Formatting of Number:</h3>  
        <c:set var="Amount" value="9850.14115" />  
        <p> Print number as currency with EGP currency symbol:  
            <fmt:formatNumber value="${Amount}" type="currency" currencySymbol="EGP" /></p>  
        <p>Print number and disable the grouping property which,like commas(default=true):  
            <fmt:formatNumber type="number" groupingUsed="false" value="${Amount}" /></p>  
        <p>Print number specifying the max integers before the fraction(3 numbers before fraction):  
            <fmt:formatNumber type="number" maxIntegerDigits="3" value="${Amount}" /></p>  
        <p>Print number specifying the max integers after the fraction (6 numbers after fraction):  
            <fmt:formatNumber type="number" maxFractionDigits="6" value="${Amount}" /></p>  
        <p>Print number as a percentage:  
            <fmt:formatNumber type="percent" maxIntegerDigits="4" groupingUsed="false" value="${Amount}" /></p>  
        <p>print number according to specific format(pattern="###.###$", # represents a number):  
            <fmt:formatNumber type="number" pattern="###.###$" value="${Amount}" /></p>  
        <h2>for further info visit this website: <a href="http://www.w3processing.com/index.php?subMenuLoad=JSP/JSTL/FormattingJSTL.php&environmentPath=NB/GF">Click here</a></h2>
    </body>  
</html>  