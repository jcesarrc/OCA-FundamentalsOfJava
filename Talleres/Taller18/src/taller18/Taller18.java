/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller18;

/**
 *
 * @author administrador
 */
public class Taller18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(Operaciones.dividir(-1, 0));
        } catch (MisExcepciones e) {
            System.out.println(e);
        }
    }
    
}

