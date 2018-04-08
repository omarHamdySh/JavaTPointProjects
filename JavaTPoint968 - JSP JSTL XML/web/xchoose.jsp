<%-- 
    Document   : xchoose
    Created on : Apr 8, 2018, 2:55:18 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  

<html>  
    <head>  
        <title>x:choose Tag</title>  
    </head>  
    <body> 
        <jsp:include page="Nav.html"/>
        <h2>x:forEach iterates through XML code and holds the value in a variable.</h2>
        <h3>Used attributes: var="forEachVariableName" select="XML nameValue tag to iterate through".</h3>
        <h2>x:when checks weather a condition is true or false then to print or not a text between starting and ending tags.</h2>
        <h3>Used attributes: select="$forEachVariableName or $nameValueTagXPath + comparison "</h3>
        <h2>x:otherwise if all the when conditioning went false, code or text between its starting and ending tags will be executed.</h2>
        <hr>
        <h3>Books Information:</h3>  

        <c:set var="xmltext">  
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
            <book>  
                <name>How to make 7alabesa</name>  
                <author>Omar Hamdy</author>  
                <price>2000</price>  
            </book>  
        </books>  
    </c:set>  

    <x:parse xml="${xmltext}" var="output"/>  
    <x:forEach var="bookAuthor" select="$output/books/book/author">
        <x:choose>  
            <x:when select="$bookAuthor = 'Chetan Bhagat'">  
                <h4>Book is written by <x:out select="$bookAuthor"/></h4>
            </x:when>  
            <x:when select="$bookAuthor = 'Brad Bird'">  
                <h4>Book is written by <x:out select="$bookAuthor"/></h4>  
            </x:when>  
            <x:otherwise>  
                <h4>The author is unknown...</h4>
            </x:otherwise>  
        </x:choose>  
    </x:forEach>
</body>  
</html>  
