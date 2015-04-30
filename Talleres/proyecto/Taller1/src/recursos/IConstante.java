package recursos;

/**
 *
 * @author Javier
 */
public class IConstante {

    // Base de datos
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/sampleprg4";
    public static final String USUARIO = "root";
    public static final String PASSWORD = "abc.123";
    public static final String ERROR_CONEXION = "Error al conectarse a la base de datos";

    // Mensajes
    public static final String GUARDAR_OK = "Registro guardado con éxito";
    public static final String GUARDAR_ERROR = "Error al guardar el registro";
    public static final String MODIFICAR_OK = "Registro modificado con éxito";
    public static final String MODIFICAR_ERROR = "Error al modificar el registro";
    public static final String ELIMINAR_OK = "Registro eliminado con éxito";
    public static final String ELIMINAR_ERROR = "Error al eliminar el registro";
    public static final String CONSULTAR_ERROR = "Error al consultar";
    public static final String CONFIRMAR_ELIMINAR = "Eliminar registro?";
    public static final String REGISTRO_NO_ENCONTRADO = "Registro no existe en la Base de Datos";
    public static final String COMPLETA_CAMPOS = "Debe diligenciar todos los campos";
    public static final String CONFIRMAR_MODIFICAR = "Confirma la modificación";
    public static final String DOC_DUPLICADO = "Documento ya existe";
    public static final String TEL_DUPLICADO = "El Telefono ya existe";
    public static final String SIN_DOCUMENTO = "Debe consultar un documento";
    public static final String SIN_MATERIAS = "No tiene materias Inscritas";
    public static final String MATERIA_EXISTE = "Ya tiene inscrita la materia";
}
