/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazModulosDivison;

import clases.detalles;
import conexion.consultasBD;
import javax.swing.JOptionPane;

/**
 *
 * @author bruce
 */
public class capturaDatosPacas extends javax.swing.JFrame {

    /**
     * Creates new form capturaDatos
     */
    public capturaDatosPacas() {
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

        txtClase = new javax.swing.JTextField();
        txtPacas = new javax.swing.JTextField();
        txtKilos = new javax.swing.JTextField();
        txtQuintales = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCapturarDetalles = new javax.swing.JButton();
        cboxCompraRelacionadaDetalles = new javax.swing.JComboBox<>();
        lblDivisionCompra = new javax.swing.JLabel();
        btnCapturarDetalles1 = new javax.swing.JButton();

        jLabel1.setText("CLASE");

        jLabel2.setText("PACAS");

        jLabel3.setText("KILOS");

        jLabel4.setText("QUINTALES");

        jLabel5.setText("PRECIO");

        btnCapturarDetalles.setText("CAPTURAR");
        btnCapturarDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarDetallesActionPerformed(evt);
            }
        });

        cboxCompraRelacionadaDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxCompraRelacionadaDetallesMouseClicked(evt);
            }
        });
        cboxCompraRelacionadaDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCompraRelacionadaDetallesActionPerformed(evt);
            }
        });

        lblDivisionCompra.setText("Compra:");

        btnCapturarDetalles1.setText("CAPTURAR CASTIGOS");
        btnCapturarDetalles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarDetalles1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtClase)
                            .addComponent(txtPacas)
                            .addComponent(txtKilos)
                            .addComponent(txtQuintales)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDivisionCompra)
                        .addGap(18, 18, 18)
                        .addComponent(cboxCompraRelacionadaDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnCapturarDetalles)
                        .addGap(26, 26, 26)
                        .addComponent(btnCapturarDetalles1)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuintales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDivisionCompra)
                    .addComponent(cboxCompraRelacionadaDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapturarDetalles)
                    .addComponent(btnCapturarDetalles1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapturarDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarDetallesActionPerformed
        // TODO add your handling code here:
        Boolean guardar = true;
        String mensaje = "";
        String t = "";
        
        try{
            
        String clase = txtClase.getText();
        int kilos = Integer.parseInt(txtKilos.getText());
        int pacas = Integer.parseInt(txtPacas.getText());
        float quintales = Float.parseFloat(txtQuintales.getText());
        float precio = Float.parseFloat(txtPrecio.getText());
        int compraRelacionada = 0;
        
        String c = (String) cboxCompraRelacionadaDetalles.getSelectedItem();
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
           
           detalles detalle = new detalles(clase, pacas, kilos, quintales, precio, compraRelacionada);
           
           consulta.registrarDetallesCompra(detalle);
           
           txtClase.setText("");
           txtKilos.setText("");
           txtPacas.setText("");
           txtQuintales.setText("");
           txtPrecio.setText("");
        }
           else{
               JOptionPane.showMessageDialog(null, mensaje);
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btnCapturarDetallesActionPerformed

    private void cboxCompraRelacionadaDetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxCompraRelacionadaDetallesMouseClicked
        // TODO add your handling code here:
        String mensaje = "";

        try{
            consultasBD cargarComboBox = new consultasBD();
            cboxCompraRelacionadaDetalles.removeAllItems();
            cargarComboBox.consultaCompras(cboxCompraRelacionadaDetalles);
            if(cboxCompraRelacionadaDetalles.getItemCount() == 0){
                mensaje = "Es necesario capturar primero una compra";
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboxCompraRelacionadaDetallesMouseClicked

    private void cboxCompraRelacionadaDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCompraRelacionadaDetallesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxCompraRelacionadaDetallesActionPerformed

    private void btnCapturarDetalles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarDetalles1ActionPerformed
        // TODO add your handling code here:
        capturaDatosCastigos verform = new capturaDatosCastigos();
    
        verform.setVisible(true);
        
                
    }//GEN-LAST:event_btnCapturarDetalles1ActionPerformed

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
            java.util.logging.Logger.getLogger(capturaDatosPacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(capturaDatosPacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(capturaDatosPacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(capturaDatosPacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new capturaDatosPacas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapturarDetalles;
    private javax.swing.JButton btnCapturarDetalles1;
    private javax.swing.JComboBox<String> cboxCompraRelacionadaDetalles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblDivisionCompra;
    private javax.swing.JTextField txtClase;
    private javax.swing.JTextField txtKilos;
    private javax.swing.JTextField txtPacas;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtQuintales;
    // End of variables declaration//GEN-END:variables
}