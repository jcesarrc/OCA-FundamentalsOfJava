/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller06;

import persistencia.Empleado;
import persistencia.EmpleadoExterno;

/**
 *
 * @author administrador
 */
public class Taller06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado e = new Empleado();
        e.setNombre("Andres");
        e.setApellido("Lopeux");
        e.setEdad(24);
        e.setCargo("Developer & Standup comediant");
        e.setDependencia("Life 3.0");
        e.setSalario("6000 USD");
        e.registroEmpleado();
        
        EmpleadoExterno ex = new EmpleadoExterno();
        ex.setCodigo(410473045);
        ex.setOrganizacion("WikiLeaks");
        ex.registroEmpleado();
        
    }
    
}
