package persistencia;

import java.io.Serializable;

/**
 *
 * @author Jhonatan Rodriguez Tatan
 */
public class MateriaTO implements Serializable {

    private int id;
    private String codigo;
    private String nombre;
    private String curso;
    private String nota;
    private String nota2;
    private String nota3;
    private String promedio;
    private String idEstudiante;

    public MateriaTO() {
    }

    public int getId() {
        return id;
    }

    public String getNota2() {
        return nota2;
    }

    public void setNota2(String nota2) {
        this.nota2 = nota2;
    }

    public String getNota3() {
        return nota3;
    }

    public void setNota3(String nota3) {
        this.nota3 = nota3;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public String getIdEtudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String id_estudiante) {
        this.idEstudiante = id_estudiante;
    }

}
