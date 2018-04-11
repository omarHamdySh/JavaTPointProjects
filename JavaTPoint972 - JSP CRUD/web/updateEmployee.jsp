<%-- 
    Document   : updateEmployee
    Created on : Apr 10, 2018, 12:18:59 AM
    Author     : omarhamdy
--%>

<%@page import="java.sql.Connection"%>
<%@page import="com.websiteName.DAO.EmpDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="u" class="com.websiteName.Beans.Employee"></jsp:useBean>  
        <jsp:setProperty property="*" name="u"/>  
        <%
            Connection DBConn = (Connection) session.getAttribute("DBConn");
            EmpDao.update(u, DBConn);
            response.sendRedirect("viewEmployees.jsp");
        %>  
    </body>
</html>
