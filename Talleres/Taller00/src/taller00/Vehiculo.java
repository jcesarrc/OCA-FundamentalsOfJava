/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller00;

/**
 *
 * @author administrador
 */
public class Vehiculo {
    
    private String marca;
    private String color;
    private String tipo;
    private String matricula;
    
    
    public Vehiculo(String marca, String color, String tipo, String matricula){
        
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.matricula = matricula;
        
    }
    
    public void imprimir(){
        
        System.out.println( "Marca : " + this.marca );
        System.out.println( "Color : " + this.color );
        System.out.println( "Tipo : " + this.tipo );
        System.out.println( "Matricula : " + this.matricula );
        System.out.println( "" );
        
    }
    
}
