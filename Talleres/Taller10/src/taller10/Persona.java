/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10;

/**
 *
 * @author administrador
 */
public class Persona {
    
    private String documento;
    private String nombre;
    private String apellido;
    private int edad;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprimir(){
        System.out.println("---------------------------");
        System.out.println(this.nombre + " " + this.apellido + " | " + 
                this.documento + " | " + this.edad);
    }
    
}
