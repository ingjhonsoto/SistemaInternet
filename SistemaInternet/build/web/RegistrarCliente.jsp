<%-- 
    Document   : RegistrarCliente
    Created on : 17/03/2020, 03:43:33 PM
    Author     : jsoto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Registro cliente</title>
    </head>
  <body>
      <h1>NUEVO CLIENTE</h1>
      <form action="registracliente" name="form1" method="POST" id="nuevocliente">
          <table>
              <thead>
              <th><label for="">Columnas</label></th>
              <th><label for="">Datos</label></th>
              </thead>
              <tbody></tbody>
              <tr>
              <td><label for="">D.N.I.</label></td>
              <td><input type="text" name="dni" id="dni" placeholder="Ingrese DNI"></td>
              </tr>
                 <tr>
              <td><label for="">Nombres</label></td>
              <td><input type="text" name="nombre" id="nombre" placeholder="Ingrese su Nombre"></td>
              </tr>
              <tr>
              <td><label for="">Apellido paterno</label></td>
              <td><input type="text" name="apaterno" id="apaterno" placeholder="Ingrese su apellido paterno"></td>
              </tr>
                 <tr>
              <td><label for="">Apellido materno</label></td>
              <td><input type="text" name="amaterno" id="amaterno" placeholder="ingrese su apellido materno"></td>
              </tr>
                 <tr>
              <td><label for="">Direccion</label></td>
              <td><input type="text" name="direccion" id="direccion" placeholder="Ingrese su direccion"></td>
              </tr>
                 <tr>
              <td><label for="">Celular</label></td>
              <td><input type="text" name="celular" id="celular" placeholder="Ingrese su celular"></td>
              </tr>
                 <tr>
              <td></td>
              <td><input type="submit" value="Registrar" id="btnregistar"> <input type="reset" value="Limpiar" id="btnlimpiar"></td>
              </tr>
              </tbody>
          </table>
          
      </form>
 
  </body>
</html>
