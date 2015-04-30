package persistencia;

import java.sql.*;
import recursos.IConstante;

/**
 *
 * @author PERIFERIA-IT
 */
public class Conexion {

    Connection getConnection() throws SQLException, ClassNotFoundException {

        try {
            Class.forName(IConstante.DRIVER);
            Connection cn = DriverManager.getConnection(IConstante.URL, IConstante.USUARIO, IConstante.PASSWORD);
            return cn;
        } catch (SQLException ex) {
            System.out.println(IConstante.ERROR_CONEXION);
            throw ex;
        }
    }
}
