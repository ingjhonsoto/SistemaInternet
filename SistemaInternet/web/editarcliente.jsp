<%-- 
    Document   : editarcliente
    Created on : 22/03/2020, 11:35:58 AM
    Author     : jsoto
--%>

<%@page import="include.listarcliente"%>
<%@page import="controladores.lista_clientes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./css/tablascroll.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="fonts/fontawesome-all.min.css">
        <link rel="stylesheet" href="fonts/font-awesome.min.css">
        <link rel="stylesheet" href="fonts/ionicons.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Cookie">
        <link rel="stylesheet" href="css/estilos.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.11.1/css/lightbox.min.css">
        <link rel="stylesheet" href="css/Login-Form-Dark.css">
        <link rel="stylesheet" href="css/Pretty-Footer.css">
        <link rel="stylesheet" href="css/styles-1.css">
        <link rel="stylesheet" href="css/styles.css">
        <link rel="stylesheet" href="css/tablaedit.css">
    </head>
    <body>
                <nav class="navbar navbar-light navbar-expand-md">
            <div class="container"><a class="navbar-brand" href="#"><img src="img/logo.jpg" id="logo"><strong>J&amp;C Navarro</strong></a><button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
                <div
                    class="collapse navbar-collapse" id="navcol-1">
                    <ul class="nav navbar-nav ml-auto">
                        <li class="nav-item" role="presentation"><a class="nav-link" href="index.jsp">Inicio</a></li>
                        <li class="nav-item" role="presentation"><a class="nav-link" href="#">Consultar</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="editcliente">
        <h3 align="center">EDITAR CLIENTE</h3>
        <%listarcliente c = new lista_clientes().geteditclientes(Integer.parseInt(request.getParameter("idcliente")));%>
       
        <form action="editarcliente" method="post">
            
            <table class="table table-bordered tbedit" align="center">
                    <thead id="editcabecera">
                        <tr>
                    <th><label for="">Columnas</label></th>
                    <th><label for="">Datos</label></th>
                    </tr>
                    </thead>
                    <tbody id="editcuerpo">
                     <tr>
                         <td align="center"><label for=""><strong>N°:</strong></label></td>
                        <td align="center"><input type="text" name="idcliente" id="txtidcliente" value="<%= c.getIdcliente()%>" readonly></td>
                    </tr>
                    <tr>
                        <td align="center"><label for=""><strong>D.N.I.:</strong></label></td>
                        <td align="center"><input type="text" name="dni" id="txtdni" value="<%= c.getDni()%>"></td>
                    </tr>
                    <tr>
                        <td align="center"><label for=""><strong>Nombres :</strong></label></td>
                        <td align="center"><input type="text" name="nombre" id="txtnombre" value="<%= c.getNombre()%>"></td>
                    </tr>
                    <tr>
                        <td align="center"><label for=""><strong>Apellido paterno :</strong></label></td>
                        <td align="center"><input type="text" name="apaterno" id="txtapaterno" value="<%= c.getPaterno()%>"></td>
                    </tr>
                    <tr>
                        <td align="center"><label for=""><strong>Apellido materno :</strong></label></td>
                        <td align="center"><input type="text" name="amaterno" id="txtamaterno" value="<%= c.getMaterno()%>"></td>
                    </tr>
                    <tr>
                        <td align="center"><label for=""><strong>Direccion :</strong></label></td>
                        <td align="center"><input type="text" name="direccion" id="txtdireccion" value="<%= c.getDireccion()%>"></td>
                    </tr>
                    <tr>
                        <td align="center"><label for=""><strong>Celular :</strong></label></td>
                        <td align="center"><input type="text" name="celular" id="txtcelular" value="<%= c.getCelular()%>"></td>
                    </tr>
                     <tr>
                        <td align="center"><label for=""><strong>Estado :</strong></label></td>
                        <td align="center"><select name="estado"><option>AC | ACTIVO</option><option>IN|INACTIVO</option></select></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="center"><input type="submit" class="btn btn-primary" value="Actualizar" id="btnactualizar"> <a href="clientestotales.jsp" class="btn btn-secondary">volver</a></td>
                    </tr>
                    </tbody>
                </table>
            
        </form>
                    </div>

        <script src="js/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.11.1/js/lightbox-plus-jquery.min.js"></script>
        <script src="js/tablascroll.js"></script>
    </body>
</html>
