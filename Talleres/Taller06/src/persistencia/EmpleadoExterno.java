/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author administrador
 */
public class EmpleadoExterno extends Persona{
    
    private int codigo;
    private String organizacion;
    
    public EmpleadoExterno(){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    @Override
    public void registroEmpleado() {
        System.out.println("-------------EMPLEADO EXTERNO--------------");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Organizacion: " + this.organizacion);
    }
    
    
    
}
