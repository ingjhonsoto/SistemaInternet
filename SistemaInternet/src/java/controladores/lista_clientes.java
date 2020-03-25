/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import include.listarcliente;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author jsoto
 */
public class lista_clientes extends conexion {
        public  ArrayList<listarcliente> getclientes(){
            ArrayList<listarcliente> clientes = new ArrayList<>();
            PreparedStatement pst=null;
            ResultSet rs=null;
            try {
                String sql="call nsp_listarclientes()";
                pst=getconexion().prepareCall(sql);
                rs=pst.executeQuery();
                while (rs.next()) {                    
                    clientes.add(new listarcliente(rs.getInt("idcliente"), rs.getString("dni"), rs.getString("nombre"), rs.getString("a_paterno"), rs.getString("a_materno"), rs.getString("direccion"), rs.getInt("celular"), rs.getString("descripcion")));
                }
            } catch (Exception e) {
            }finally{
                try {
                    if (getconexion() != null) getconexion().close();
                    if (pst != null) pst.close();
                    if (rs != null) rs.close();                        
                    
                } catch (Exception e) {
                }
            
            }
        
        return clientes;
        }
        
 public  listarcliente geteditclientes(int idcliente){
            listarcliente clientes =null;
            PreparedStatement pst=null;
            ResultSet rs=null;
            try {
                String sql="select c.idcliente,c.dni,c.nombre,c.a_paterno,c.a_materno,c.direccion,c.celular,e.descripcion from clientes c inner join estado e on c.idestado=e.idestado where idcliente=?";
                pst=getconexion().prepareCall(sql);
                 pst.setInt(1, idcliente);
                rs=pst.executeQuery();
                while (rs.next()) {                    
                    clientes=new listarcliente(rs.getInt("idcliente"), rs.getString("dni"), rs.getString("nombre"), rs.getString("a_paterno"), rs.getString("a_materno"), rs.getString("direccion"), rs.getInt("celular"), rs.getString("descripcion"));
                }
            } catch (Exception e) {
            }finally{
                try {
                    if (getconexion() != null) getconexion().close();
                    if (pst != null) pst.close();
                    if (rs != null) rs.close();                        
                    
                } catch (Exception e) {
                }
            
            }
        
        return clientes;
        }        
   /*    //como probar que traiga todos los datos de la ejecucion del procedimiento almacenado
        public static void main(String[] args) {
        lista_clientes lc = new lista_clientes();
            for (listarcliente c : lc.geteditclientes(35)) {
                System.out.println(c.getNombre()+" "+c.getEstado());
            }
    }*/
}

