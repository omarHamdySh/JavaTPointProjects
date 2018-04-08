<%-- 
    Document   : xset
    Created on : Apr 8, 2018, 2:43:04 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
<html>  
    <head>  
        <title>x:set Tag</title>  
    </head>  
    <body> 
        <jsp:include page="Nav.html"/>
        <h2> x:set tag is used to hold the value of an XML nameValue tag in variable and reuse 
    it at any place </h2>
        <h3>Used attributes: var="fragment" select="$output/books/book[2]/price"</h3>
        <h3>Note:Variable in JSTL is print using x:out  attribute select="$Variablename"</h3>
        "
        <hr>
        <h3>Books Information:</h3>  
    <c:set var="book">  
        <books>  
            <book>  
                <name>Three mistakes of my life</name>  
                <author>Chetan Bhagat</author>  
                <price>200</price>  
            </book>  
            <book>  
                <name>Tomorrow land</name>  
                <author>Brad Bird</author>  
                <price>2000</price>  
            </book>  
        </books>  
    </c:set>  
    <x:parse xml="${book}" var="output"/>  
    <!--Note: We can hold the value of an XML nameValue tag in variable and reuse 
    it at any place using x:set tag.-->
    <x:set var="fragment" select="$output/books/book[2]/price"/>  
    <b>The price of the Tomorrow land book</b>:  
    <x:out select="$fragment" />  
</body>  
</html>  
