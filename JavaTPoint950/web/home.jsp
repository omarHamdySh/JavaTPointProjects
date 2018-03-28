<%-- 
    Document   : home
    Created on : Mar 27, 2018, 4:18:40 AM
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
        <h1>Hello World!</h1>
        <%

            String name =request.getParameter("uname");//(String) pageContext.getAttribute("user", PageContext.REQUEST_SCOPE);
            out.print("Welcome " + name);

            pageContext.setAttribute("user", name, PageContext.SESSION_SCOPE);
        %> 

        <a  href = "welcome" > Next Page</a >  

    </body>
</html>
