/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller13;

import java.util.ArrayList;

/**
 *
 * @author administrador
 */
public class Taller13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList myList = new ArrayList();
        myList.add("John Doe");
        myList.add("Yao Ming");
        myList.add("Mary Jane");
        myList.add("Prashant");
        myList.add("Tom Riddle");
            
        myList.remove(myList.lastIndexOf("Prashant"));
        myList.remove("Prashant");
        System.out.println(myList);
        
        
    }
}
