<%-- 
    Document   : index
    Created on : May 1, 2018, 6:24:41 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!DOCTYPE html>
    <!--
    To change this license header, choose License Headers in Project Properties.
    To change this template file, choose Tools | Templates
    and open the template in the editor.
    -->

    <a href="home">Create employee</a>
    <a href="home?type=reg">Create regular employee</a>
    <a href="home?type=cont">Create contract employee</a>
    <c:set var="type" value="${param.type}" scope="session"/>
    <form action="Handler">
        <!--<input type="text" name="id" placeholder="Enter Emp id"/>-->
        <input type="text" name="name" placeholder="Enter Emp 1st name"/>
        <c:if test="${type eq 'reg'}">
            <input type="text" name="salary" placeholder="Enter Emp salary"/>
            <input type="text" name="bonus" placeholder="Enter Emp bonus"/>
        </c:if>
        <c:if test="${type eq 'cont'}">
            <input type="text" name="pay_per_hour" placeholder="Enter Emp pay per hour"/>
            <input type="text" name="contract_duration" placeholder="Enter Emp Contract Duration"/>
        </c:if>
        <input type="submit" value="submit"/>
        <h2>${type}</h2>
    </form>
</body>
</html>
