<%-- 
    Document   : addEmployee
    Created on : Apr 9, 2018, 11:42:00 PM
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
        <a href="CRUD_Panel.jsp">View All Records</a><br/>  

        <h1>Add New User</h1>  
        <form action="insertEmployee.jsp" method="post">  
            <table>  
                <tr><td>Name:</td><td><input type="text" name="name"/></td></tr>  
                <tr><td>Password:</td><td>  
                        <input type="password" name="password"/></td></tr>  
                <tr><td>Email:</td><td><input type="email" name="email"/></td></tr>  
                <tr><td>Country:</td><td>  
                        <select name="country" style="width:155px">  
                            <option>India</option>  
                            <option>Pakistan</option>  
                            <option>Afghanistan</option>  
                            <option>Berma</option>  
                            <option>Other</option>  
                        </select>  
                    </td></tr>  
                <tr><td colspan="2"><input type="submit" value="Add User"/></td></tr>  
            </table>  
        </form>  
    </body>
</html>
