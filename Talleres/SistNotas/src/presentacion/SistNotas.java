/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;



/**
 *
 * @author administrador
 */
public class SistNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pantalla pantalla  = new Pantalla();
        pantalla.setVisible(true);
        // TODO code application logic here
        /*
        EstudianteTO estudianteTO = new EstudianteTO();
        estudianteTO.setNombre("Aaron");
        estudianteTO.setApellido("Paul");
        estudianteTO.setDocumento("102030");
        estudianteTO.setTelefono("5185556");
        
        
        try{
            EstudianteDAO estudianteDAO = new EstudianteDAO();
            //estudianteDAO.guardar(estudianteTO);
            
            estudianteTO.setNombre("Byron");
            estudianteTO.setApellido("Katie");
            estudianteTO.setIdEstudiante(5);
            
            //estudianteDAO.modificar(estudianteTO);
            
            estudianteDAO.consultar(estudianteTO.getDocumento()).imprimir();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        */
    }
}
