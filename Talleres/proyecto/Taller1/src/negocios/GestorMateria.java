
package negocios;

import java.util.List;
import javax.swing.JOptionPane;
import persistencia.MateriaDAO;
import persistencia.MateriaTO;
import persistencia.SamplePrgDAO;
import persistencia.SelMateriasDAO;
import persistencia.SelMateriasTO;
import recursos.IConstante;

/**
 *
 * @author Jhonatan Rodriguez Tatan
 */
public class GestorMateria {

    SamplePrgDAO samplePrgDAO = new SamplePrgDAO();
    MateriaDAO materiaDAO = new MateriaDAO();
    SelMateriasDAO selMateriaDAO = new SelMateriasDAO();

    public GestorMateria() {
    }

    public List<Object[]> cargarTabla(String idEstudiante) throws Exception {
        try {
            return materiaDAO.cargarTabla(idEstudiante);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public MateriaTO grabarMateria(MateriaTO materiaTO) throws Exception {
        try {
            MateriaTO datoCedula = materiaDAO.consultaMateriaCodigo(materiaTO.getCodigo(), materiaTO.getIdEtudiante());
            if (datoCedula.getCodigo()==null) {
                materiaDAO.guardaMateria(materiaTO);
            } else {
                 throw new Exception (IConstante.MATERIA_EXISTE);
            }
            //    return materiaDAO.guardaMateria(materiaTO);
            return materiaTO;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void eliminarMateria(String samplePrtTO, String codigo) throws Exception {
        try {
            int confirmar = JOptionPane.showConfirmDialog(null, IConstante.CONFIRMAR_ELIMINAR, "Eliminación", JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                materiaDAO.eliminarMateria(samplePrtTO, codigo);
                JOptionPane.showMessageDialog(null, IConstante.ELIMINAR_OK);
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public MateriaTO consultaMateria(String idEstudiante) throws Exception {

        try {
            MateriaTO resultado = new MateriaTO();
            if (materiaDAO.consultaMateria(idEstudiante).getIdEtudiante() == null) {
                JOptionPane.showMessageDialog(null, IConstante.SIN_MATERIAS);
            }
        } catch (Exception ex) {
            throw ex;
        }
        return materiaDAO.consultaMateria(idEstudiante);
    }

    public SelMateriasTO consultaCodMateria(String codigoMateria) throws Exception {

        try {
            MateriaTO resultado = new MateriaTO();
            if (selMateriaDAO.consultar_codigo(codigoMateria).getCodigo() == null) {
                JOptionPane.showMessageDialog(null, IConstante.SIN_MATERIAS);
            }
        } catch (Exception ex) {
            throw ex;
        }
        //return materiaDAO.consultaMateria(codigoMateria);
        return selMateriaDAO.consultar_codigo(codigoMateria);
    }

    public void modificarMateria(MateriaTO materiaTO) throws Exception {
        try {
            int confirmar = JOptionPane.showConfirmDialog(null, IConstante.CONFIRMAR_MODIFICAR, "Modificación", JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                materiaDAO.modificarMateria(materiaTO);
                JOptionPane.showMessageDialog(null, IConstante.MODIFICAR_OK);
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public List<SelMateriasTO> listaMateriaCombo() throws Exception {
        try {
            return selMateriaDAO.listarMateria();

        } catch (Exception ex) {
            throw ex; // Manejo de excepciones.
        }
    }

    //listar materias combo
}
