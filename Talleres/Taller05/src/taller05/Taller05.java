/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller05;

/**
 *
 * @author administrador
 */
public class Taller05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Leaves of grass");
        Libro libro3 = new Libro("Leaves of grass", "Primera Edición");
        Libro libro4 = new Libro("Walt Withman", "Eternal", true);
        
        System.out.println(libro3.getTitulo()+ " / " + libro3.getEdicion());
        
    }
}
