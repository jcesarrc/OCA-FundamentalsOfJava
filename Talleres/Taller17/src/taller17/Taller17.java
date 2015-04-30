/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author administrador
 */
public class Taller17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader buffer = null;
        try {
            String linea;
            buffer = new BufferedReader(new FileReader("/home/administrador/Escritorio/demo.txt"));
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                buffer.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
