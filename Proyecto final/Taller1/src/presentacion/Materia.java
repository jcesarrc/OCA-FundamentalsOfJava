package presentacion;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocios.GestorMateria;
import persistencia.MateriaTO;
import negocios.GestorTransaccion;
import persistencia.SamplePrgTO;
import persistencia.SelMateriasTO;

/**
 *
 * @author Jhonatan Rodriguez Tatan
 */
public class Materia extends javax.swing.JFrame {

    /**
     * Creates new form Materia
     */
    public Materia() {
        materiaTO = new MateriaTO();
        gestorTransaccion = new GestorTransaccion();
        gestorMateria = new GestorMateria();
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        labelMateria = new javax.swing.JLabel();
        labelDocumento = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        txtNota = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnNuevaMateria = new javax.swing.JButton();
        btnConsultaMateria = new javax.swing.JButton();
        btnEliminaMateria = new javax.swing.JButton();
        btnListaMaterias = new javax.swing.JButton();
        btnModificarMateria = new javax.swing.JButton();
        txtNota2 = new javax.swing.JTextField();
        txtNota3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPromedio = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(llenarCombo());
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Materia");

        jLabel2.setText("Curso");

        jLabel3.setText("Notas");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/Floppy-Small-icon.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/Close-icon.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        labelMateria.setText("Matematicas");

        labelDocumento.setText("Documento");

        jLabel6.setText("Codigo");

        txtCodigo.setEnabled(false);

        jLabel7.setText("Cod Estudiante");

        btnNuevaMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/Files-New-File-icon.png"))); // NOI18N
        btnNuevaMateria.setText("Nuevo");
        btnNuevaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMateriaActionPerformed(evt);
            }
        });

        btnConsultaMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/search-icon.png"))); // NOI18N
        btnConsultaMateria.setText("Consultar");
        btnConsultaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaMateriaActionPerformed(evt);
            }
        });

        btnEliminaMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/trash-icon.png"))); // NOI18N
        btnEliminaMateria.setText("Eliminar");
        btnEliminaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaMateriaActionPerformed(evt);
            }
        });

        btnListaMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/checklist-icon.png"))); // NOI18N
        btnListaMaterias.setText("Listar Materias");
        btnListaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaMateriasActionPerformed(evt);
            }
        });

        btnModificarMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/Actions-view-refresh-icon.png"))); // NOI18N
        btnModificarMateria.setText("Modificar");
        btnModificarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMateriaActionPerformed(evt);
            }
        });

        jLabel4.setText("Promedio");

        txtPromedio.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCurso)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelMateria)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(60, 60, 60)
                                            .addComponent(labelDocumento)))
                                    .addComponent(txtNota3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(101, 101, 101))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPromedio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(94, 94, 94)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevaMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultaMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminaMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListaMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(btnModificarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(labelMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelDocumento)
                    .addComponent(btnNuevaMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnConsultaMateria))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnEliminaMateria))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificarMateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListaMaterias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        labelMateria.setText(jComboBox1.getSelectedItem().toString());
        try {

            selMateriasTO = gestorMateria.consultaCodMateria(jComboBox1.getSelectedItem().toString());
            txtCodigo.setText(selMateriasTO.getCodigo());
        } catch (Exception ex) {
            Logger.getLogger(Materia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {

            if (txtCodigo.getText() != null && txtCurso.getText() != null && txtNota.getText() != null
                    && labelDocumento.getText() != null && labelMateria.getText() != null) {
                materiaTO.setCodigo(txtCodigo.getText());
                materiaTO.setNombre(jComboBox1.getSelectedItem().toString());
                materiaTO.setCurso(txtCurso.getText());
                materiaTO.setIdEstudiante(labelDocumento.getText());
                materiaTO.setNota(txtNota.getText());
                materiaTO.setNota2(txtNota2.getText());
                materiaTO.setNota3(txtNota3.getText());
                materiaTO = gestorMateria.grabarMateria(materiaTO);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMateriaActionPerformed
        txtCodigo.setText("");
        txtCurso.setText("");
        txtNota.setText("");
        txtNota2.setText("");
        txtNota3.setText("");
    }//GEN-LAST:event_btnNuevaMateriaActionPerformed

    private void btnListaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaMateriasActionPerformed
        try {
            samplePrgTO = gestorTransaccion.consultar(labelDocumento.getText());
            ConsultaMaterias consultaMateria = new ConsultaMaterias(samplePrgTO);
            consultaMateria.setVisible(true);
            consultaMateria.setLocationRelativeTo(null);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnListaMateriasActionPerformed

    private void btnConsultaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaMateriaActionPerformed
        try {
            if (labelDocumento.getText() != null && !labelDocumento.getText().isEmpty()) {
                materiaTO = gestorMateria.consultaMateria(labelDocumento.getText());//codigo de mayteria
                //labelDocumento.setText(materiaTO.getId_estudiante());
                jComboBox1.setSelectedItem(materiaTO.getNombre());
                txtCodigo.setText(materiaTO.getCodigo());
                txtCurso.setText(materiaTO.getCurso());
                txtNota.setText(materiaTO.getNota());
                txtNota2.setText(materiaTO.getNota2());
                txtNota3.setText(materiaTO.getNota3());
                txtPromedio.setText(materiaTO.getPromedio());

            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnConsultaMateriaActionPerformed

    private void btnEliminaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaMateriaActionPerformed

        try {
            if (txtCodigo.getText() != null || txtCurso.getText() != null || txtNota.getText() != null
                    || labelDocumento.getText() != null) {
                //if (materiaTO.getId() > 0) {
                System.out.println(materiaTO.getCodigo());
                gestorMateria.eliminarMateria(labelDocumento.getText(), txtCodigo.getText());
                materiaTO = new MateriaTO();
                txtCodigo.setText(null);
                txtCurso.setText(null);
                txtNota.setText(null);
                labelMateria.setText(null);
                txtNota2.setText(null);
                txtNota3.setText(null);
                // }
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnEliminaMateriaActionPerformed

    private void btnModificarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMateriaActionPerformed
        try {
            if (txtCodigo.getText() != null && txtCurso.getText() != null && txtNota.getText() != null && labelMateria.getText() != null) {
                //if (materiaTO.getId() > 0) {
                materiaTO.setCodigo(txtCodigo.getText());
                materiaTO.setNombre(labelMateria.getText());
                materiaTO.setCurso(txtCurso.getText());
                materiaTO.setNota(txtNota.getText());
                materiaTO.setNota2(txtNota2.getText());
                materiaTO.setNota3(txtNota3.getText());
                gestorMateria.modificarMateria(materiaTO);
                //}
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnModificarMateriaActionPerformed

    javax.swing.DefaultComboBoxModel llenarCombo() { 
        try {
            comboModel = new javax.swing.DefaultComboBoxModel(); 
            listaMaterias = gestorMateria.listaMateriaCombo();//variable de tipo lista de SelMateriasTO
            
            for (int i = 0; i < listaMaterias.size(); i++) {
                comboModel.addElement(listaMaterias.get(i).getMateria());// llena el jComboBox
                
            }
        } catch (Exception ex) {
            
        }
        return comboModel; 

    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultaMateria;
    private javax.swing.JButton btnEliminaMateria;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListaMaterias;
    private javax.swing.JButton btnModificarMateria;
    private javax.swing.JButton btnNuevaMateria;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel labelDocumento;
    private javax.swing.JLabel labelMateria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
    private MateriaTO materiaTO;
    private final GestorTransaccion gestorTransaccion;
    private final GestorMateria gestorMateria;
    private SamplePrgTO samplePrgTO;
    private SelMateriasTO selMateriasTO;
    private javax.swing.DefaultComboBoxModel comboModel;
    private List<SelMateriasTO> listaMaterias;
    //String seleccion=jComboBox1.getSelectedItem().toString();
}
