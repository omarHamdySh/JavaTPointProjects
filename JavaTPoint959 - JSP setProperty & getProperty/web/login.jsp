<%-- 
    Document   : login
    Created on : Apr 1, 2018, 10:56:49 AM
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
        <h1>Welcome <%=request.getParameter("name")%> </h1>
        <jsp:useBean id="emp" class="Beans.Employee" scope="session">
            <jsp:setProperty name="emp" property="*"/>
        </jsp:useBean>
        </br>
        <h4><a href="printEmpInfo.jsp">Next page</a></h4>
    </body>
</html>
