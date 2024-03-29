/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazModulosCaptura;

import clases.regimenFiscal;
import conexion.consultasBD;
import javax.swing.JOptionPane;

/**
 *
 * @author bruce
 */
public class capturaRegimenFiscal extends javax.swing.JFrame {

    /**
     * Creates new form capturaRegimenFiscal
     */
    public capturaRegimenFiscal() {
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

        lblRegTitulo = new javax.swing.JLabel();
        lblRegNombre = new javax.swing.JLabel();
        lblRegISR = new javax.swing.JLabel();
        btnRegCerrar = new javax.swing.JButton();
        btnRegRegistrar = new javax.swing.JButton();
        regTxtNombre = new javax.swing.JTextField();
        cboxRegISR = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblRegTitulo.setText("Registro de los Regimenes Fiscales");

        lblRegNombre.setText("Nombre:");

        lblRegISR.setText("Retencion de ISR:");

        btnRegCerrar.setText("Cerrar");
        btnRegCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCerrarActionPerformed(evt);
            }
        });

        btnRegRegistrar.setText("Registrar");
        btnRegRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegRegistrarActionPerformed(evt);
            }
        });

        regTxtNombre.setText("asd");
        regTxtNombre.setToolTipText("");
        regTxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regTxtNombreActionPerformed(evt);
            }
        });

        cboxRegISR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1.25", "4" }));
        cboxRegISR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxRegISRMouseClicked(evt);
            }
        });
        cboxRegISR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxRegISRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegRegistrar)
                        .addGap(42, 42, 42)
                        .addComponent(btnRegCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRegNombre)
                            .addComponent(lblRegISR))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboxRegISR, 0, 139, Short.MAX_VALUE)
                            .addComponent(regTxtNombre))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegTitulo)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegNombre)
                    .addComponent(regTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegISR)
                    .addComponent(cboxRegISR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegRegistrar)
                    .addComponent(btnRegCerrar))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegCerrarActionPerformed
        // TODO add your handling code here:
        interfazCaptura verformulario = new interfazCaptura();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegCerrarActionPerformed

    private void btnRegRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegRegistrarActionPerformed
        // TODO add your handling code here:
        Boolean guardar = true;
        String mensaje = "";
        
        try{
            
        String nombre = regTxtNombre.getText();
        
        if (nombre.length()==0){
            guardar = false;
            mensaje+="Escriba el nombre, por favor\n";
        }
           if(cboxRegISR.getItemCount() == 0){
            
            mensaje="Escoja un Contador Porfavor";
            JOptionPane.showMessageDialog(null, mensaje);
        
        }
        
        String f = (String) cboxRegISR.getSelectedItem();
        float retencion = Float.parseFloat(f);
        
        JOptionPane.showMessageDialog(null, nombre + retencion);
        if(guardar){
           consultasBD consulta = new consultasBD();
           
           regimenFiscal regFiscal = new regimenFiscal(nombre, retencion);
           consulta.registrarRegimenFiscal(regFiscal);
           
           regTxtNombre.setText("");
        }
           else{
               JOptionPane.showMessageDialog(null, mensaje);
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnRegRegistrarActionPerformed

    private void cboxRegISRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxRegISRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxRegISRActionPerformed

    private void cboxRegISRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxRegISRMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cboxRegISRMouseClicked

    private void regTxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regTxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regTxtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(capturaRegimenFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(capturaRegimenFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(capturaRegimenFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(capturaRegimenFiscal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new capturaRegimenFiscal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegCerrar;
    private javax.swing.JButton btnRegRegistrar;
    private javax.swing.JComboBox<String> cboxRegISR;
    private javax.swing.JLabel lblRegISR;
    private javax.swing.JLabel lblRegNombre;
    private javax.swing.JLabel lblRegTitulo;
    private javax.swing.JTextField regTxtNombre;
    // End of variables declaration//GEN-END:variables
}
