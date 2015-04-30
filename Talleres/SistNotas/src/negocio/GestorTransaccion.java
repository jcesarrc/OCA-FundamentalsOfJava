/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import persistencia.EstudianteDAO;
import persistencia.EstudianteMateriaDAO;
import persistencia.EstudianteMateriaTO;
import persistencia.EstudianteTO;
import persistencia.MateriaDAO;
import persistencia.MateriaTO;

/**
 *
 * @author administrador
 */
public class GestorTransaccion {

    EstudianteDAO estudianteDAO = new EstudianteDAO();
    MateriaDAO materiaDAO = new MateriaDAO();
    EstudianteMateriaDAO estudianteMateriaDAO = new EstudianteMateriaDAO();

    public GestorTransaccion() {
    }

    /**
     *
     * @param estudianteTO
     * @return estudianteTO
     * @throws Exception
     */
    public EstudianteTO grabarEstudiante(EstudianteTO estudianteTO) throws Exception {

        try {
            return estudianteDAO.guardar(estudianteTO);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void modificarEstudiante(EstudianteTO estudianteTO) throws Exception {

        try {
            estudianteDAO.modificar(estudianteTO);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void eliminarEstudiante(EstudianteTO estudianteTO) throws Exception {

        try {
            estudianteDAO.eliminar(estudianteTO);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public EstudianteTO consultarEstudiante(String document) throws Exception {

        try {
            return estudianteDAO.consultar(document);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
    
    public EstudianteMateriaTO grabarEstudianteMateria(EstudianteMateriaTO estudianteMateriaTO) throws Exception{
        
        try {
            return estudianteMateriaDAO.guardar(estudianteMateriaTO);
        } catch (Exception ex) {
            throw ex;
        }
        
    }
    
    public EstudianteMateriaTO modificarEstudianteMateria(EstudianteMateriaTO estudianteMateriaTO) throws Exception{
        
        try {
            return estudianteMateriaDAO.modificar(estudianteMateriaTO);
        } catch (Exception ex) {
            throw ex;
        }
        
        
    }
    
    public EstudianteMateriaTO consultarEstudianteMateria(String documento, int idMateria) throws Exception{
        
        try {
            return estudianteMateriaDAO.consultar(documento, idMateria);
        } catch (Exception ex) {
            throw ex;
        }
        
    }
    
    public void eliminarEstudianteMateria(EstudianteMateriaTO estudianteMateriaTO) throws Exception{
        
        try {
            estudianteMateriaDAO.borrar(estudianteMateriaTO);
        } catch (Exception ex) {
            throw ex;
        }
        
    }
    
    public String[][] consultarMateriasDelEstudiante(String document) throws Exception{
        
        try {
            return estudianteMateriaDAO.consultarMateriasDelEstudiante(document);
        } catch (Exception ex) {
            throw ex;
        }
        
    }
    
    
    public MateriaTO[] consultarMaterias() throws Exception{
        
        try {
            return materiaDAO.consultarTodo();
        } catch (Exception ex) {
            throw ex;
        }
        
    }
    
    
}
