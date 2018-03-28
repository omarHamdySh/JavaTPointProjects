<%-- 
    Document   : home
    Created on : Mar 27, 2018, 3:51:41 AM
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
        <h1>You've reached your home page, welcome <% String name= (String)request.getParameter("name"); session.setAttribute("name",name); out.print(name);%></h1>
        <a href="welcome"><h2>Next Page</h2></a>
    </body>
</html>
