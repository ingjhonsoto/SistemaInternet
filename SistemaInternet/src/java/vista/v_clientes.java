/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controladores.lista_clientes;
import include.listarcliente;

/**
 *
 * @author jsoto
 */
public class v_clientes {
    
    public String getviewclientes(){
        String htmlcode="";
           lista_clientes lc = new lista_clientes();
            for (listarcliente c : lc.getclientes()) {
                htmlcode +="   <tr>\n" +
"                <td><label for=\"\" id=\"txtidcl\">"+c.getIdcliente()+"</label></td>          \n" +
"                <td><label for=\"\" id=\"txtdnicl\">"+c.getDni()+"</label></td>          \n" +
"                <td><label for=\"\" id=\"txtnombrecl\">"+c.getNombre()+"</label></td>          \n" +
"                <td><label for=\"\" id=\"txtapaternocl\">"+c.getPaterno()+"</label></td>          \n" +
"                <td><label for=\"\" id=\"txtamaternocl\">"+c.getMaterno()+"</label></td>          \n" +
"                <td><label for=\"\" id=\"txtdireccioncl\">"+c.getDireccion()+"</label></td>          \n" +
"                <td><label for=\"\" id=\"txtcelularcl\">"+c.getCelular()+"</label></td>          \n" +
"                <td><label for=\"\" id=\"txtestadocl\">"+c.getEstado()+"</label></td>          \n" +
"                <td>                <div class=\"op\"></div>\n" +
"            <a href='editarcliente.jsp?idcliente="+c.getIdcliente()+"'><i class=\"icon fas fa-edit btn btn-primary\"></i></a>\n" +
"     \n" +
"   <a href=\"detallescliente.jsp\"><i class=\"icon ion-android-more-horizontal btn btn-primary\"></i></button>\n" +
"                <a href=\"eliminarcliente.jsp\"><i class=\"icon ion-android-delete btn btn-primary\"></i></a>\n" +
"                 </td>      \n" +
"            </tr>";
            }
            
    return htmlcode;
    }
    
}
