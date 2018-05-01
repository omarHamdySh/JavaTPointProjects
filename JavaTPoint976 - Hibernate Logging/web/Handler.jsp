<%-- 
    Document   : Handler
    Created on : Apr 26, 2018, 4:58:30 PM
    Author     : omarhamdy
--%>

<%@page import="com.javatpoint.Beans.Employee"%>
<%@page import="com.javatpoint.TableHandlers.StoreData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="emp" class="com.javatpoint.Beans.Employee" scope="session">
            <jsp:setProperty property="*" name="emp"/>
        </jsp:useBean>

        <%
            Employee employee = (Employee) session.getAttribute("emp");
            StoreData st = new StoreData(employee);
            st.save();
        %>
        <jsp:forward page="index.html"/>
    </body>
</html>

