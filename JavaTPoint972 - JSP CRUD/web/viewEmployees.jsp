<%-- 
    Document   : viewEmployees
    Created on : Apr 9, 2018, 11:43:11 PM
    Author     : omarhamdy
--%>

<%@page import="com.websiteName.DAO.EmpDao"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="com.websiteName.Beans.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<h1>Users List</h1>  
<%
    Connection DBconn = (Connection) session.getAttribute("DBConn");
    List<Employee> list = EmpDao.getAllEmployees(DBconn);
    request.setAttribute("list", list);
%>  
<table border="1" width="90%">  
    <tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th>  
        <th>Country</th><th>Edit</th><th>Delete</th></tr>  
    <c:forEach items="${list}" var="u">  
        <tr><td>${u.getId()}</td><td>${u.getName()}</td><td>${u.getPassword()}</td>  
            <td>${u.getEmail()}</td><td>${u.getCountry()}</td>  
            <td><a href="editEmployee.jsp?id=${u.getId()}">Edit</a></td>  
            <td><a href="deleteEmployee.jsp?id=${u.getId()}">Delete</a></td></tr>  
        </c:forEach>  
</table>  
<br/><a href="addEmployee.jsp">Add New User</a>  
