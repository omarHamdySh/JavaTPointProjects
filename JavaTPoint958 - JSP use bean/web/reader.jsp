<%-- 
    Document   : reader
    Created on : Mar 30, 2018, 11:33:49 AM
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
        <jsp:useBean id="emp1" class="Beans.Employee">
            <% String name=emp1.getName(); out.println(name);%>
        </jsp:useBean>
    </body>
</html>
