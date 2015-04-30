/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

/**
 *
 * @author administrador
 */
public interface IConstante {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/SistNotas";
    public static final String USUARIO = "root";
    public static final String PASSWORD = "abc.123";
    public static final String ERROR_CONEXION = "Error al obtener la conexion";
    
    public static final String GUARDAR_OK = "Registro guardado con éxito";
    public static final String GUARDAR_ERROR = "Error al guardar el registro";
    public static final String MODIFICAR_OK = "Registro modificado con éxito";
    public static final String MODIFICAR_ERROR = "Error al modificar el registro";
    public static final String ELMINAR_OK = "Registro eliminado con éxito";
    public static final String ELIMINAR_ERROR = "Error al eliminar el registro";
    public static final String CONSULTAR_ERROR = "Error al consultar";
    
}
