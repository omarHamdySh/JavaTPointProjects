<%-- 
    Document   : printEmpInfo.jsp
    Created on : Apr 1, 2018, 11:02:22 AM
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
        <h2>Employee info:</h2>
        <jsp:useBean id="emp" class="Beans.Employee" scope="session" >
            <jsp:getProperty name="emp" property="name"/>
            <jsp:getProperty name="emp" property="password"/>
        </jsp:useBean>
        <h1></h1>
    </body>
</html>
