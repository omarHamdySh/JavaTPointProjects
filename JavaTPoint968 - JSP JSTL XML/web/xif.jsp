<%-- 
    Document   : xif
    Created on : Apr 8, 2018, 3:29:56 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
<html>  
    <head>  
        <title>x:if Tags</title>  
    </head>  
    <body> 
        <jsp:include page="Nav.html"/>
        <h2>x:if is used to check a specific condition in order to execute or print a piece of text or code.</h2>
        <h3>Used attributes: select="$namValueTagXPath + comparison"</h3>
        <hr>
        <h2>Vegetable Information:</h2>  
        <c:set var="vegetables">  
        <vegetables>  
            <vegetable>  
                <name>onion</name>  
                <price>40</price>  
            </vegetable>  
            <vegetable>  
                <name>Potato</name>  
                <price>30</price>  
            </vegetable>  
            <vegetable>  
                <name>Tomato</name>  
                <price>90</price>  
            </vegetable> 
        </vegetables>  
    </c:set>  
    <x:parse xml="${vegetables}" var="output"/>  
    <x:if select="$output/vegetables/vegetable/price < 100">  
        Vegetables prices are very low.  
    </x:if>  
    <x:out select="$output/vegetables/vegetable/price"/>
</body>  
</html>  