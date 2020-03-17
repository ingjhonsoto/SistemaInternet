/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;
import java.sql.*;
/**
 *
 * @author Jhon
 */
public class registrousuario extends conexion{
    public boolean registrouser(String nombre, String a_paterno, String a_materno,int celular, String user, String pass,String fecha, String estado, String tipo) {
        PreparedStatement pst = null;
        

        try {
            String consulta = "{call nsp_insertuser(?,?,?,?,?,?,?,?,?)}";
            pst = getconexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, a_paterno);
            pst.setString(3, a_materno);
            pst.setInt(4, celular);
            pst.setString(5, user);
            pst.setString(6, pass);
            pst.setString(7, fecha);
            pst.setString(8, estado);
            pst.setString(9, tipo);
            if (pst.executeUpdate()==1) {
                return true;
            }

        } catch (Exception e) {
        } finally {
            try {
                if (getconexion() != null) {
                    getconexion().close();
                }
                if (pst != null) {
                    pst.close();
                }                
            } catch (Exception e) {
            }
        }

        return false;
    }    
    
}
