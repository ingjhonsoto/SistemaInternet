/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import include.clientes;
import java.sql.*;

/**
 *
 * @author jsoto
 */
public class insercliente extends conexion{
    public boolean r_cliente(clientes c){
        PreparedStatement pst=null;
        boolean flag=false;
        try {
            String sql="{call nsp_insertcliente(?,?,?,?,?,?,?,?)}";
            pst=getconexion().prepareCall(sql);
            pst.setString(1,c.getDni());
            pst.setString(2,c.getNombre());
            pst.setString(3, c.getPaterno());
            pst.setString(4, c.getMaterno());
            pst.setString(5, c.getDireccion());
            pst.setInt(6, c.getCelular());
            pst.setString(7, c.getIdestado());
            pst.setInt(8, c.getIdusuario());
            
            if (pst.executeUpdate() == 1) {
                flag=true;
            }
        } catch (Exception e) {
        }finally{
            try {
                if(getconexion() !=null) getconexion().close();
                if(pst !=null) pst.close();

            } catch (Exception e) {
            }
        }
        
        return flag;
    }

}
