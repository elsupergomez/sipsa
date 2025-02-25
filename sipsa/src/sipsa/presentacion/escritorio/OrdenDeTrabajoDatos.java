package sipsa.presentacion.escritorio;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import sipsa.Configuracion;
import sipsa.SipsaExcepcion;
import sipsa.dominio.EstadoOT;
import sipsa.dominio.Modelo;
import sipsa.dominio.OrdenDeTrabajo;
import sipsa.dominio.Producto;
import sipsa.dominio.Pv;
import sipsa.dominio.Venta;
import sipsa.presentacion.interfaces.IOrdenDeTrabajoDatos;

/**
 * Formulario para crear, modificar u eliminar Ordenes de Trabajo
 * @author Claudio Rodrigo Pereyra Diaz
 * @author Maria Eugenia Sanchez
 */
public class OrdenDeTrabajoDatos extends javax.swing.JDialog {

    private IOrdenDeTrabajoDatos controlador;
    private OrdenDeTrabajo ordenDeTrabajo;

    /** Construye una interface Orden de Trabajo y la llena con los datos
     * @param controlador
     * @param ordenDeTrabajo
     */
    public OrdenDeTrabajoDatos(IOrdenDeTrabajoDatos controlador, OrdenDeTrabajo ordenDeTrabajo) {
        initComponents();
        Configuracion configuracion = Configuracion.getInstancia();
        this.controlador = controlador;
        this.ordenDeTrabajo = ordenDeTrabajo;
        this.setIconImage(configuracion.getIcono());
        this.setLocationRelativeTo(null);
        this.setTitle("Orden de Trabajo");
        this.poblarFormulario();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelFechaEntrega = new javax.swing.JLabel();
        jScrollPaneObservaciones = new javax.swing.JScrollPane();
        jTextAreaObservaciones = new javax.swing.JTextArea();
        jLabelEstaado = new javax.swing.JLabel();
        jPanelVenta = new javax.swing.JPanel();
        jLabelPv = new javax.swing.JLabel();
        jComboBoxPv = new javax.swing.JComboBox();
        jLabelModelo = new javax.swing.JLabel();
        jComboBoxModelo = new javax.swing.JComboBox();
        jLabelNroFactura = new javax.swing.JLabel();
        jTextFieldNroFactura = new javax.swing.JTextField();
        jLabelNroSerie = new javax.swing.JLabel();
        jTextFieldNroSerie = new javax.swing.JTextField();
        jLabelMotivoEstado = new javax.swing.JLabel();
        jLabelObservaciones = new javax.swing.JLabel();
        jScrollPaneMotivoEstado = new javax.swing.JScrollPane();
        jTextAreaMotivoEstado = new javax.swing.JTextArea();
        jFormattedTextFieldFechaEntrega = new javax.swing.JFormattedTextField();
        jCheckBoxFinalizada = new javax.swing.JCheckBox();
        jTextFieldEstado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setModal(true);

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sipsa/presentacion/recursos/document-save.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sipsa/presentacion/recursos/process-stop.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelFechaEntrega.setText("Fecha de entrega:");

        jTextAreaObservaciones.setColumns(20);
        jTextAreaObservaciones.setRows(5);
        jScrollPaneObservaciones.setViewportView(jTextAreaObservaciones);

        jLabelEstaado.setText("Estado actual:");

        jPanelVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelPv.setText("Punto de venta:");

        jLabelModelo.setText("Modelo:");

        jLabelNroFactura.setText("Nro de Factura:");

        jLabelNroSerie.setText("Nro de Serie:");

        javax.swing.GroupLayout jPanelVentaLayout = new javax.swing.GroupLayout(jPanelVenta);
        jPanelVenta.setLayout(jPanelVentaLayout);
        jPanelVentaLayout.setHorizontalGroup(
            jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPv)
                    .addComponent(jLabelNroFactura)
                    .addComponent(jLabelModelo)
                    .addComponent(jLabelNroSerie))
                .addGap(21, 21, 21)
                .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxModelo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 437, Short.MAX_VALUE)
                    .addComponent(jComboBoxPv, 0, 437, Short.MAX_VALUE)
                    .addComponent(jTextFieldNroFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addComponent(jTextFieldNroSerie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelVentaLayout.setVerticalGroup(
            jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNroFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNroSerie))
                .addContainerGap())
        );

        jLabelMotivoEstado.setText("Motivo del Estado:");

        jLabelObservaciones.setText("Observaciones:");

        jTextAreaMotivoEstado.setColumns(20);
        jTextAreaMotivoEstado.setRows(5);
        jScrollPaneMotivoEstado.setViewportView(jTextAreaMotivoEstado);

        jFormattedTextFieldFechaEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jCheckBoxFinalizada.setText("Finalizada");
        jCheckBoxFinalizada.setEnabled(false);

        jTextFieldEstado.setEditable(false);

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
                                    .addComponent(jLabelEstaado)
                                    .addComponent(jFormattedTextFieldFechaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(jLabelFechaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBoxFinalizada)
                                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPaneMotivoEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                    .addComponent(jLabelMotivoEstado)))
                            .addComponent(jPanelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneObservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelObservaciones)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelObservaciones)
                .addGap(10, 10, 10)
                .addComponent(jScrollPaneObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstaado)
                    .addComponent(jLabelMotivoEstado))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxFinalizada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(jScrollPaneMotivoEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        ordenDeTrabajo.setFechaEntrega((Date) jFormattedTextFieldFechaEntrega.getValue());
        ordenDeTrabajo.setMotivoEstado(jTextAreaMotivoEstado.getText());
        ordenDeTrabajo.setObservaciones(jTextAreaObservaciones.getText());
        ordenDeTrabajo.setPac(controlador.getPac());
        if (ordenDeTrabajo.getEstado().equals(EstadoOT.Nueva)) {
            Venta venta = ordenDeTrabajo.getVenta();
            venta.setEmpresaVendedora((Pv) jComboBoxPv.getSelectedItem());
            venta.setNroFactura(jTextFieldNroFactura.getText());
            Producto producto = venta.getProducto();
            producto.setModelo((Modelo) jComboBoxModelo.getSelectedItem());
            producto.setNroSerie(jTextFieldNroSerie.getText());
            venta.setProducto(producto);
            ordenDeTrabajo.setVenta(venta);
        }
        if (jCheckBoxFinalizada.isSelected()) {
            ordenDeTrabajo.setEstado(EstadoOT.Finalizada);
        }
        try {
            this.controlador.guardarOrdenDeTrabajo(this.ordenDeTrabajo);
            this.setVisible(false);
        } catch (Exception ex) {
            new DialogoMensaje(DialogoMensaje.Tipo.Error, ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_jButtonCancelarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JCheckBox jCheckBoxFinalizada;
    private javax.swing.JComboBox jComboBoxModelo;
    private javax.swing.JComboBox jComboBoxPv;
    private javax.swing.JFormattedTextField jFormattedTextFieldFechaEntrega;
    private javax.swing.JLabel jLabelEstaado;
    private javax.swing.JLabel jLabelFechaEntrega;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelMotivoEstado;
    private javax.swing.JLabel jLabelNroFactura;
    private javax.swing.JLabel jLabelNroSerie;
    private javax.swing.JLabel jLabelObservaciones;
    private javax.swing.JLabel jLabelPv;
    private javax.swing.JPanel jPanelVenta;
    private javax.swing.JScrollPane jScrollPaneMotivoEstado;
    private javax.swing.JScrollPane jScrollPaneObservaciones;
    private javax.swing.JTextArea jTextAreaMotivoEstado;
    private javax.swing.JTextArea jTextAreaObservaciones;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNroFactura;
    private javax.swing.JTextField jTextFieldNroSerie;
    // End of variables declaration//GEN-END:variables

    private void poblarFormulario() {
        try {
            this.jComboBoxPv.setModel(this.controlador.getListaPuntosDeVenta());
            this.jComboBoxModelo.setModel(this.controlador.getListaModelos());
            this.jTextFieldEstado.setText(ordenDeTrabajo.getEstado().toString());
            this.jFormattedTextFieldFechaEntrega.setValue(new Date(System.currentTimeMillis()));
            if (!ordenDeTrabajo.getEstado().equals(EstadoOT.Nueva)) {
                this.jCheckBoxFinalizada.setEnabled(ordenDeTrabajo.getEstado().equals(EstadoOT.Activa));
                this.jComboBoxPv.setSelectedItem(ordenDeTrabajo.getVenta().getEmpresaVendedora());
                this.jComboBoxPv.setEnabled(false);
                this.jComboBoxModelo.setSelectedItem(ordenDeTrabajo.getVenta().getProducto().getModelo());
                this.jComboBoxModelo.setEnabled(false);
                this.jTextAreaMotivoEstado.setText(ordenDeTrabajo.getMotivoEstado());
                this.jTextAreaObservaciones.setText(ordenDeTrabajo.getObservaciones());
                this.jTextFieldNroFactura.setText(ordenDeTrabajo.getVenta().getNroFactura());
                this.jTextFieldNroFactura.setEnabled(false);
                this.jTextFieldNroSerie.setText(ordenDeTrabajo.getVenta().getProducto().getNroSerie());
                this.jTextFieldNroSerie.setEnabled(false);
            }
        } catch (SipsaExcepcion ex) {
            new DialogoMensaje(DialogoMensaje.Tipo.Error, ex.getLocalizedMessage());
            this.setVisible(false);
        }
    }
}
