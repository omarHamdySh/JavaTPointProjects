<%-- 
    Document   : Handler
    Created on : Apr 26, 2018, 4:58:30 PM
    Author     : omarhamdy
--%>

<%@page import="com.javatpoint.Beans.Contract_Employee"%>
<%@page import="com.javatpoint.Beans.Regular_Employee"%>
<%@page import="com.javatpoint.Beans.Employee"%>
<%@page import="com.javatpoint.TableHandlers.StoreData"%>
<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="errPage"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="type" value="${sessionScope.type}" />
        <c:choose>
            <c:when test="${type eq'reg'}">
                <jsp:useBean id="reg_emp" class="com.javatpoint.Beans.Regular_Employee" scope="session">
                    <jsp:setProperty property="*" name="reg_emp"/>
                </jsp:useBean>
            </c:when>
            <c:when test="${type eq'cont'}">
                <jsp:useBean id="cont_emp" class="com.javatpoint.Beans.Contract_Employee" scope="session">
                    <jsp:setProperty property="*" name="cont_emp"/>
                </jsp:useBean>
            </c:when>
            <c:otherwise>
                <jsp:useBean id="emp" class="com.javatpoint.Beans.Employee" scope="session">
                    <jsp:setProperty property="*" name="emp"/>
                </jsp:useBean>
            </c:otherwise>
        </c:choose>

        <%
            Employee employee = null;
            String empType = (String) session.getAttribute("type");
            if (empType != null) {
                if (empType.equals("reg")) {
                    employee = (Regular_Employee) session.getAttribute("reg_emp");
                    session.setAttribute("reg_emp", null);
                } else if (empType.equals("cont")) {
                    employee = (Contract_Employee) session.getAttribute("cont_emp");
                    session.setAttribute("cont_emp", null);
                }
            } else {
                employee = (Employee) session.getAttribute("emp");
                session.setAttribute("emp", null);
            }
            StoreData st = new StoreData(employee);
            st.save();
        %>
        <jsp:forward page="home"/>
    </body>
</html>

