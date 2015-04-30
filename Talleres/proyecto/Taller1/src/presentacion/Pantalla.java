
package presentacion;

import javax.swing.JOptionPane;
import persistencia.SamplePrgTO;
import negocios.GestorTransaccion;
import persistencia.MateriaTO;
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
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
        samplePrgTO = new SamplePrgTO();
        materiaTO = new MateriaTO();
        gestorTransaccion = new GestorTransaccion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnMaterias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Programación 4");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Información"));

        jLabel1.setText("Documento");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Teléfono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 140, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/Floppy-Small-icon.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/search-icon.png"))); // NOI18N
        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/Actions-view-refresh-icon.png"))); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/trash-icon.png"))); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/Close-icon.png"))); // NOI18N
        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir(evt);
            }
        });

        btnMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/Alarm-Plus-icon.png"))); // NOI18N
        btnMaterias.setText("Insertar Materias");
        btnMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btnMaterias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar
        try {
            if (samplePrgTO != null && samplePrgTO.getId() == 0) {
                if (jTextField1.getText().equals("") || jTextField2.getText().equals("")
                        || jTextField3.getText().equals("") || jTextField4.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, IConstante.COMPLETA_CAMPOS);
                }
                if ((jTextField1.getText() != null && !jTextField1.getText().isEmpty())
                        && (jTextField2.getText() != null && !jTextField2.getText().isEmpty())
                        && (jTextField3.getText() != null && !jTextField3.getText().isEmpty())
                        && (jTextField4.getText() != null && !jTextField4.getText().isEmpty())) {
                    samplePrgTO.setDocument(jTextField1.getText());
                    samplePrgTO.setFirsName(jTextField2.getText());
                    samplePrgTO.setLastName(jTextField3.getText());
                    samplePrgTO.setPhone(jTextField4.getText());
                    samplePrgTO = gestorTransaccion.grabar(samplePrgTO);
                } 
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_guardar

    private void modificar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar
        try {
            if (!jTextField1.getText().isEmpty() && !jTextField2.getText().isEmpty() && !jTextField3.getText().isEmpty()
                    && !jTextField4.getText().isEmpty()) {

                if (jTextField1.getText() != null && jTextField2.getText() != null && jTextField3.getText() != null
                        && jTextField4.getText() != null) {
                    if (samplePrgTO.getId() > 0) {
                        samplePrgTO.setDocument(jTextField1.getText());
                        samplePrgTO.setLastName(jTextField3.getText());
                        samplePrgTO.setFirsName(jTextField2.getText());
                        samplePrgTO.setPhone(jTextField4.getText());
                        gestorTransaccion.modificar(samplePrgTO);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, IConstante.SIN_DOCUMENTO);
            }

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_modificar

    private void eliminar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar
        try {
            if (!jTextField1.getText().isEmpty() && !jTextField2.getText().isEmpty() && !jTextField3.getText().isEmpty()
                    && !jTextField4.getText().isEmpty()) {
                if (jTextField1.getText() != null && jTextField2.getText() != null && jTextField3.getText() != null && jTextField4.getText() != null) {
                    if (samplePrgTO.getId() > 0) {
                        gestorTransaccion.eliminar(samplePrgTO);
                        samplePrgTO = new SamplePrgTO();
                        jTextField1.setText(null);
                        jTextField2.setText(null);
                        jTextField3.setText(null);
                        jTextField4.setText(null);
                    }
                }
            }else {
                JOptionPane.showMessageDialog(null, IConstante.SIN_DOCUMENTO);
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_eliminar

    private void consultar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar
        try {

            if (jTextField1.getText() != null && !jTextField1.getText().isEmpty()) {
                samplePrgTO = gestorTransaccion.consultar(jTextField1.getText());
                jTextField1.setText(samplePrgTO.getDocument());
                jTextField2.setText(samplePrgTO.getFirsName());
                jTextField3.setText(samplePrgTO.getLastName());
                jTextField4.setText(samplePrgTO.getPhone());
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_consultar

    private void salir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir
        System.exit(0);
    }//GEN-LAST:event_salir

    private void btnMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriasActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, IConstante.SIN_DOCUMENTO);
        } else {
            Materia materia = new Materia();
            materia.setVisible(true);
            materia.setLocationRelativeTo(null);
            this.setVisible(false);
            Materia.labelDocumento.setText(jTextField1.getText());
        }
    }//GEN-LAST:event_btnMateriasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMaterias;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    private SamplePrgTO samplePrgTO;
    private final GestorTransaccion gestorTransaccion;
    private MateriaTO materiaTO;
}
