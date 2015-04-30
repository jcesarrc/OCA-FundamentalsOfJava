/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller00;

/**
 *
 * @author administrador
 */
public class Taller00 {
    
    public String marca;
    public String color;
    public String tipo;
    public String matricula;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
         * 
        Vehiculo v1 = new Vehiculo("Mazda", "Negro", "Deportivo", "XYZ123");
        Vehiculo v2 = new Vehiculo("Audi", "Plata", "Deportivo", "ABC987");
        Vehiculo v3 = new Vehiculo("Ford", "Rojo", "Sedán", "QWE552");
        
        v1.imprimir();
        v2.imprimir();
        v3.imprimir();
        * 
        */
        
        Taller00 t1 = new Taller00();
        t1.marca = "MZD";
        t1.color = "NGR";
        t1.tipo = "DEP";
        t1.matricula = "HI5";
        t1.imprimir();
        
        
    }
    
    public void imprimir(){
        
        System.out.printf( "Marca : %s\n" , this.marca );
        System.out.println( "Color : " + this.color );
        System.out.println( "Tipo : " + this.tipo );
        System.out.println( "Matricula : " + this.matricula );
        System.out.println( "" );
        
    }
    
}
