/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller15;

/**
 *
 * @author administrador
 */
public abstract class Persona {

    private int documento;
    private String nombre;
    private String apellidos;
    private int edad;

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public abstract String irAlTrabajo();
    public abstract String irACasa();
    
}
