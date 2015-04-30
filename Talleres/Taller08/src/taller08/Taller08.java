/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller08;

import java.lang.reflect.Method;

/**
 *
 * @author administrador
 */
public class Taller08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int x = 18;
        Persona p = new Persona();
        System.out.println(x);
        System.out.println(p);
        */
        Persona p = new Persona();
        p.setNombre("Cool ");
        p.setApellido("Aid");
        p.setDocumento("11001101");
        p.setEdad(24);
        
        System.out.println("***************");
        System.out.print(p.getNombre());
        System.out.println(p.getApellido());
        System.out.println(p.getDocumento());
        System.out.println(p.getEdad());
        
        
        Persona q = new Persona();
        q.setNombre("Albert ");
        q.setApellido("Hoffman");
        q.setDocumento("LSD25");
        q.setEdad(99);
        
        System.out.println("***************");
        System.out.print(q.getNombre());
        System.out.println(q.getApellido());
        System.out.println(q.getDocumento());
        System.out.println(q.getEdad());
        
        Persona w = q;
        q.setNombre("Mr. Peanutbutter ");
        q.setApellido("& Jelly");
        //q.setDocumento("Y0L0");
        //q.setEdad(21);
        
        System.out.println("***************");
        System.out.print(w.getNombre());
        System.out.println(w.getApellido());
        System.out.println(w.getDocumento());
        System.out.println(w.getEdad());
        
        System.out.println("***************");
        System.out.print(w.getNombre());
        System.out.println(w.getApellido());
        System.out.println(w.getDocumento());
        System.out.println(w.getEdad());
        
        
    }
}
