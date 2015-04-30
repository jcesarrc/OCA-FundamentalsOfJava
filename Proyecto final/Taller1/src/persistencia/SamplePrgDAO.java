/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * <p>
 * E-Mail: denovatoaprofesionaljava@gmail.com</p>
 *
 * @author Javier Capera
 * @version 1.0
 *
 */
public class SamplePrgDAO {

    private final Conexion conexion = new Conexion();
    private Connection conn;

    public SamplePrgDAO() {
    }

    public SamplePrgTO guardar(SamplePrgTO samplePrgTO) throws Exception {
        try {
            conn = conexion.getConnection();
            String sql = "INSERT INTO employees (document,lastname,firstname,phone) values ('"
                    + samplePrgTO.getDocument() + "','" + samplePrgTO.getLastName()
                    + "','" + samplePrgTO.getFirsName() + "','" + samplePrgTO.getPhone() + "')";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            st.close();
            System.out.println(IConstante.GUARDAR_OK);
            
            conn.close();
            return consultar(samplePrgTO.getDocument());
        } catch (SQLException ex) {
            System.out.println(IConstante.GUARDAR_ERROR + " " + samplePrgTO.getDocument());
            throw ex;
        }
    }

    public void modificar(SamplePrgTO samplePrgTO) throws Exception {
        try {
            conn = conexion.getConnection();

            String sql = "UPDATE employees SET LASTNAME = ?, FIRSTNAME = ?, PHONE = ? where ID = ?";

            try (PreparedStatement preparedStmt = conn.prepareStatement(sql)) {
                preparedStmt.setString(1, samplePrgTO.getLastName());
                preparedStmt.setString(2, samplePrgTO.getFirsName());
                preparedStmt.setString(3, samplePrgTO.getPhone());
                preparedStmt.setInt(4, samplePrgTO.getId());
                preparedStmt.executeUpdate();
                preparedStmt.close();
            }
            System.out.println(IConstante.MODIFICAR_OK);

            conn.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(IConstante.MODIFICAR_ERROR + " " + samplePrgTO.getDocument());
            throw ex;
        }
    }

    public void eliminar(SamplePrgTO samplePrgTO) throws Exception {
        try {
            conn = conexion.getConnection();
            String sql = "DELETE FROM Employees WHERE document = ?";
            
            String sql1="Delete from materia "
                    + "where id_estudiante= ?";
            try (PreparedStatement preparedStmt = conn.prepareStatement(sql)) {
                preparedStmt.setString(1, samplePrgTO.getDocument());
                preparedStmt.executeUpdate();
                preparedStmt.close();
            }
            try (PreparedStatement preparedStmt = conn.prepareStatement(sql1)) {
                preparedStmt.setString(1, samplePrgTO.getDocument());
                preparedStmt.executeUpdate();
                preparedStmt.close();
            }
            
            System.out.println(IConstante.ELIMINAR_OK);
            conn.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(IConstante.ELIMINAR_ERROR + " " + samplePrgTO.getDocument());
            throw ex;
        }
    }

    public SamplePrgTO consultar(String document) throws Exception {
        try {
            conn = conexion.getConnection();
            SamplePrgTO samplePrgTO = new SamplePrgTO();
            String sql = "SELECT * FROM Employees WHERE DOCUMENT = ?";
            try (PreparedStatement preparedStmt = conn.prepareStatement(sql)) {
                preparedStmt.setString(1, document);
                ResultSet rs = preparedStmt.executeQuery();

                while (rs.next()) {
                    samplePrgTO.setId(rs.getInt("ID"));
                    samplePrgTO.setDocument(rs.getString("DOCUMENT"));
                    samplePrgTO.setLastName(rs.getString("LASTNAME"));
                    samplePrgTO.setFirsName(rs.getString("FIRSTNAME"));
                    samplePrgTO.setPhone(rs.getString("PHONE"));
                }
                preparedStmt.close();

            }
            conn.close();
            return samplePrgTO;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(IConstante.CONSULTAR_ERROR + " " + document);
            throw ex;
        }
    }

    public SamplePrgTO consultarTelefono(String document) throws Exception {
        try {
            conn = conexion.getConnection();
            SamplePrgTO samplePrgTO = new SamplePrgTO();
            String sql = "SELECT * FROM Employees WHERE PHONE = ?";
            try (PreparedStatement preparedStmt = conn.prepareStatement(sql)) {
                preparedStmt.setString(1, document);
                ResultSet rs = preparedStmt.executeQuery();

                while (rs.next()) {
                    samplePrgTO.setId(rs.getInt("ID"));
                    samplePrgTO.setDocument(rs.getString("DOCUMENT"));
                    samplePrgTO.setLastName(rs.getString("LASTNAME"));
                    samplePrgTO.setFirsName(rs.getString("FIRSTNAME"));
                    samplePrgTO.setPhone(rs.getString("PHONE"));
                }
                preparedStmt.close();

            }
            conn.close();
            return samplePrgTO;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(IConstante.TEL_DUPLICADO + " " + document);
            throw ex;
        }
    }
}
