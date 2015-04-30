/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller15;

/**
 *
 * @author administrador
 */
public class Empleado extends Persona implements Example {

    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public String irACasa() {
        return "Caminando";
    }
    
    @Override
    public String irAlTrabajo() {
        return "Bus";
    }

    
}
