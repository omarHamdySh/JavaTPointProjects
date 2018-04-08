<%-- 
    Document   : home.jsp
    Created on : Apr 7, 2018, 6:47:57 PM
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
        <h1>Welcome at the home page.<br> here we will discuss JSTL SQL.</h1>
        <h2 style="color: tomato;">Important snippet from the official tutorial of JSTL:</h2>
        <h3>The JSTL SQL tags for accessing databases listed in Table 14-8 are designed for quick prototyping and simple applications.
            <br><em> For production applications, database operations are normally encapsulated in JavaBeans components.</em>
            <br>
            which is a diplomatic way of saying: don't use this. If you're using it, you're doing something wrong.</h3>
        <h2>But its very nice and easy tool, it makes JSP looks like PHP in the way of rapid dynamic webpages could be build up.</h2>
    </body>
</html>
