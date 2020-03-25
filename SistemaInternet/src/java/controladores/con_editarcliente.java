/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import include.in_editarcliente;
import java.sql.*;

/**
 *
 * @author jsoto
 */
public class con_editarcliente extends conexion{
    public boolean editcliente(in_editarcliente ed){
        boolean flag = false;
            PreparedStatement pst=null;
            String sql="call nsp_editarcliente(?,?,?,?,?,?,?,?)";
            try {
                pst=getconexion().prepareCall(sql);
                pst.setInt(1, ed.getIdcliente());
                pst.setString(2, ed.getDni());
                pst.setString(3, ed.getNombre());
                pst.setString(4, ed.getPaterno());
                pst.setString(5, ed.getMaterno());
                pst.setString(6, ed.getDireccion());
                pst.setInt(7, ed.getCelular());
                pst.setString(8, ed.getEstado());
                if (pst.executeUpdate()==1) {
                    flag=true;
                }
                
        } catch (Exception e) {
        }finally{
                try {
                if (getconexion() != null) {
                    getconexion().close();
                }if(pst != null){pst.close();}                    
                } catch (Exception e) {
                }

            
            }
        
        return flag;
    
    }
  /*  public static void main(String[] args) {
        controladores.con_editarcliente ec=new controladores.con_editarcliente();
        System.out.println(ec.editcliente(35, "74803993", "Jhon", "Soto", "Navarro", "Nomara", 989868574, "AC"));
    }*/

  /*  public boolean editcliente(in_editarcliente in_editarcliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
