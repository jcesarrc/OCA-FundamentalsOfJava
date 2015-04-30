/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller01;

/**
 *
 * @author administrador
 */
public class Vehiculo {
    
    private String marca;
    private String color;
    private String tipo;
    private String matricula;
    private int modelo;
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    public void imprimir(){
        
        System.out.println( "Marca : " + this.marca );
        System.out.println( "Color : " + this.color );
        System.out.println( "Tipo : " + this.tipo );
        System.out.println( "Matricula : " + this.matricula );
        System.out.println( "Modelo: " + this.modelo );
        System.out.println( "" );
        
    }

    
}
