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
public class MateriaDAO {
    
    private final Conexion conexion = new Conexion();
    private Connection conn;
    
        
    public MateriaTO consultar(int idMateria) throws Exception {
        try {
            conn = conexion.getConnection();
            MateriaTO materiaTO = new MateriaTO();
            String sql = "SELECT * FROM materia WHERE idmateria = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, idMateria);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    materiaTO.setIdMateria(rs.getInt("idmateria"));
                    materiaTO.setNombre(rs.getString("nombre"));
                }
                ps.close();
            }
            conn.close();
            return materiaTO;
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }
    
    public MateriaTO[] consultarTodo() throws Exception{
        
        try {
            conn = conexion.getConnection();
            MateriaTO materiaTO[];
            String sql = "SELECT * FROM materia";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                rs.last();
                int totalRows = rs.getRow();
                rs.beforeFirst();
                materiaTO = new MateriaTO[totalRows+1];
                int row = 0;
                while (rs.next()) {
                    materiaTO[row++] = consultar(rs.getInt("idmateria"));
                }
                ps.close();
            }
            conn.close();
            return materiaTO;
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
        
    }
    
    
}
