/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller05;

/**
 *
 * @author administrador
 */
public class Libro {
    
    private String autor;
    private String editorial;
    private String titulo;
    private String edicion;

    
    public Libro() {
    }
    

    public Libro(String titulo, String edicion) {
        this.titulo = titulo;
        this.edicion = edicion;
    }

    public Libro(String autor, String editorial, boolean otro) {
        this.autor = autor;
        this.editorial = editorial;
    }

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
}
