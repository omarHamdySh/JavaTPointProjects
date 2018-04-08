<%-- 
    Document   : cparam
    Created on : Apr 6, 2018, 7:59:28 PM
    Author     : omarhamdy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Nav.html"/>
       
        <h2>Here we gonna add parameter(s) to our URL in order to send request to it including this/these parameter(s).</h2>
        <h3>Original URL: ${pageContext.request.servletPath}</h3>
        <c:url value="/home.jsp" var="fullURL" context="/">
            <c:param name="authorName" value="Omar Hamdy"/>
            <c:param name="authorProfession" value="Software Engineer"/>
        </c:url>
        <h3>Full Url including parameters: ${fullURL}</h3>
        <form action="redirectJSP.jsp" method="get">
            <input type="hidden" name="url" value="${fullURL}"/>
            <input type="submit" value="go home"/>
        </form>
    </body>
</html>
