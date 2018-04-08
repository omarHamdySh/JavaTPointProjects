<%-- 
    Document   : xparse
    Created on : Apr 8, 2018, 2:24:22 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  

<html>  
    <head>  
        <title>x:parse Tag</title>  
    </head>  
    <body>  
        <jsp:include page="Nav.html"/>
        <h2>x:import is used to import external XML file's XML code.</h2>
        <h3>Used attributes: var="bookInfo" url="novels.xml"</h3>
        <hr>
        <h2>Books Info:</h2>  
        <!--Note: x:import is used to import and use external XML file-->
        <c:import var="bookInfo" url="novels.xml"/>  

        <x:parse xml="${bookInfo}" var="output"/>  

        <p>First Book title: <x:out select="$output/books/book[1]/name" /></p>  
        <p>First Book price: <x:out select="$output/books/book[1]/price" /></p>  
        <p>First Book author: <x:out select="$output/books/book[1]/author" /></p>  
        <p>Second Book title: <x:out select="$output/books/book[2]/name" /></p>  
        <p>Second Book price: <x:out select="$output/books/book[2]/price" /></p>  
        <p>Second Book author: <x:out select="$output/books/book[2]/author" /></p>  

    </body>  
</html>  