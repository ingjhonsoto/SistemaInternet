<%-- 
    Document   : clientestotales
    Created on : 20/03/2020, 12:27:06 PM
    Author     : jsoto
--%>

<%@page import="include.clientes"%>
<%@page import="controladores.lista_clientes"%>
<%@page import="vista.v_clientes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de clientes</title>
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
        <link rel="stylesheet" href="css/tablascroll.css">
    </head>

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
        <h1 align="center">Clientes</h1>
        <form action="editarcliente" method="post" id="form-editar"></form>
        <div id="div1" > 
            <table id="dtHorizontalExample" class="table table-striped table-bordered table-sm" cellspacing="0"
                   width="100%" align="center">
                <thead class="cab-dark">
                    <tr>
                        <th class="th-sm">codigo cliente
                        </th>
                        <th class="th-sm">DNI
                        </th>
                        <th class="th-sm">Nombre
                        </th>
                        <th class="th-sm">Apellido Paterno
                        </th>
                        <th class="th-sm">Apellido Materno
                        </th>
                        <th class="th-sm">Direccion
                        </th>
                        <th class="th-sm">Celular
                        </th>
                        <th class="th-sm">Estado
                        </th>
                        <th class="th-sm">Acciones
                        </th>
                    </tr>
                </thead>
                <tbody class="cuerpo-tab">
                                
                            <% v_clientes vc = new v_clientes();%>
                            <%=vc.getviewclientes()%>
                            </tbody>
                            </table>
                        </div> 
                        <script src="js/jquery.min.js"></script>
                        <script src="bootstrap/js/bootstrap.min.js"></script>
                        <script src="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.11.1/js/lightbox-plus-jquery.min.js"></script>
                        <script src="js/tablascroll.js"></script>
                                      
</body>
</html>

                        
