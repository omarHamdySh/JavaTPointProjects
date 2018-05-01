<%-- 
    Document   : welcome
    Created on : Apr 26, 2018, 12:32:31 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2> Previewing values using struts UI preview tags:</h2>
        Product Id:<s:property value="id"/><br/>  
        Product Name:<s:property value="name"/><br/>  
        Product Price:<s:property value="price"/><br/>  
        <hr>
        <br>
        <h2>Previewing values using JSP EL param element</h2>
        Product Id:${param.id}<br/>  
        Product Name:${param.name}<br/>  
        Product Price:${param.price}<br/> 
        <br>
        <fieldset>
            <legend>Description</legend>
            <h4>
                Here we use two different methods to print out the values sent in the request
                by the index.jsp page, both of them are extracting the values from the request
                parameters by name, which mean that struts is dealing with request, not session
                or application scope, maybe there is a way but for now just the request scope.
                <br>
                if we want to do fill and share bean with the values sent by user, we have to map
                the request in the struts.xml to JSP page in between the index.jsp and the welcome.jsp
                which must use the jsp usbean tag, set property, and getproperty tags here in welcome.jsp.
                
            </h4>
                </body>
                </html>
