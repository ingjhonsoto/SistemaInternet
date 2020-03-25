<%-- 
    Document   : menu
    Created on : 15/03/2020, 10:34:19 AM
    Author     : Jhon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    HttpSession objsesion = request.getSession(false);
    String usuario=(String) objsesion.getAttribute("Usuario");
    if (usuario.equals("")) {
            response.sendRedirect("index.jsp");
        }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Usuario <%out.println(usuario);%></h1>
        
    </body>
</html>
