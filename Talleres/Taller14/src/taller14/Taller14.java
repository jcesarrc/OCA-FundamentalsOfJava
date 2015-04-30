/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller14;

/**
 *
 * @author administrador
 */
public class Taller14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         int i = 1;
         for (;i <= 10;) {
         System.out.println("|- Ciclo externo: " + i++);
         int y = 1;
         for (;y <= 10;) {
         System.out.println("|--- Ciclo interno: " + y);
         if(y==7)continue;
         y++;
         }
         }

         System.out.println("\n\n");
         String z = "Imprimiendo...";
         int y = 0;
         do {
         System.out.println("|--- Ciclo DO: " + y++);
         }while(y<=10);
         System.out.println(z);
         */
        etiqueta:
        for (int i = 1; i <= 10; i++) {
            System.out.println("|- for externo: " + i);
            for (int y = 1; y <= 10; y++) {
                if (y == 7) {
                    break etiqueta;
                }
                System.out.println("|---- for interno: " + y);
            }
        }
        
        System.out.println("Im outta here!");
    }
}
