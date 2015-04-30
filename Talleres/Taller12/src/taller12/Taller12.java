/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller12;

/**
 *
 * @author administrador
 */
public class Taller12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] tabla = new int[4][];
        tabla[0] = new int[3];
        tabla[1] = new int[4];
        tabla[2] = new int[5];
        tabla[3] = new int[6];
        
        tabla[0][0] = 1000;
        tabla[0][1] = 1500;
        tabla[0][2] = 1800;
        tabla[1][0] = 1000;
        tabla[3][3] = 2000;
        
        for(int i=0; i<tabla.length; i++){
            for(int j=0; j<tabla[i].length; j++){
                System.out.print(tabla[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
