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
public class EstudianteDAO {

    private final Conexion conexion = new Conexion();
    private Connection conn;

    public EstudianteTO guardar(EstudianteTO estudianteTO) throws Exception {
        try {
            conn = conexion.getConnection();
            String sql = "INSERT INTO estudiante (documento, "
                    + "apellido, nombre, telefono) "
                    + "VALUE('" + estudianteTO.getDocumento() + "',"
                    + "'" + estudianteTO.getApellido() + "',"
                    + "'" + estudianteTO.getNombre() + "',"
                    + "'" + estudianteTO.getTelefono() + "')";

            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            st.close();
            System.out.println(IConstante.GUARDAR_OK);
            conn.close();

            return estudianteTO;

        } catch (SQLException ex) {
            System.out.println(IConstante.GUARDAR_ERROR + " " + estudianteTO.getDocumento());
            throw ex;
        }
    }

    public void modificar(EstudianteTO estudianteTO) throws Exception {
        try {
            conn = conexion.getConnection();
            String sql = "UPDATE estudiante SET documento = ?, "
                    + "apellido = ?, nombre = ?, telefono = ? WHERE idEstudiante = ?";
            try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setString(1, estudianteTO.getDocumento());
                preparedStatement.setString(2, estudianteTO.getApellido());
                preparedStatement.setString(3, estudianteTO.getNombre());
                preparedStatement.setString(4, estudianteTO.getTelefono());
                preparedStatement.setInt(5, estudianteTO.getIdEstudiante());
                preparedStatement.executeUpdate();
                preparedStatement.close();
            }
            System.out.println(IConstante.MODIFICAR_OK);
            conn.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(IConstante.MODIFICAR_ERROR + " " + estudianteTO.getDocumento());
            throw ex;
        }
    }

    public void eliminar(EstudianteTO estudianteTO) throws Exception {
        conn = conexion.getConnection();
        String sql = "DELETE FROM estudiante "
                + " WHERE idEstudiante = ?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setInt(1, estudianteTO.getIdEstudiante());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(IConstante.MODIFICAR_OK);
            conn.close();
        } catch (SQLException ex) {
            System.out.println(IConstante.MODIFICAR_ERROR + " " + estudianteTO.getIdEstudiante());
            throw ex;
        }
    }

    public EstudianteTO consultar(String document) throws Exception {
        try {
            conn = conexion.getConnection();
            EstudianteTO estudianteTO = new EstudianteTO();
            String sql = "SELECT * FROM estudiante WHERE documento = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, document);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    estudianteTO.setIdEstudiante(rs.getInt("idEstudiante"));
                    estudianteTO.setDocumento(rs.getString("documento"));
                    estudianteTO.setNombre(rs.getString("nombre"));
                    estudianteTO.setApellido(rs.getString("apellido"));
                    estudianteTO.setTelefono(rs.getString("telefono"));
                }
                ps.close();
            }
            conn.close();
            return estudianteTO;
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }
}
