/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazModulosCaptura;

import conexion.consultasBD;
import javax.swing.JOptionPane;

/**
 *
 * @author bruce
 */
public class capturaContadores extends javax.swing.JFrame {

    /**
     * Creates new form capturaContadores
     */
    public capturaContadores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblContadorTitulo = new javax.swing.JLabel();
        lblContadorNombre = new javax.swing.JLabel();
        lblContadorTelefono = new javax.swing.JLabel();
        lblContadorCorreo = new javax.swing.JLabel();
        txtContadorNombre = new javax.swing.JTextField();
        txtContadorTelefono = new javax.swing.JTextField();
        txtContadorCorreo = new javax.swing.JTextField();
        btnContadorCerrar = new javax.swing.JButton();
        btnContadorRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblContadorTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblContadorTitulo.setText("Registro de Contadores");

        lblContadorNombre.setText("Nombre:");

        lblContadorTelefono.setText("Telefono:");

        lblContadorCorreo.setText("Correo:");

        txtContadorNombre.setToolTipText("");

        btnContadorCerrar.setText("Cerrar");
        btnContadorCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContadorCerrarActionPerformed(evt);
            }
        });

        btnContadorRegistrar.setText("Registrar");
        btnContadorRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContadorRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lblContadorTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContadorNombre)
                            .addComponent(lblContadorTelefono)
                            .addComponent(lblContadorCorreo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContadorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txtContadorTelefono)
                            .addComponent(txtContadorCorreo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnContadorRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnContadorCerrar)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblContadorTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContadorNombre)
                    .addComponent(txtContadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContadorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContadorTelefono))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContadorCorreo)
                    .addComponent(txtContadorCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContadorCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContadorRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContadorCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContadorCerrarActionPerformed
        // TODO add your handling code here:
        interfazCaptura verformulario = new interfazCaptura();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnContadorCerrarActionPerformed

    private void btnContadorRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContadorRegistrarActionPerformed
        // TODO add your handling code here:
        Boolean guardar = true;
        String mensaje = "";
        
        try{
            
        String nombre = txtContadorNombre.getText();
        String telefono = txtContadorTelefono.getText();
        String correo = txtContadorCorreo.getText();
        
      
        if (nombre.length()==0){
            guardar = false;
            mensaje+="Escriba el nombre, por favor\n";
        }
        
        if (telefono.length()==0){
            guardar = false;
            mensaje+="Escriba el telefono, por favor\n";
        }
        
        if (correo.length()==0){
            guardar = false;
            mensaje+="Escriba el correo, por favor\n";
        }
        
        if(guardar){
           consultasBD consulta = new consultasBD();
           consulta.registrarContador(nombre, telefono, correo);
           txtContadorNombre.setText("");
           txtContadorTelefono.setText("");
           txtContadorCorreo.setText("");
        }
           else{
               JOptionPane.showMessageDialog(null, mensaje);
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnContadorRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(capturaContadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(capturaContadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(capturaContadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(capturaContadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new capturaContadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContadorCerrar;
    private javax.swing.JButton btnContadorRegistrar;
    private javax.swing.JLabel lblContadorCorreo;
    private javax.swing.JLabel lblContadorNombre;
    private javax.swing.JLabel lblContadorTelefono;
    private javax.swing.JLabel lblContadorTitulo;
    private javax.swing.JTextField txtContadorCorreo;
    private javax.swing.JTextField txtContadorNombre;
    private javax.swing.JTextField txtContadorTelefono;
    // End of variables declaration//GEN-END:variables
}
