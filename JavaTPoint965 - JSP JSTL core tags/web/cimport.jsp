<%-- 
    Document   : cimport
    Created on : Apr 6, 2018, 4:16:12 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            h2 a {
                margin-left: 50px;
                border-right: #111 thick solid ;
                border-left: #111 thick solid ;
                padding-right: 20px;
                padding-left: 20px;
            }
        </style>
    </head>
    <body>
        <c:import url="Nav.html" />
        <c:out value="${'We used c:import instead of <jsp:include> to import the navigation bar'}" />
        <h2 dir="ltr"> Inner Navigation links<a href="#sec1" >Section 1 </a> <a href="#sec2" >Section 2 </a> <a href="#sec3" >Section 3 </a></h2>

        <hr>
        <div id="sec1">
            <c:import url="https://www.google.com.eg/?gfe_rd=cr&dcr=0&ei=hoLHWtfTG4Sr4gSnrK2oBA" />
            <c:import var="Nav" url="Nav.html"/>
        </div>
        <hr>
        <div id="sec2">
            <h2 dir="ltr"><a href="#sec1" >Section 1 </a> <a href="#sec2" >Section 2 </a> <a href="#sec3" >Section 3 </a></h2>
            <h2>Nav Bar Code:</h2>
            
            <!-- this next two lines of code will print the included resource value as a text inside your webpage -->
            <c:import var="Nav" url="Nav.html"/>
            <c:out value="${Nav}"/>
        </div>
        <hr>
        <div dir="ltr" id="sec3">
            <h2 dir="ltr"><a href="#sec1" >Section 1 </a> <a href="#sec2" >Section 2 </a> <a href="#sec3" >Section 3 </a></h2>
            <h2 style="color:red;"> Notice that the nav bar non active buttons text color changed to the purple color!! <br>
                This happened because we imported google website totaly including its css code which made this effect. <br>
                Also notice that section two is aligned from RIGT TO LEFT because of the affect of google website import.
                <br>
            </h2>
        </div>
    </body>
</html>
