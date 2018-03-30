<%-- 
    Document   : news
    Created on : Mar 30, 2018, 9:08:02 AM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%-- we could use <jsp:param> tag with jsp:include to send parameter to the included page --%>
  <%-- We exchanged the <%@ include file="index.html" %> or AKA include directive with: --%>
        <jsp:include page="index.html"/> 
        <h1>News Page</h1>
    </body>
</html>
