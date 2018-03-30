<%-- 
    Document   : home
    Created on : Mar 30, 2018, 11:01:32 AM
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
        <!-- You could just do forward without sending parameters using: -->
        <%--<jsp:forward page="printSomeInfo.jsp"/>--%>

        <jsp:forward page="printSomeInfo.jsp">
            <jsp:param name="name" value="Omar Hamdy"/>
        </jsp:forward>
    </body>
</html>
