/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller01;

/**
 *
 * @author administrador
 */
public class Taller01 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Vehiculo v1 = new Vehiculo();
        v1.setMarca("Audi");
        v1.setColor("Negro");
        v1.setTipo("Deportivo");
        v1.setMatricula("YOL023");
        v1.setModelo(2015);
        
        
        int m = v1.getModelo();
               
                
        System.out.println("Marca: " + v1.getMarca());
        System.out.println("Matricula: " + v1.getMatricula());
        System.out.println("Tipo: " + v1.getTipo());
        System.out.println("Color: " + v1.getColor());
        System.out.println("Modelo: " + ++m);
        
    }
    
}
