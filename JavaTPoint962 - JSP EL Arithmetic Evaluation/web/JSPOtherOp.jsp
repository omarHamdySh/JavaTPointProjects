<%-- 
    Document   : JSPOtherOp
    Created on : Apr 3, 2018, 2:55:53 PM
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

        <jsp:include page="Nav.html"/>
        <% session.setAttribute("var", 4);%>

        <h1>JSP EL Other Operators:</h1>
        <h2>Print var using square brackets Operator: ${sessionScope['var']}</h2>
        <h2>Is var is Empty or Equal to null? Ans: ${empty sessionScope.var}</h2>
        <% session.setAttribute("var", null);%>

        <h2>Please cheack again weather var is Empty or Equal to null or not? Ans: ${empty sessionScope.var}</h2>

    </body>
</html>
