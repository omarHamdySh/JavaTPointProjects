<%-- 
    Document   : xtransofrm
    Created on : Apr 8, 2018, 3:42:18 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
<html>  
    <head>  
        <title>x:transform Tag</title>  
    </head>  
</html>
<body>
    <jsp:include page="Nav.html"/>
    <font color="gold">

    <h2>x:transform is used to XSL for to transform specific XML code.</h2>
    <h3>XSL to the XML like the CSS to the HTML.</h3>
    <h3>XSL uses HTML code to transform and present xml tags values, it has a specific select="" attribute hierarchy.</h3>
    <h3>XSL also have its own control statements tags which starts with xsl:statementName.</h3>
    <h2>x:param is used to send parameter to xsl file and use its value there.</h2>

    </font>
</body>
<c:import var="xml" url="transfer.xml" />  
<c:import var="xsl" url="transfer.xsl" />  
<x:transform xml="${xml}" xslt="${xsl}" >
    <x:param name="bgcolor" value="purple"/>
    <x:param name="fontColor" value="white"/>  

</x:transform>>  
