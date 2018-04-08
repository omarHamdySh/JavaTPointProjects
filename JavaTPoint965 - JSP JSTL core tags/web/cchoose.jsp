<%-- 
    Document   : cchoose
    Created on : Apr 6, 2018, 6:52:51 PM
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
        <h1>Form Validation Using JSTL</h1>
        <h2>Your age must be 25 years old or more.</h2>
        <% boolean secondVisit = Boolean.parseBoolean(request.getParameter("secondVisit"));%>
        <c:set var="secVisit" scope="session" value="${secondVisit}"/>
        <c:if test="${secVisit==false}">
            <form action="cchoose" method="get">
                <input name="age" placeholder="Enter your age" type="text"/>
                <input type="submit" value="Verify"/>
            </form>
        </c:if>
        <c:if test="${secVisit==true}">
            <c:choose>
                <c:when test="${param.age lt 25}">
                    <h2>You are ${param.age} which is too young for the job.</h2>
                </c:when>
                <c:when test="${param.age eq 25}">
                    <h2> Congratulations! you are ${param.age} which is the optimum age needed for the job. </h2>
                </c:when>  
               <c:when test="${param.age gt 25}">
                    <h2> Congratulations! you are ${param.age} which is suitable age for the job. </h2>
                </c:when>  
                <c:otherwise>
                    <h2>For further information contact the HR Employee</h2>
                </c:otherwise>
            </c:choose>

            <h3>If you want do another Verification operation just click on nav link of c:choose page</h3>

        </c:if>
    </body>
</html>
