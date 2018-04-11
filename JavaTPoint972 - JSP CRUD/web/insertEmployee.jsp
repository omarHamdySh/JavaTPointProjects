<%-- 
    Document   : insertEmployee
    Created on : Apr 10, 2018, 12:26:06 AM
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
            int i = EmpDao.save(u, DBConn);
            if (i > 0) {
                response.sendRedirect("adduser-success.jsp");
            } else {
                response.sendRedirect("adduser-error.jsp");
            }%>
    </body>
</html>
