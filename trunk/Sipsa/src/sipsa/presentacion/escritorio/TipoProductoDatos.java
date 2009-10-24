/*
 * Sistemas de Informacion II 2009
 * Proyecto Sipsa
 */

package sipsa.presentacion.escritorio;

import sipsa.presentacion.interfaces.ITipoProductoDatos;

/**
 * Formulario de datos de Tipo de Producto
 * @author Claudio Rodrigo Pereyra Diaz
 * @author Maria Eugenia Sanchez
 */
public class TipoProductoDatos extends javax.swing.JDialog {

    private ITipoProductoDatos controlador;

    /** Creates new form TipoProductoDatos
     * @param controlador Controlador del formulario
     */
    public TipoProductoDatos(ITipoProductoDatos controlador) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controlador = controlador;
        this.setTitle(this.controlador.getDescripcion());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombreProducto = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jLabelDuracionGarantia = new javax.swing.JLabel();
        jTextFieldNombreProducto = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldDuracionGarantia = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelMeses = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setModal(true);
        setResizable(false);

        jLabelNombreProducto.setText("Nombre del producto:");

        jLabelModelo.setText("Modelo:");

        jLabelDuracionGarantia.setText("Duración de la garantía:");

        jButtonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/tango-project/tango-icon-theme/16x16/actions/document-save.png"))); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/tango-project/tango-icon-theme/16x16/actions/process-stop.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelMeses.setText("Meses");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelModelo)
                            .addComponent(jLabelNombreProducto)
                            .addComponent(jLabelDuracionGarantia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldModelo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombreProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTextFieldDuracionGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMeses))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDuracionGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDuracionGarantia)
                    .addComponent(jLabelMeses))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        String modelo = this.jTextFieldModelo.getText();
        String nombre = this.jTextFieldNombreProducto.getText();
        int duracionGarantia = Integer.parseInt(this.jTextFieldDuracionGarantia.getText());
        if (this.controlador.aceptarDatosTipoProducto(modelo, nombre, duracionGarantia)){
            this.setVisible(false);
        } else {
            //TODO informar error en los datos
        }

    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelDuracionGarantia;
    private javax.swing.JLabel jLabelMeses;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelNombreProducto;
    private javax.swing.JTextField jTextFieldDuracionGarantia;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldNombreProducto;
    // End of variables declaration//GEN-END:variables

}
