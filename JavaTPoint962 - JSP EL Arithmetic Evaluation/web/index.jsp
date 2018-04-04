<%-- 
    Document   : index.JSP
    Created on : Apr 3, 2018, 1:57:07 PM
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

        <% session.setAttribute("num1", 4);%>
        <h2>JSP Expression Language Arithmetic Evaluation:</h2>
        <h2>num1 = ${sessionScope.num1}</h2>
        <h2>num1/2 = ${sessionScope.num1/2} </h2>
        <h3> Notice that we didn't made any type cast, its implicitly done by the EL</h3>
        <h2> 3*2 = ${3*2} </h2>
        <h2> 20+2 = ${20+2}</h2>
        <h2> 3-3 = ${3-3}</h2>
        <h2> 3%2 = ${3%2}</h2>
        <h2> 9 mod 4 = ${ 9 mod 5.5} -> notice that the value is floating point</h2>


    </body>
</html>
