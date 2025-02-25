/*
 * Sistemas de Informacion II 2009
 * Proyecto Sipsa
 */

package sipsa.presentacion.escritorio;

import sipsa.Configuracion;
import sipsa.presentacion.interfaces.ISipsaPacMenu;

/**
 * Formulario del Menu Principal
 * @author Claudio Rodrigo Pereyra Diaz
 * @author Maria Eugenia Sanchez
 */
public class SipsaPacMenu extends javax.swing.JFrame {

    private ISipsaPacMenu controlador;

    /** Creates new form SipsaPacMenu
     * @param controlador Controlador del formulario
     */
    public SipsaPacMenu(ISipsaPacMenu controlador) {
        initComponents();
        Configuracion configuracion = Configuracion.getInstancia();
        this.controlador = controlador;
        this.setIconImage(configuracion.getIcono());
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonABTiposProductos = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonReporteOTRealizadas = new javax.swing.JButton();
        jButtonReporteOTPendientes = new javax.swing.JButton();
        jButtonReporteOTVencidas = new javax.swing.JButton();
        jSeparatorBotones = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sipsa - Punto de Atención");
        setIconImages(getIconImages());
        setLocationByPlatform(true);
        setResizable(false);

        jButtonABTiposProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sipsa/presentacion/recursos/edit-paste.png"))); // NOI18N
        jButtonABTiposProductos.setText("Administrar Ordenes de Trabajo");
        jButtonABTiposProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonABTiposProductosActionPerformed(evt);
            }
        });

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sipsa/presentacion/recursos/system-log-out.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonReporteOTRealizadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sipsa/presentacion/recursos/folder.png"))); // NOI18N
        jButtonReporteOTRealizadas.setText("Reporte Ordenes de Trabajo Realizadas");
        jButtonReporteOTRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReporteOTRealizadasActionPerformed(evt);
            }
        });

        jButtonReporteOTPendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sipsa/presentacion/recursos/folder-open.png"))); // NOI18N
        jButtonReporteOTPendientes.setText("Reporte Ordenes de Trabajo Pendientes");
        jButtonReporteOTPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReporteOTPendientesActionPerformed(evt);
            }
        });

        jButtonReporteOTVencidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sipsa/presentacion/recursos/folder-drag-accept.png"))); // NOI18N
        jButtonReporteOTVencidas.setText("Reporte Ordenes de Trabajo Vencidas");
        jButtonReporteOTVencidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReporteOTVencidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonABTiposProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparatorBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonReporteOTRealizadas, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonReporteOTPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonReporteOTVencidas, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonABTiposProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonReporteOTRealizadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonReporteOTPendientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonReporteOTVencidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonABTiposProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonABTiposProductosActionPerformed
        this.controlador.administrarOT();
}//GEN-LAST:event_jButtonABTiposProductosActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonReporteOTRealizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReporteOTRealizadasActionPerformed
        this.controlador.mostrarReporteOTRealizadas();
}//GEN-LAST:event_jButtonReporteOTRealizadasActionPerformed

    private void jButtonReporteOTPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReporteOTPendientesActionPerformed
        this.controlador.mostrarReporteOTPendientes();
}//GEN-LAST:event_jButtonReporteOTPendientesActionPerformed

    private void jButtonReporteOTVencidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReporteOTVencidasActionPerformed
        this.controlador.mostrarReporteOTVencidas();
}//GEN-LAST:event_jButtonReporteOTVencidasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonABTiposProductos;
    private javax.swing.JButton jButtonReporteOTPendientes;
    private javax.swing.JButton jButtonReporteOTRealizadas;
    private javax.swing.JButton jButtonReporteOTVencidas;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JSeparator jSeparatorBotones;
    // End of variables declaration//GEN-END:variables

}