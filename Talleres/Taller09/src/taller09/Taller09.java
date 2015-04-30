/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller09;

/**
 *
 * @author administrador
 */
public class Taller09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x = "Estoy estudiando JAVA         ";
        System.out.println(x);
        System.out.println(Integer.toHexString(System.identityHashCode(x)));
        x = x.toLowerCase();
        System.out.println(x.toLowerCase());
        System.out.println(Integer.toHexString(System.identityHashCode(x)));
        x = x.toUpperCase();
        System.out.println(x.toUpperCase());
        System.out.println(Integer.toHexString(System.identityHashCode(x)));
        x = x.substring(6);
        System.out.println(x.substring(6));
        
        
        
        String s = "Base";
        System.out.println(Integer.toHexString(System.identityHashCode(s)));
        
       System.out.println(Integer.toHexString(System.identityHashCode(s)));
        
        //x = x.trim() + " #ElSabado";
        //System.out.println(x);
    }
}
