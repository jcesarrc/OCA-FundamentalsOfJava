
package negocios;

import javax.swing.JOptionPane;
import persistencia.SamplePrgDAO;
import persistencia.SamplePrgTO;
import persistencia.MateriaDAO;
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
public class GestorTransaccion {

    SamplePrgDAO samplePrgDAO = new SamplePrgDAO();
    MateriaDAO materiaDAO = new MateriaDAO();

    public GestorTransaccion() {
    }

    public SamplePrgTO grabar(SamplePrgTO samplePrgTO) throws Exception {
        try {
            SamplePrgTO datoCedula = samplePrgDAO.consultar(samplePrgTO.getDocument());
            SamplePrgTO datoTelefono = samplePrgDAO.consultarTelefono(samplePrgTO.getPhone());

            if (datoCedula.getDocument() == null) {
                if (datoTelefono.getPhone() == null) {
                    samplePrgDAO.guardar(samplePrgTO);
                    JOptionPane.showMessageDialog(null, IConstante.GUARDAR_OK);
                } else {
                 throw new Exception(IConstante.TEL_DUPLICADO);   
                }
            } else {
                throw new Exception(IConstante.DOC_DUPLICADO);
                
            }
            return samplePrgTO;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public SamplePrgTO consultar(String document) throws Exception {
        try {
            if (samplePrgDAO.consultar(document).getDocument() == null) {
                JOptionPane.showMessageDialog(null, IConstante.REGISTRO_NO_ENCONTRADO);
            }
        } catch (Exception ex) {
            throw ex;
        }
        return samplePrgDAO.consultar(document);
    }

    public void modificar(SamplePrgTO samplePrgTO) throws Exception {
        try {
            int confirmar = JOptionPane.showConfirmDialog(null, IConstante.CONFIRMAR_MODIFICAR, "Modificación", JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                samplePrgDAO.modificar(samplePrgTO);
                JOptionPane.showMessageDialog(null, IConstante.MODIFICAR_OK);
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void eliminar(SamplePrgTO samplePrgTO) throws Exception {
        try {
            int confirmar = JOptionPane.showConfirmDialog(null, IConstante.CONFIRMAR_ELIMINAR, "Eliminación", JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                samplePrgDAO.eliminar(samplePrgTO);
                JOptionPane.showMessageDialog(null, IConstante.ELIMINAR_OK);
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

}
