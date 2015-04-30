package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import recursos.IConstante;

/**
 *
 * @author Jhonatan Rodriguez Tatan
 */
public class MateriaDAO {

    private final Conexion conexion = new Conexion();
    private Connection conn;
    private final List<Object[]> lista = new ArrayList<>();

    public MateriaDAO() {
    }

    public MateriaTO guardaMateria(MateriaTO materiaTO) throws Exception {
        try {
            conn = conexion.getConnection();
            Float promedio = (Float.parseFloat(materiaTO.getNota()) + Float.parseFloat(materiaTO.getNota2()) + Float.parseFloat(materiaTO.getNota3())) / 3;
            String sql
                    = "INSERT INTO materia (cod_materia, nombre, curso, nota,nota2, nota3, prom_nota, id_estudiante) VALUES ('" + materiaTO.getCodigo() + "','"
                    + materiaTO.getNombre() + "','" + materiaTO.getCurso() + "','" + materiaTO.getNota() + "','" + materiaTO.getNota2() + "','" + materiaTO.getNota3() + "','" + promedio + "','"
                    + materiaTO.getIdEtudiante() + "')";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);

            st.close();
            System.out.println(IConstante.GUARDAR_OK);
            JOptionPane.showMessageDialog(null, IConstante.GUARDAR_OK);
            conn.close();
            return consultaMateria(materiaTO.getIdEtudiante());
        } catch (SQLException ex) {
            System.out.println(IConstante.GUARDAR_ERROR + " " + materiaTO.getCodigo() + " " + ex);
            throw ex;
        }
    }

    public MateriaTO consultaMateria(String idEstudiante) throws Exception {
        try {
            conn = conexion.getConnection();
            MateriaTO materiaTO = new MateriaTO();
            String sql = "SELECT * FROM materia WHERE id_estudiante= ?";

            try (PreparedStatement preparedStmt = conn.prepareStatement(sql)) {
                preparedStmt.setString(1, idEstudiante);
                ResultSet rs = preparedStmt.executeQuery();
                while (rs.next()) {
                    materiaTO.setCodigo(rs.getString("cod_materia"));
                    materiaTO.setNombre(rs.getString("nombre"));
                    materiaTO.setCurso(rs.getString("curso"));
                    materiaTO.setNota(rs.getString("nota"));
                    materiaTO.setNota2(rs.getString("nota2"));
                    materiaTO.setNota3(rs.getString("nota3"));
                    materiaTO.setPromedio(rs.getString("prom_nota"));
                    materiaTO.setIdEstudiante(rs.getString("id_estudiante"));
                }
                preparedStmt.close();
            }
            conn.close();
            return materiaTO;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(IConstante.CONSULTAR_ERROR + " " + idEstudiante);
            throw ex;
        }
    }

    public MateriaTO consultarCodigo(String codigo) throws Exception {
        try {
            conn = conexion.getConnection();
            MateriaTO materiasTO = new MateriaTO();
            String sql = "SELECT * FROM materia WHERE codigo_materia = '" + codigo + "'";
            ResultSet materias = conn.createStatement().executeQuery(sql);
            while (materias.next()) {
                materiasTO.setCodigo(materias.getString("codigo_materia"));
            }
            return materiasTO;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(IConstante.CONSULTAR_ERROR + " " + codigo);
            throw ex;
        }
    }
    
    public MateriaTO consultaMateriaCodigo(String codigo, String idEst) throws Exception {

        try {
            conn = conexion.getConnection();
            MateriaTO materiasTO = new MateriaTO();
            String sql = "SELECT * FROM materia WHERE cod_materia = '" + codigo + "' AND id_estudiante='"+idEst+"'";
            ResultSet materias = conn.createStatement().executeQuery(sql);
            while (materias.next()) {
                materiasTO.setCodigo(materias.getString("cod_materia"));
                
            }
            return materiasTO;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(IConstante.CONSULTAR_ERROR + " " + codigo);
             //JOptionPane.showMessageDialog(null, "YA Existe");
            throw ex;
        }
    }

    public void eliminarMateria(String samplePrgTO, String codigo) throws Exception {
        try {
            conn = conexion.getConnection();
            String sql = "DELETE FROM materia WHERE id_estudiante =? AND cod_materia = ?";
            try (PreparedStatement preparedStmt = conn.prepareStatement(sql)) {
                preparedStmt.setString(1, samplePrgTO);
                preparedStmt.setString(2, codigo);
                preparedStmt.executeUpdate();
                preparedStmt.close();
            }
            System.out.println(IConstante.ELIMINAR_OK);
            conn.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(IConstante.ELIMINAR_ERROR + " " + samplePrgTO);
            throw ex;
        }
    }

    public void modificarMateria(MateriaTO materiaTO) throws Exception {
        try {
            conn = conexion.getConnection();
            String sql = "UPDATE materia SET curso = ?, nota=?, nota2=?, nota3=? where id_estudiante = ? AND cod_materia=?";
            try (PreparedStatement preparedStmt = conn.prepareStatement(sql)) {
                preparedStmt.setString(1, materiaTO.getCurso());
                preparedStmt.setString(2, materiaTO.getNota());
                preparedStmt.setString(3, materiaTO.getNota2());
                preparedStmt.setString(4, materiaTO.getNota3());
                preparedStmt.setString(5, materiaTO.getIdEtudiante());
                preparedStmt.setString(6, materiaTO.getCodigo());
                preparedStmt.executeUpdate();
                preparedStmt.close();
            }
            System.out.println(IConstante.MODIFICAR_OK);

            conn.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(IConstante.MODIFICAR_ERROR + " " + materiaTO.getCodigo());
            throw ex;
        }
    }

    public List<Object[]> cargarTabla(String idEstudiante) throws Exception {
        try {
            System.out.println(idEstudiante);
            conn = conexion.getConnection();
            String sql = "SELECT * FROM materia WHERE id_estudiante = ?";
            try (PreparedStatement preparedStmt = conn.prepareStatement(sql)) {
                preparedStmt.setString(1, idEstudiante);
                ResultSet rs = preparedStmt.executeQuery();
                while (rs.next()) {
                    MateriaTO materiaTO = new MateriaTO();
                    materiaTO.setId(rs.getInt("id"));
                    materiaTO.setCodigo(rs.getString("cod_materia"));
                    materiaTO.setNombre(rs.getString("nombre"));
                    materiaTO.setCurso(rs.getString("curso"));
                    materiaTO.setIdEstudiante(rs.getString("id_estudiante"));
                    materiaTO.setPromedio(rs.getString("prom_nota"));
                    Object[] fila = new Object[4];
                    fila[0] = materiaTO.getCodigo();
                    fila[1] = materiaTO.getNombre();
                    fila[2] = materiaTO.getCurso();
                    fila[3] = materiaTO.getPromedio();
                    lista.add(fila);
                }
                preparedStmt.close();
            }
            conn.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(IConstante.CONSULTAR_ERROR + " " + idEstudiante);
            throw ex;
        }
        return lista;
    }

}
