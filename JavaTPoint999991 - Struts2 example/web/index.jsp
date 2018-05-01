<%-- 
    Document   : index
    Created on : Apr 26, 2018, 12:29:39 PM
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
        <h2>Struts form using struts UI tags</h2>
        <s:form action="product">  
            <s:textfield name="id" label="Product Id"></s:textfield>  
            <s:textfield name="name" label="Product Name"></s:textfield>  
            <s:textfield name="price" label="Product Price"></s:textfield>  
            <s:submit value="save"></s:submit>  
        </s:form> 
        <hr>
        <br>
        <h2>HTML form</h2>
        <form action="product">  
            <input type="text" name="id" placeholder="Product Id"/><br>
            <input type="text" name="name" placeholder="Product Name"/><br>
            <input type="text" name="price" placeholder="Product Price"/><br>
            <input type='submit' value="save">
        </form>  
        <br>
        <fieldset>
            <legend>Description</legend>
            <h4>Here struts controller filter is declared in web.xml file
                and once the each of the forms above is submitted it will be mapped to 
                struts.xml file which expected to be located in the default package of class
                directory,this is for netbeans, for other IDEs you have to follow the struts 
                file structure, any way after built the project the struts.xml will be located
                directly in the classes -> WEB-INF -> web, after the web container sends the
                requests to struts.xml, it will remap it depending on the action attribute
                of the form, web.xml it has action tag which is refering to POJO or Bean class
                to fill values sent in the form within it, action tag has a sub-tag result
                which has name attribute which the indicates string which, this is an expected
                value that should come over by the action class as a return type in a method
                by defauled named success, but we could change its name by adding method attribute
                to the action tag in the struts.xml, if the expected message is true which returned
                the same value by the method we indicated in the action tag, it will send the
                request to the page or the servlet that will be between the starting and ending
                tags of the action tag in the file struts.xml.
            </h4>
        </fieldset>

    </body>
</html>
