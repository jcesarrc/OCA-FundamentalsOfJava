/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.FileNotFoundException;
import recursos.IConstante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author administrador
 */
public class Conexion {

    Connection getConnection() throws SQLException, ClassNotFoundException {

       
            Class.forName(IConstante.DRIVER);
            Connection cn = DriverManager.getConnection(IConstante.URL,
                    IConstante.USUARIO, IConstante.PASSWORD);
            return cn;
        
    }
}
