/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller15;

/**
 *
 * @author administrador
 */
public class Taller15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p = new Empleado();
        Persona q = new EmpleadoDos();
                
        System.out.println("Empleado 1 va a la casa en: " + p.irACasa());
        System.out.println("Empleado 1 va al trabajo en: " + p.irAlTrabajo());
        
        System.out.println("Empleado 2 va a la casa en: " + q.irACasa());
        System.out.println("Empleado 2 va al trabajo en: " + q.irAlTrabajo());
        
        
    }
}
