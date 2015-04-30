/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author administrador
 */
public class Empleado extends Persona{
    
    private String cargo;
    private String salario;
    private String dependencia;
    
    public Empleado(){
        
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
    
    @Override
    public String getNombre(){
        return "YO";
    }

    @Override
    public void registroEmpleado() {
        System.out.println("----------------EMPLEADO-------------------");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Dependencia: " + this.dependencia);
    }
    
    
}
