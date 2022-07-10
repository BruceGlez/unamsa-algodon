/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazModulosCaptura;

import interfazModulosPrincipal.interfazPrincipal;



/**
 *
 * @author bruce
 */
public class interfazCaptura extends javax.swing.JFrame {

    /**
     * Creates new form moduloCaptura
     */
    public interfazCaptura() {
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

        btnInterfazCapturaClientes = new javax.swing.JButton();
        btnInterfazCapturaCompras = new javax.swing.JButton();
        btnInterfazCapturaCompradores = new javax.swing.JButton();
        btnInterfazCapturaContadores = new javax.swing.JButton();
        btnInterfazCapturaCuentas = new javax.swing.JButton();
        btnInterfazCapturaDivisiones = new javax.swing.JButton();
        btnInterfazCapturaPagos = new javax.swing.JButton();
        btnInterfazCapturaReg = new javax.swing.JButton();
        btnInterfazCapturaFacturas = new javax.swing.JButton();
        btnInterfazCapturaComplementos = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInterfazCapturaClientes.setText("Clientes");
        btnInterfazCapturaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterfazCapturaClientesActionPerformed(evt);
            }
        });

        btnInterfazCapturaCompras.setText("Compras");
        btnInterfazCapturaCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterfazCapturaComprasActionPerformed(evt);
            }
        });

        btnInterfazCapturaCompradores.setText("Compradores");
        btnInterfazCapturaCompradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterfazCapturaCompradoresActionPerformed(evt);
            }
        });

        btnInterfazCapturaContadores.setText("Contadores");
        btnInterfazCapturaContadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterfazCapturaContadoresActionPerformed(evt);
            }
        });

        btnInterfazCapturaCuentas.setText("Cuentas Bancarias");
        btnInterfazCapturaCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterfazCapturaCuentasActionPerformed(evt);
            }
        });

        btnInterfazCapturaDivisiones.setText("Divisiones");
        btnInterfazCapturaDivisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterfazCapturaDivisionesActionPerformed(evt);
            }
        });

        btnInterfazCapturaPagos.setText("Pagos");
        btnInterfazCapturaPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterfazCapturaPagosActionPerformed(evt);
            }
        });

        btnInterfazCapturaReg.setText("Regimenes Fiscales");
        btnInterfazCapturaReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterfazCapturaRegActionPerformed(evt);
            }
        });

        btnInterfazCapturaFacturas.setText("Facturas");
        btnInterfazCapturaFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterfazCapturaFacturasActionPerformed(evt);
            }
        });

        btnInterfazCapturaComplementos.setText("Complementos de Pago");
        btnInterfazCapturaComplementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterfazCapturaComplementosActionPerformed(evt);
            }
        });

        jButton12.setText("INICIO");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInterfazCapturaComplementos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInterfazCapturaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInterfazCapturaCompradores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInterfazCapturaCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInterfazCapturaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnInterfazCapturaFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnInterfazCapturaContadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInterfazCapturaPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInterfazCapturaDivisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInterfazCapturaCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 12, Short.MAX_VALUE)))
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnInterfazCapturaFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInterfazCapturaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInterfazCapturaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInterfazCapturaCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInterfazCapturaContadores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnInterfazCapturaCompradores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInterfazCapturaDivisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInterfazCapturaPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInterfazCapturaCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(btnInterfazCapturaComplementos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInterfazCapturaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterfazCapturaClientesActionPerformed
        // TODO add your handling code here:
    capturaClientes verformulario = new capturaClientes();
        
    verformulario.setVisible(true);
    dispose();   
        
    }//GEN-LAST:event_btnInterfazCapturaClientesActionPerformed

    private void btnInterfazCapturaComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterfazCapturaComprasActionPerformed
        // TODO add your handling code here:
        capturaCompras verformulario = new capturaCompras();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInterfazCapturaComprasActionPerformed

    private void btnInterfazCapturaCompradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterfazCapturaCompradoresActionPerformed
        // TODO add your handling code here:
        capturaCompradores verformulario = new capturaCompradores();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInterfazCapturaCompradoresActionPerformed

    private void btnInterfazCapturaContadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterfazCapturaContadoresActionPerformed
        // TODO add your handling code here:
        capturaContadores verformulario = new capturaContadores();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInterfazCapturaContadoresActionPerformed

    private void btnInterfazCapturaCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterfazCapturaCuentasActionPerformed
        // TODO add your handling code here:
        capturaCuentasBancarias verformulario = new capturaCuentasBancarias();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInterfazCapturaCuentasActionPerformed

    private void btnInterfazCapturaDivisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterfazCapturaDivisionesActionPerformed
        // TODO add your handling code here:
    
        
    }//GEN-LAST:event_btnInterfazCapturaDivisionesActionPerformed

    private void btnInterfazCapturaPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterfazCapturaPagosActionPerformed
        // TODO add your handling code here:
        capturaPagos verformulario = new capturaPagos();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInterfazCapturaPagosActionPerformed

    private void btnInterfazCapturaRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterfazCapturaRegActionPerformed
        // TODO add your handling code here:
        capturaRegimenFiscal verformulario = new capturaRegimenFiscal();

        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInterfazCapturaRegActionPerformed

    private void btnInterfazCapturaFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterfazCapturaFacturasActionPerformed
        // TODO add your handling code here:
        capturaFacturas verformulario = new capturaFacturas();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInterfazCapturaFacturasActionPerformed

    private void btnInterfazCapturaComplementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterfazCapturaComplementosActionPerformed
        // TODO add your handling code here:
        capturaComplementoPago verformulario = new capturaComplementoPago();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInterfazCapturaComplementosActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        interfazPrincipal verformulario = new interfazPrincipal();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(interfazCaptura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazCaptura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazCaptura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazCaptura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazCaptura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInterfazCapturaClientes;
    private javax.swing.JButton btnInterfazCapturaComplementos;
    private javax.swing.JButton btnInterfazCapturaCompradores;
    private javax.swing.JButton btnInterfazCapturaCompras;
    private javax.swing.JButton btnInterfazCapturaContadores;
    private javax.swing.JButton btnInterfazCapturaCuentas;
    private javax.swing.JButton btnInterfazCapturaDivisiones;
    private javax.swing.JButton btnInterfazCapturaFacturas;
    private javax.swing.JButton btnInterfazCapturaPagos;
    private javax.swing.JButton btnInterfazCapturaReg;
    private javax.swing.JButton jButton12;
    // End of variables declaration//GEN-END:variables
}