/*
 * Sistemas de Informacion II 2009
 * Proyecto Sipsa
 */

package sipsa.presentacion.escritorio;

import sipsa.Configuracion;
import sipsa.presentacion.interfaces.ILogin;

/**
 * Formulario generio para indentificar y autenticar usuarios
 * @author Claudio Rodrigo Pereyra Diaz
 * @author Maria Eugenia Sanchez
 */
public class Login extends javax.swing.JDialog {
    private ILogin controlador;
    /** A return status code - returned if Cancel button has been pressed */
    public static final int RET_CANCEL = 0;
    /** A return status code - returned if OK button has been pressed */
    public static final int RET_OK = 1;

    /** Creates new form Login
     * @param controlador del comportamiento del formulacion
     */
    public Login(ILogin controlador) {
        initComponents();
        this.controlador = controlador;
        Configuracion configuracion = Configuracion.getInstancia();
        this.setIconImage(configuracion.getIcono());
        this.setLocationRelativeTo(null);
        this.setTitle("Ingreso al Sistema");
    }

    /** @return the return status of this dialog - one of RET_OK or RET_CANCEL */
    public int getReturnStatus() {
        return returnStatus;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jTextFieldIdentificacion = new javax.swing.JTextField();
        jLabelIdentificacion = new javax.swing.JLabel();
        jLabelAutenticacion = new javax.swing.JLabel();
        jPasswordFieldAutenticacion = new javax.swing.JPasswordField();

        setTitle("Ingreso a Sipsa");
        setIconImage(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        okButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/tango-project/tango-icon-theme/16x16/apps/system-users.png"))); // NOI18N
        okButton.setText("Ingresar");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/tango-project/tango-icon-theme/16x16/actions/process-stop.png"))); // NOI18N
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabelIdentificacion.setText("CUIT");

        jLabelAutenticacion.setText("Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAutenticacion)
                    .addComponent(jLabelIdentificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(cancelButton))
                    .addComponent(jTextFieldIdentificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldAutenticacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, okButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdentificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldAutenticacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAutenticacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (controlador.ingresar(this.jTextFieldIdentificacion.getText(), this.jPasswordFieldAutenticacion.getPassword())){
            //TODO definir el controlador que implemente la interface ILogin
            doClose(RET_OK);
        } else {
            //TODO informar que no se puedo autenticar el usuario
        }    
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabelAutenticacion;
    private javax.swing.JLabel jLabelIdentificacion;
    private javax.swing.JPasswordField jPasswordFieldAutenticacion;
    private javax.swing.JTextField jTextFieldIdentificacion;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}