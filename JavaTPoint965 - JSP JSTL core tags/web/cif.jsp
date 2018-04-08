<%-- 
    Document   : cif
    Created on : Apr 6, 2018, 5:21:38 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Nav.html"/>
        <h1>Addition Operation</h1>
        <% boolean secondVisit = Boolean.parseBoolean(request.getParameter("secondVisit"));%>
        <c:set var="secVisit" scope="session" value="${secondVisit}"/>
        <c:if test="${secVisit==false}">
            <form action="cif" method="get">
                <input name="num1" placeholder="Enter 1st number" type="text"/>
                <input name="num2" placeholder="Enter 2st number" type="text"/>
                <input type="submit" value="calculate"/>
            </form>
        </c:if>
        <c:if test="${secVisit==true}">
            <c:set var="sum" scope="session" value="${param.num1+param.num2}"/>
            <h2>Result:<c:out value="${sum}"/></h2>
            <h3>If you want do another calculation operation just click on nav link of c:if page</h3>

        </c:if>


    </body>
</html>
