<%-- 
    Document   : login
    Created on : 21/03/2020, 05:04:29 PM
    Author     : jsoto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>sistemainternet</title>
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
    <div class="login-dark">
        <form method="post" action="login">
            <h2 class="sr-only">Login Form</h2>
            <div class="illustration"><i class="icon ion-ios-locked-outline"></i></div>
            <div class="form-group"><input class="form-control" type="text" name="user" placeholder="Ingrese su usuario"></div>
            <div class="form-group"><input class="form-control" type="password" name="pass" placeholder="Ingrese su clave"></div>
            <div class="form-group"><button class="btn btn-primary btn-block" type="submit">Iniciar Sesión</button></div><a href="#" class="forgot">¿Olvidaste tu clave?</a></form>
    </div>
    <footer class="pie">
        <div class="row">
            <div class="col-sm-6 col-md-4 footer-navigation">
                <h3><a href="#">J&amp;C Navarro</a></h3>
                <p class="links"><a href="#">Inicio</a><strong> · </strong><a href="#">Contactanos</a><strong> ·&nbsp;</strong></p>
                <p class="company-name">Company Soto Solutions © 2020</p>
            </div>
            <div class="col-sm-6 col-md-4 footer-contacts">
                <div><span class="fa fa-map-marker footer-contacts-icon"> </span>
                    <p><span class="new-line-span">Av. Panamericana s/n Nomara</span> La Huaca, Paita</p>
                </div>
                <div><i class="fa fa-phone footer-contacts-icon"></i>
                    <p class="footer-center-info email text-left">+51 950234204</p>
                </div>
                <div><i class="fa fa-envelope footer-contacts-icon"></i>
                    <p> <a href="#" target="_blank">jcnavarro@gamil.com</a></p>
                </div>
            </div>
            <div class="clearfix"></div>
            <div class="col-md-4 footer-about">
                <h4>Acerca de nosotros</h4>
                <p>Somos una empresa con &nbsp;mucho tiempo en el rubro de la tecnologia, contamos con el mejor servicio de internet las 24 horas del dia.</p>
                <div class="social-links social-icons"><a href="#"><i class="fa fa-facebook"></i></a><a href="#"><i class="fa fa-twitter"></i></a><a href="#"><i class="fa fa-linkedin"></i></a><a href="#"><i class="fa fa-github"></i></a></div>
            </div>
        </div>
    </footer>
    <script src="js/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.11.1/js/lightbox-plus-jquery.min.js"></script>
    <script src="js/tablascroll.js"></script>
</body>
</html>
