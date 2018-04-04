<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="Draw" uri="/jspfunc"%>
<!DOCTYPE html> 
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP EL Funcion</title>
    <style>
      hr { background-color: #3366ff; height: 4px; border: 0; }
    </style>    
  </head>
  <body>
    ${Draw:SetHostUrl(pageContext.request.getRequestURL())}
    <div style="max-width:310px; position:  relative; ">
      <%@ include file="/WEB-INF/header.jsp" %>
      ${Draw:DrawCircle(100, 100, 50, "blue")}
      <%@ include file="/WEB-INF/footer.jsp" %>  
      <hr>
      ${Draw:PrintFullDrawingURL()}
    </div>
  </body>
</html>
