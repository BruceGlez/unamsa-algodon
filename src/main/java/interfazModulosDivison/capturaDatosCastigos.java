/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazModulosDivison;

import clases.castigos;
import conexion.consultasBD;
import javax.swing.JOptionPane;

/**
 *
 * @author bruce
 */
public class capturaDatosCastigos extends javax.swing.JFrame {

    /**
     * Creates new form capturaDatosCastigos
     */
    public capturaDatosCastigos() {
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

        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCastigosCapturar = new javax.swing.JButton();
        cboxCompraRelacionadaCastigos = new javax.swing.JComboBox<>();
        lblDivisionCompra = new javax.swing.JLabel();

        jLabel6.setText("Nombre");

        jLabel7.setText("Cantidad");

        btnCastigosCapturar.setText("CAPTURAR");
        btnCastigosCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCastigosCapturarActionPerformed(evt);
            }
        });

        cboxCompraRelacionadaCastigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxCompraRelacionadaCastigosMouseClicked(evt);
            }
        });
        cboxCompraRelacionadaCastigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCompraRelacionadaCastigosActionPerformed(evt);
            }
        });

        lblDivisionCompra.setText("Compra:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDivisionCompra)
                                .addGap(18, 18, 18)
                                .addComponent(cboxCompraRelacionadaCastigos, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCastigosCapturar)
                                .addGap(69, 69, 69)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDivisionCompra)
                    .addComponent(cboxCompraRelacionadaCastigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCastigosCapturar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCastigosCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCastigosCapturarActionPerformed
        // TODO add your handling code here:
        Boolean guardar = true;
        String mensaje = "";
        String t = "";

        try{

            String nombre = txtNombre.getText();
            float cantidad = Float.parseFloat(txtCantidad.getText());
            int compraRelacionada = 0;

            String c = (String) cboxCompraRelacionadaCastigos.getSelectedItem();
            char d = c.charAt(0);
            char e = c.charAt(1);

            if(Character.isDigit(e)){

                t = new StringBuilder().append(d).append(e).toString();
                compraRelacionada = Integer.parseInt(t);
            }
            else{
                t = new StringBuilder().append(d).toString();
                compraRelacionada = Integer.parseInt(t);
            }

            if(guardar){
                consultasBD consulta = new consultasBD();

                castigos castigo = new castigos(nombre, cantidad, compraRelacionada);

                consulta.registrarCastigosCompra(castigo);

                txtNombre.setText("");
                txtCantidad.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnCastigosCapturarActionPerformed

    private void cboxCompraRelacionadaCastigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxCompraRelacionadaCastigosMouseClicked
        // TODO add your handling code here:
        String mensaje = "";

        try{
            consultasBD cargarComboBox = new consultasBD();
            cboxCompraRelacionadaCastigos.removeAllItems();
            cargarComboBox.consultaCompras(cboxCompraRelacionadaCastigos);
            if(cboxCompraRelacionadaCastigos.getItemCount() == 0){
                mensaje = "Es necesario capturar primero una compra";
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboxCompraRelacionadaCastigosMouseClicked

    private void cboxCompraRelacionadaCastigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCompraRelacionadaCastigosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxCompraRelacionadaCastigosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(capturaDatosCastigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(capturaDatosCastigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(capturaDatosCastigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(capturaDatosCastigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new capturaDatosCastigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCastigosCapturar;
    private javax.swing.JComboBox<String> cboxCompraRelacionadaCastigos;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblDivisionCompra;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
