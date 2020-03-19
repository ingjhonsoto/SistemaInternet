/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package include;

/**
 *
 * @author jsoto
 */
public class clientes {

    /**
     * @return the dni
     */
            private String dni;
  	private String nombre;
	private String paterno;
	private String materno;
	private String direccion;
	private int celular;
	private String idestado;
	private int idusuario;

    public clientes() {
    }

    public clientes(String dni, String nombre, String paterno, String materno, String direccion, int celular, String idestado, int idusuario) {
        this.dni = dni;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.direccion = direccion;
        this.celular = celular;
        this.idestado = idestado;
        this.idusuario = idusuario;
    }
        
        
        
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the paterno
     */
    public String getPaterno() {
        return paterno;
    }

    /**
     * @param paterno the paterno to set
     */
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    /**
     * @return the materno
     */
    public String getMaterno() {
        return materno;
    }

    /**
     * @param materno the materno to set
     */
    public void setMaterno(String materno) {
        this.materno = materno;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the celular
     */
    public int getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(int celular) {
        this.celular = celular;
    }

    /**
     * @return the idestado
     */
    public String getIdestado() {
        return idestado;
    }

    /**
     * @param idestado the idestado to set
     */
    public void setIdestado(String idestado) {
        this.idestado = idestado;
    }

    /**
     * @return the idusuario
     */
    public int getIdusuario() {
        return idusuario;
    }

    /**
     * @param idusuario the idusuario to set
     */
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

}
