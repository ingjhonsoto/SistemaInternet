<%-- 
    Document   : index
    Created on : 14/03/2020, 08:47:38 PM
    Author     : Jhon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Login</title>
    <link rel="stylesheet" href="estilos.css">
    <link rel="stylesheet" href="fonts.css">
    <link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Montez|Pathway+Gothic+One" rel="stylesheet">
    <script src="js/main.js"></script>
  </head>
  <body>
    <div class="contenedor">

      <header>
        <h1 class="title">JC Navarro</h1>
        <a href="">Registrate</a>
      </header>
      <div class="login">
        <article class="fondo">
          <img src="img/men.jpg" alt="User">
          <h3>Inicio de Sesión</h3>
          <form class="" action="login" method="post" id="forminicio">
              <span class="icon-user"></span><input class="inp" type="text" name="user" value="" id="txtuser" placeholder="Ingrese Usuario"><br>
              <span class="icon-key"></span><input class="inp" type="password" name="pass" value="" id="txtpass" placeholder="Ingrese contraseña"><br>
            <a href="" class="he">He olvidado mi contraseña</a>
            <input class="boton" type="button" name="inicio" id="btninicio" value="Iniciar Sesión">
          </form>
        </article>
      </div>

    </div>
  </body>
</html>

