<%-- 
    Document   : redirectJSP
    Created on : Apr 6, 2018, 8:34:19 PM
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
        <c:redirect url="${param.url}"/>
    </body>
</html>
