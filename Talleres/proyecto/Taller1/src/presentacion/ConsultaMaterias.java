package presentacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import negocios.GestorMateria;
import persistencia.SamplePrgTO;
import recursos.IConstante;

/**
 *
 * @author Jhonatan Rodriguez Tatan
 */
public class ConsultaMaterias extends javax.swing.JFrame {

    public ConsultaMaterias(SamplePrgTO samplePrgTO) {
        gestorMateria = new GestorMateria();
        this.samplePrgTO = samplePrgTO;
        lista = new ArrayList<>();
        initComponents();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnOK = new javax.swing.JButton();
        jlDocumento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(model());
        jScrollPane1.setViewportView(jTable1);

        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/Accept-icon.png"))); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOK))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(jlDocumento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        this.setVisible(false);
        Materia materia = new Materia();
        materia.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnOKActionPerformed

    /**
     * @param args the command line arguments
     */
    javax.swing.table.DefaultTableModel model() {
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Curso");
        modelo.addColumn("Promedio");
        try {
            lista = gestorMateria.cargarTabla(samplePrgTO.getDocument());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, IConstante.CONSULTAR_ERROR + ex);
            System.out.println(ex);
        }
        Iterator<Object[]> iterador = lista.iterator();
        while (iterador.hasNext()) {
            Object[] f = iterador.next();
            modelo.addRow(f);
        }
        return modelo;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JLabel jlDocumento;
    // End of variables declaration//GEN-END:variables
javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
    List<Object[]> lista;
    private final GestorMateria gestorMateria;
    private final SamplePrgTO samplePrgTO;
}
