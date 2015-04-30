
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import recursos.IConstante;

/**
 *
 * @author Jhonatan Rodriguez Tatan
 */
public class SelMateriasDAO {
    
    private final Conexion conexion = new Conexion();
    private Connection conn;
    
    public SelMateriasDAO() {
    }
    
    public  List<SelMateriasTO>  listarMateria() throws Exception {
        // El método se creó de tipo Lista, para llenar una lista de selMateriaTO 
        // y esa lista se devuelve llena con los datos. 
        try {
            conn = conexion.getConnection();
            List<SelMateriasTO> listaMaterias = new ArrayList<>(); // se inicializa la lista
            String sql = "SELECT * FROM materiatabla";
            try (PreparedStatement preparedStmt = conn.prepareStatement(sql)) {
                ResultSet rs = preparedStmt.executeQuery();
                while (rs.next()) {
                    SelMateriasTO selMateriaTO = new SelMateriasTO();
                    selMateriaTO.setCodigo(rs.getString("codigo"));
                    selMateriaTO.setMateria(rs.getString("nombre"));
                    listaMaterias.add(selMateriaTO); //Se llena la lista con tantas materias como haya 
                    // en la base de datos.
                    
                }
                preparedStmt.close();
            }
            conn.close();
            return listaMaterias; // Se retorna la lista completa al gestor.
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(IConstante.CONSULTAR_ERROR);
            throw ex;
        }
    }
    
     public SelMateriasTO consultar_codigo(String nombreMateria) throws Exception {
        try {
            conn = conexion.getConnection();
            SelMateriasTO selMateriasTO = new SelMateriasTO();
            String sql = "SELECT * FROM materiatabla WHERE nombre = '" + nombreMateria + "'";
            ResultSet materias = conn.createStatement().executeQuery(sql);
            while (materias.next()) {
                selMateriasTO.setCodigo(materias.getString("codigo"));
            }
            return selMateriasTO;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(IConstante.CONSULTAR_ERROR + " " + nombreMateria);
            throw ex;
        }
    }
    
}
