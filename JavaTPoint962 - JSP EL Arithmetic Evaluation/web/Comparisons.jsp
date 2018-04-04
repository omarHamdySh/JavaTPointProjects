<%-- 
    Document   : Comparisons
    Created on : Apr 3, 2018, 2:13:56 PM
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
        <h2>Is ((5*2) != 10) or ((5*2) ne 10) : ${(5*2) ne 10} (Not Equal)</h2>
        <h2>Is ((5*2) == 10) or ((5*2) eq 10) : ${(5*2) eq 10} (Equal)</h2>
        <h2>Is ((1*1) > 2) or ((1*1) gt 2) : ${1 gt 2} (Greater Than)</h2>
        <h2>Is ((1*2) >= 2) or ((1*2) ge 2) : ${1 gt 2} (Greater Than or Equal)</h2>
        <h2>Is (var < 2) or (var lt 2) : ${sessionScope.var lt 2} (Less Than)</h2>
        <h2>Is (var <= 4) or (var le 4) : ${sessionScope.var le 4} (Less Than or Equal)</h2>
    </body>
</html>
