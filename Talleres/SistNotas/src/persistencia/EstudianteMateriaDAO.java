/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import recursos.IConstante;

/**
 *
 * @author administrador
 */
public class EstudianteMateriaDAO {

    private final Conexion conexion = new Conexion();
    private Connection conn;

    public EstudianteMateriaTO guardar(EstudianteMateriaTO estudianteMateriaTO) throws Exception {
        try {
            conn = conexion.getConnection();
            MateriaTO materiaTO = estudianteMateriaTO.getMateria();
            EstudianteTO estudianteTO = estudianteMateriaTO.getEstudiante();
            String sql = "INSERT INTO estudiante_materia ("
                    + "idMateria, curso, nota1, nota2, nota3, promNota, idEstudiante) "
                    + "VALUES('" + materiaTO.getIdMateria() + "',"
                    + "'" + estudianteMateriaTO.getCurso() + "',"
                    + "'" + estudianteMateriaTO.getNota1() + "',"
                    + "'" + estudianteMateriaTO.getNota2() + "',"
                    + "'" + estudianteMateriaTO.getNota3() + "',"
                    + "'" + estudianteMateriaTO.getPromNota() + "',"
                    + "'" + estudianteTO.getIdEstudiante() + "')";
            try (Statement st = conn.createStatement()) {
                st.executeUpdate(sql);
            }
            conn.close();
            System.out.println(IConstante.GUARDAR_OK);
            return estudianteMateriaTO;
        } catch (SQLException ex) {
            System.out.println(IConstante.GUARDAR_ERROR + " " + estudianteMateriaTO.getIdEstudianteMateria());
            throw ex;
        }
    }

    public EstudianteMateriaTO consultar(String documento, int idMateria) throws Exception {
        try {
            conn = conexion.getConnection();
            EstudianteMateriaTO estudianteMateriaTO = new EstudianteMateriaTO();
            EstudianteDAO estudianteDAO = new EstudianteDAO();
            MateriaDAO materiaDAO = new MateriaDAO();
            String sql = "SELECT * FROM estudiante_materia WHERE id_estudiante = ? "
                    + "AND id_materia = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                
                EstudianteTO estudianteTO = estudianteDAO.consultar(documento);
                MateriaTO materiaTO = materiaDAO.consultar(idMateria);
                ps.setInt(1, estudianteTO.getIdEstudiante());
                ps.setInt(2, idMateria);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    estudianteMateriaTO.setIdEstudianteMateria(rs.getInt("idestudiantemateria"));
                    estudianteMateriaTO.setEstudiante(estudianteTO);
                    estudianteMateriaTO.setMateria(materiaTO);
                    estudianteMateriaTO.setCurso(rs.getString("curso"));
                    estudianteMateriaTO.setNota1(rs.getFloat("nota1"));
                    estudianteMateriaTO.setNota2(rs.getFloat("nota2"));
                    estudianteMateriaTO.setNota3(rs.getFloat("nota3"));
                    estudianteMateriaTO.setPromNota(rs.getFloat("prom_notas"));
                }
                ps.close();
            }
            conn.close();
            return estudianteMateriaTO;
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }

    public EstudianteMateriaTO modificar(EstudianteMateriaTO estudianteMateriaTO) throws Exception {

        try {

            conn = conexion.getConnection();
            String sql = "UPDATE estudiante_materia SET idMateria = ? "
                    + "curso = ?, nota1 = ?, nota2 = ?, nota3 = ?, promNota = ?, "
                    + "WHERE idEstudiante = ? ";

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                int i = 0;
                ps.setInt(++i, estudianteMateriaTO.getMateria().getIdMateria());
                ps.setString(++i, estudianteMateriaTO.getCurso());
                ps.setFloat(++i, estudianteMateriaTO.getNota1());
                ps.setFloat(++i, estudianteMateriaTO.getNota2());
                ps.setFloat(++i, estudianteMateriaTO.getNota3());
                ps.setFloat(++i, estudianteMateriaTO.getPromNota());
                ps.setFloat(++i, estudianteMateriaTO.getEstudiante().getIdEstudiante());

                ps.executeUpdate(sql);
                ps.close();
                System.out.println(IConstante.GUARDAR_OK);
                conn.close();

                return estudianteMateriaTO;

            }

        } catch (SQLException ex) {
            System.out.println(IConstante.GUARDAR_ERROR + " " + estudianteMateriaTO.getIdEstudianteMateria());
            throw ex;
        }
    }

    public void borrar(EstudianteMateriaTO estudianteMateriaTO) throws Exception {

        try {

            conn = conexion.getConnection();
            String sql = "DELETE FROM estudiante_materia WHERE id_estudiante = ? "
                    + "AND id_materia = ?";

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                int i = 0;
                ps.setInt(++i, estudianteMateriaTO.getEstudiante().getIdEstudiante());
                ps.setInt(++i, estudianteMateriaTO.getMateria().getIdMateria());
                ps.executeUpdate(sql);
                ps.close();
                System.out.println(IConstante.ELMINAR_OK);
                conn.close();
            }

        } catch (SQLException ex) {
            System.out.println(IConstante.ELIMINAR_ERROR + " " + estudianteMateriaTO.getIdEstudianteMateria());
            throw ex;
        }
    }
    
    
    public String[][] consultarMateriasDelEstudiante(String documento) throws Exception {
        
        try {
            conn = conexion.getConnection();
            
            EstudianteDAO estudianteDAO = new EstudianteDAO();
            String[][] tableEstudianteMateriaTO;
            
            String sql = "SELECT * FROM estudiante_materia WHERE id_estudiante = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                EstudianteTO estudianteTO = estudianteDAO.consultar(documento);
                ps.setInt(1, estudianteTO.getIdEstudiante());
                ResultSet rs = ps.executeQuery();
                rs.last();
                int totalRows = rs.getRow();
                rs.beforeFirst();
                tableEstudianteMateriaTO = new String[totalRows+1][6];
                int row=0;
                while (rs.next()) {
                    EstudianteMateriaTO estudianteMateriaTO =
                            consultar(documento, rs.getInt("idMateria"));
                    tableEstudianteMateriaTO[row][0] = estudianteMateriaTO.getMateria().getNombre();
                    tableEstudianteMateriaTO[row][1] = estudianteMateriaTO.getCurso();
                    tableEstudianteMateriaTO[row][2] = ""+estudianteMateriaTO.getNota1();
                    tableEstudianteMateriaTO[row][3] = ""+estudianteMateriaTO.getNota2();
                    tableEstudianteMateriaTO[row][4] = ""+estudianteMateriaTO.getNota3();
                    tableEstudianteMateriaTO[row][5] = ""+estudianteMateriaTO.getPromNota();
                }
                ps.close();
            }
            conn.close();
            return tableEstudianteMateriaTO;
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
        
        
    }
}
