<%-- 
    Document   : deleteEmployee
    Created on : Apr 9, 2018, 11:42:25 PM
    Author     : omarhamdy
--%>

<%@page import="com.websiteName.DAO.EmpDao"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>


        <%
            Connection DBConn = (Connection) session.getAttribute("DBConn");
            EmpDao.delete(Integer.parseInt(request.getParameter("id")), DBConn);
            response.sendRedirect("CRUD_Panel.jsp");
        %> 
    </body>
</html>
