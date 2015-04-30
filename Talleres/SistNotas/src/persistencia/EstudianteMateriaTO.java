/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author administrador
 */
public class EstudianteMateriaTO {

    private int idEstudianteMateria;
    private EstudianteTO estudiante;
    private MateriaTO materia;
    private String curso;
    private float nota1;
    private float nota2;
    private float nota3;
    private float promNota;
    
    

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getPromNota() {
        return promNota;
    }

    public void setPromNota(float promNota) {
        this.promNota = promNota;
    }

    public MateriaTO getMateria() {
        return materia;
    }

    public void setMateria(MateriaTO materias) {
        this.materia = materias;
    }

    public EstudianteTO getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteTO estudiante) {
        this.estudiante = estudiante;
    }

    public int getIdEstudianteMateria() {
        return idEstudianteMateria;
    }

    public void setIdEstudianteMateria(int idEstudianteMateria) {
        this.idEstudianteMateria = idEstudianteMateria;
    }
}
