<%-- 
    Document   : sqldateParam
    Created on : Apr 8, 2018, 5:04:13 PM
    Author     : omarhamdy
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
<!DOCTYPE html>
<html>  
    <head>  
        <title>sql:setDataSource Tag</title>  
    </head>  
    <body>  
        <jsp:include page="Nav.html"/>
        <h2></h2>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
                           url="jdbc:mysql://localhost:3306/HRDep"  
                           user="root"  password=""/>  

        <%
            Date DoB = new Date();
            int dateNumber = 2;
        %>  
        <sql:update dataSource="${db}" var="count">  
            UPDATE dateTable SET date = ? WHERE Id = ?  
            <sql:dateParam value="<%=DoB%>" type="DATE" />  
            <sql:param value="<%=dateNumber%>" />  
        </sql:update>  

        <sql:query dataSource="${db}" var="rs">  
            SELECT * from dateTable;  
        </sql:query>  
        <table border="2" width="100%">  
            <tr>  
                <th>date number</th>  
                <th>date</th>  
            </tr>  
            <c:forEach var="table" items="${rs.rows}">  
                <tr>  
                    <td><c:out value="${table.id}"/></td>  
                    <td><c:out value="${table.date}"/></td>  

                </tr>  
            </c:forEach>  
        </table>  
    </body>  
</html>  