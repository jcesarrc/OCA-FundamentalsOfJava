/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller16;

/**
 *
 * @author administrador
 */
public class Taller16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object o = new Object();
        try{
            System.out.println("Intentamos ejecutar el bloque de instrucciones");
            System.out.println("Instruccion 1");
            System.out.println("Instruccion 2");
            System.out.println("Instruccion 3, etc...");
            int x = Integer.parseInt("m");
        }catch(Exception e){
            System.out.println("Instrucciones a ejecutar cuando se produce un error " + e.getClass().getName());
        }finally{
            System.out.println("Instrucciones a ejecutar finalmente tanto si se producen errores o no");
        }
    }
}
