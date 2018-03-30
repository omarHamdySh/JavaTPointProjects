<%-- 
    Document   : JSP-errorPage
    Created on : Mar 29, 2018, 1:16:53 AM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="JSP910-isErrorPage.jsp"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>The 9th JSP page directive "errorPage"</h1>
        <h2>The errorPage attribute is used to define the error page, if exception occurs in the current page, it will be redirected to the error page.
        </h2>
        <h3><%
            int n1= Integer.parseInt(request.getParameter("N1"));
            int n2= Integer.parseInt(request.getParameter("N2"));
            int ANS=n1/n2;
            %> Division value:<%=ANS%></h3>
    </body>
</html>
