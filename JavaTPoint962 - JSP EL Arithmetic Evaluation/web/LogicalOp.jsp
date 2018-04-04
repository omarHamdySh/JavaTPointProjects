<%-- 
    Document   : LogicalOp
    Created on : Apr 3, 2018, 2:40:54 PM
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

        <h1>JSP Expression Language Comparisons:</h1>
        <h2>Is ( var ==1 && 2 < 3) : ${sessionScope.var ==1 && 2 < 3} ( && Logical Operator)</h2>
        <h2>Is ((5*2) <= 10 || var ==2) : ${ (5*2)==10 || sessionScope.var==2} ( || Logical Operator)</h2>
        <h2>Is (!false) : ${!false} (! Logical Operator)</h2>
    </body>
</html>
