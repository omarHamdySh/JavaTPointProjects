<%-- 
    Document   : editEmployee
    Created on : Apr 9, 2018, 11:42:40 PM
    Author     : omarhamdy
--%>

<%@page import="java.sql.Connection"%>
<%@page import="com.websiteName.Beans.Employee"%>
<%@page import="com.websiteName.DAO.EmpDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        Connection DBConn= (Connection)session.getAttribute("DBConn");
        String id = request.getParameter("id");
        Employee u = EmpDao.getEmployeeById(Integer.parseInt(id),DBConn);
    %>  

    <h1>Edit Form</h1>  
    <form action="updateEmployee.jsp" method="post">  
        <input type="hidden" name="id" value="<%=u.getId()%>"/>  
        <table>  
            <tr><td>Name:</td><td>  
                    <input type="text" name="name" value="<%= u.getName()%>"/></td></tr>  
            <tr><td>Password:</td><td>  
                    <input type="password" name="password" value="<%= u.getPassword()%>"/></td></tr>  
            <tr><td>Email:</td><td>  
                    <input type="email" name="email" value="<%= u.getEmail()%>"/></td></tr>  
            <tr><td>Country:</td><td>  
                    <select name="country">  
                        <option>India</option>  
                        <option>Pakistan</option>  
                        <option>Afghanistan</option>  
                        <option>Berma</option>  
                        <option>Other</option>  
                    </select>  
                </td></tr>  
            <tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>  
        </table>  
    </form>  

</body>  

</html>
