<%-- 
    Document   : xout
    Created on : Apr 8, 2018, 1:21:52 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  

<html>  
    <head>  
        <title>XML Tags</title>  
    </head>  
    <body> 
        <jsp:include page="Nav.html"/>
        <h2>c:set tag is used to define XML code and hold it in a variable "vegetable"</h2>
        <h3>Used attributes: var="vegetable"</h3>
        <h2>x:parse is used to parse the variable "vegetable" and hold it in another variable "output" </h2>
        <h3>Used attributes: XML="vegetable" var="output"</h3>
        <h2>x:out is used to print out the value of each XML nameValue attribute</h2>
        <h3>Used attributes: select="$output/parentXMLTagName/subXMLTagName[memberIndex]/nameValeTagName" this is called X:Path</h3>
        <hr>
        <h2>Vegetable Information:</h2>  
        
        <!--Tip1:We will write our XML code between the  JSTL c:set starting and ending tags-->
        <c:set var="vegetable">  
            <!--Tip2: two the parent tag XML tag which describe a group of tags which might have 
            different values-->

        <vegetables> 
            <!--Tip3: The sub tag which will indicates members -->
            <vegetable>  
                <!--Tip4: The name=value pair tags, which the tag is the name 
                and the text between the starting and the ending tags is the value.-->
                <name>onion</name>  
                <price>40/kg</price>  
            </vegetable>  
            <vegetable>  
                <name>Potato</name>  
                <price>30/kg</price>  
            </vegetable>  
            <vegetable>  
                <name>Tomato</name>  
                <price>90/kg</price>  
            </vegetable>  
        </vegetables>  
    </c:set>  
    <!--Tip5: x:parse our xml code, var is the variable which will be used to access values-->
    <x:parse xml="${vegetable}" var="output"/>  

    <b>Name of the vegetable is</b>:  
    <!--Tip6: x:out tag will print out each value-->
    <!--Tip7: select attributes takes string respectively as follows
        "$varName/parentXMLTagName/subXMLTagName[memberIndex]/nameValeTagName"
    -->
    <x:out select="$output/vegetables/vegetable[1]/name" /><br>  
    <b>Price of the Potato is</b>:  
    <x:out select="$output/vegetables/vegetable[1]/price" />  
</body>  
</html>  