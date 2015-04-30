/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

/**
 *
 * @author administrador
 */
public class Taller11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        // TODO code application logic here
        try{
            Persona p = new Persona(args[0], args[1], args[2], 
                    Integer.parseInt(args[3]));
            p.imprimir();

            for(int i=0; i<args.length; i++){
                System.out.println(args[i]);
            }
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("---------");
            System.out.println("Wrong number of parameters");
            System.out.print("The sintaxis for this command is ");
            System.out.println("command arg[0] arg[1] arg[2] arg[3]");
            System.out.println("---------");
            
        }
        
    }
    
}
