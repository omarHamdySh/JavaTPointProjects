<%-- 
    Document   : index
    Created on : Apr 9, 2018, 10:39:20 PM
    Author     : omarhamdy
--%>

<%@page import="java.util.List"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.jms.Session"%>
<%@page import="Beans.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><%
        Connection DBconn = (Connection) session.getAttribute("DBConn");
        String spageid = request.getParameter("page");
        int pageid = Integer.parseInt(spageid);
        int total = 5;
        if (pageid == 1) {
        } else {
            pageid = pageid - 1;
            pageid = pageid * total + 1;
        }
        List<Employee> list = DAO.EmpDao.getAllEmployees(DBconn, pageid, total);

        out.print("<h1>Page No: " + spageid + "</h1>");
        out.print("<table border='1' cellpadding='4' width='60%'>");
        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th>");
        for (Employee e : list) {
            out.print("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getPassword() + "</td><td>" + e.getEmail() + "</td><td>" + e.getCountry() + " </td></tr>  ");
        }
        out.print("</table>");
        %>
        <h1></h1>
        <a href="index.jsp?page=1">1</a>  
        <a href="index.jsp?page=2">2</a>  
        <a href="index.jsp?page=3">3</a>  
    </body>
</html>
