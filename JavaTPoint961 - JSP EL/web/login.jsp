<%-- 
    Document   : login
    Created on : Apr 2, 2018, 3:00:15 PM
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
        <!--//Read the sent attribute using JSP El-->
        <h1>welcome ${param.name}</h1>
        ${pageContext.session.setAttribute("temp", "This is the temp session attribute value notic that attribute name is case sensitive.")}
        <jsp:useBean id="user" class="Beans.User" scope="session">
            <jsp:setProperty name="user" property="*" />
        </jsp:useBean>
        
        <!--include the pages.html which represents the breadcrumb navigation.-->
        <jsp:include page="pages.html"/>
        
    </body>
</html>
