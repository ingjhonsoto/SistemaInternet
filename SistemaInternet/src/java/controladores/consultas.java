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
public class consultas extends conexion{
    
    public boolean autenticacion(String user, String pass) {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "select * from usuario where user = ? and contra = ?";
            pst = getconexion().prepareStatement(consulta);
            pst.setString(1, user);
            pst.setString(2, pass);
            rs = pst.executeQuery();
            if (rs.absolute(1)) {
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
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
            }
        }

        return false;
    }    

}
