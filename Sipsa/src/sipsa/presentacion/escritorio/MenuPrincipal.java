/*
 * Sistemas de Informacion II 2009
 * Proyecto Sipsa
 */

/*
 * MenuPrincipal.java
 *
 * Created on 13/06/2009, 17:14:43
 */

package sipsa.presentacion.escritorio;

import java.awt.Image;
import java.awt.Toolkit;
import sipsa.presentacion.interfaces.IMenuPrincipal;

/**
 * Formulario del Menu Principal
 * @author Claudio Rodrigo Pereyra Diaz
 * @author Maria Eugenia Sanchez
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private IMenuPrincipal controlador;

    /** Creates new form MenuPrincipal
     * @param controlador Controlador del formulario
     */
    public MenuPrincipal(IMenuPrincipal controlador) {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/sipsa/gui/recursos/Sipsa.png"));
        this.setIconImage(img);
        this.setLocationRelativeTo(null);
        this.controlador = controlador;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonImportarProductosVenta = new javax.swing.JButton();
        jButtonABPAC = new javax.swing.JButton();
        jButtonABTiposProductos = new javax.swing.JButton();
        jButtonABPV = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sipsa");
        setIconImages(getIconImages());
        setLocationByPlatform(true);
        setResizable(false);

        jButtonImportarProductosVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/tango-project/tango-icon-theme/16x16/actions/document-open.png"))); // NOI18N
        jButtonImportarProductosVenta.setText("Importar Productos a la Venta");
        jButtonImportarProductosVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImportarProductosVentaActionPerformed(evt);
            }
        });

        jButtonABPAC.setText("Administrar Puntos de Atencion al Cliente");
        jButtonABPAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonABPACActionPerformed(evt);
            }
        });

        jButtonABTiposProductos.setText("Administrar Tipos de Productos");
        jButtonABTiposProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonABTiposProductosActionPerformed(evt);
            }
        });

        jButtonABPV.setText("Administrar Puntos de Venta");
        jButtonABPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonABPVActionPerformed(evt);
            }
        });

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/tango-project/tango-icon-theme/16x16/actions/system-log-out.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonABTiposProductos, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(jButtonABPV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(jButtonABPAC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonImportarProductosVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonABTiposProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonABPV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonABPAC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonImportarProductosVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonABTiposProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonABTiposProductosActionPerformed
        this.controlador.AdministrarTipoProducto();
}//GEN-LAST:event_jButtonABTiposProductosActionPerformed

    private void jButtonImportarProductosVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImportarProductosVentaActionPerformed
        this.controlador.ImportarArchivoProductos();
    }//GEN-LAST:event_jButtonImportarProductosVentaActionPerformed

    private void jButtonABPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonABPVActionPerformed
        this.controlador.AdministrarPv();
    }//GEN-LAST:event_jButtonABPVActionPerformed

    private void jButtonABPACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonABPACActionPerformed
        this.controlador.AdministrarPac();
    }//GEN-LAST:event_jButtonABPACActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonABPAC;
    private javax.swing.JButton jButtonABPV;
    private javax.swing.JButton jButtonABTiposProductos;
    private javax.swing.JButton jButtonImportarProductosVenta;
    private javax.swing.JButton jButtonSalir;
    // End of variables declaration//GEN-END:variables

}
