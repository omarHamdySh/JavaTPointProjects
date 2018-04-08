<%-- 
    Document   : ccatch
    Created on : Apr 6, 2018, 6:19:23 PM
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
        <h1>Division Operation</h1>
        <% boolean secondVisit = Boolean.parseBoolean(request.getParameter("secondVisit"));%>
        <c:set var="secVisit" scope="session" value="${secondVisit}"/>
        <c:if test="${secVisit==false}">
            <form action="ccatch" method="get">
                <input name="num1" placeholder="Enter 1st number" type="text"/>
                <input name="num2" placeholder="Enter 2st number" type="text"/>
                <input type="submit" value="calculate"/>
            </form>
        </c:if>
        <c:catch var="OurException">
            <c:if test="${secVisit==true}">
                <% int ans= Integer.parseInt(request.getParameter("num1"))/Integer.parseInt(request.getParameter("num2"));%>
                <h2>Result:<%=ans%></h2>
                <h3>If you want do another calculation operation just click on nav link of c:catch page</h3>
            </c:if>
        </c:catch>
        <c:if test="${OurException!=null}">
            <h2 style="color: red;"> The Exception of type: ${OurException} occurred
                <br>
                Exception Message: ${OurException.message};
            </h2>
        </c:if> 


    </body>
</html>
