<%-- 
    Document   : index.jsp
    Created on : Mar 30, 2018, 11:17:25 AM
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
        <h1>first line of HTML</h1>
        <jsp:include page="next.jsp">
            <jsp:param name="n1" value="2"/>
            <jsp:param name="n2" value="2"/>
        </jsp:include>
        <h1>last line of HTML</h1>

    </body>
</html>
