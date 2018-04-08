<%-- 
    Document   : cout
    Created on : Apr 6, 2018, 4:02:34 PM
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
        <h2><c:out value="${' Code: <c:out value=${Welcome to javaTpoint}/>'}"/></h2>
        <h2><c:out value="${' OutPut: Welcome to From JSTL'}" /></h2>
    </body>
</html>
