/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author administrador
 */
public class EstudianteTO {
    
  private int idEstudiante;
  private String documento;
  private String apellido;
  private String nombre;
  private String telefono;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void imprimir(){
        System.out.println("Estudiante: " +idEstudiante);
        System.out.println("Documento: " +documento);
        System.out.println("Apellido: " +apellido);
        System.out.println("Nombre: " +nombre);
        System.out.println("Telefono: " +telefono);
    }
  
  
}
