/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazModulosCaptura;

import clases.compras;
import clases.cuentaBancaria;
import conexion.consultasBD;
import javax.swing.JOptionPane;

/**
 *
 * @author bruce
 */
public class capturaCuentasBancarias extends javax.swing.JFrame {

    /**
     * Creates new form capturaCuentasBancarias
     */
    public capturaCuentasBancarias() {
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

        lblCuentaBancariaTitulo = new javax.swing.JLabel();
        lblCuentaBancariaBanco = new javax.swing.JLabel();
        lblCuentaBancariaCliente = new javax.swing.JLabel();
        cboxCuentaBancariaCliente = new javax.swing.JComboBox<>();
        txtCuentaBancariaCuenta = new javax.swing.JTextField();
        lblCuentaBancariaCuenta = new javax.swing.JLabel();
        btnCuentaBancariaCerrar = new javax.swing.JButton();
        btnCuentaBancariaRegistrar = new javax.swing.JButton();
        cboxCuentaBancariaBanco = new javax.swing.JComboBox<>();
        lblCuentaBancariaMoneda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCuentaBancariaMoneda = new javax.swing.JList<>();
        lblClabeBancaria = new javax.swing.JLabel();
        txtCuentasBancariasClabe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCuentaBancariaTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblCuentaBancariaTitulo.setText("Registro de Cuentas Bancarias");

        lblCuentaBancariaBanco.setText("Banco:");

        lblCuentaBancariaCliente.setText("Cliente Relacionado:");

        cboxCuentaBancariaCliente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cboxCuentaBancariaClienteMouseMoved(evt);
            }
        });
        cboxCuentaBancariaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCuentaBancariaClienteActionPerformed(evt);
            }
        });

        lblCuentaBancariaCuenta.setText("Cuenta Bancaria:");

        btnCuentaBancariaCerrar.setText("Cerrar");
        btnCuentaBancariaCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaBancariaCerrarActionPerformed(evt);
            }
        });

        btnCuentaBancariaRegistrar.setText("Registrar");
        btnCuentaBancariaRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaBancariaRegistrarActionPerformed(evt);
            }
        });

        cboxCuentaBancariaBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BBVA", "SANTANDER", "BANORTE", "BANREGIO", "UCACSA", "SCOTIABANK" }));
        cboxCuentaBancariaBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCuentaBancariaBancoActionPerformed(evt);
            }
        });

        lblCuentaBancariaMoneda.setText("Moneda:");

        listCuentaBancariaMoneda.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Dolares", "Pesos" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listCuentaBancariaMoneda);

        lblClabeBancaria.setText("CLABE Bancaria:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lblCuentaBancariaTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCuentaBancariaRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCuentaBancariaCerrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblClabeBancaria)
                                    .addComponent(lblCuentaBancariaBanco)
                                    .addComponent(lblCuentaBancariaCliente)
                                    .addComponent(lblCuentaBancariaCuenta)
                                    .addComponent(lblCuentaBancariaMoneda))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxCuentaBancariaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCuentasBancariasClabe)
                                    .addComponent(txtCuentaBancariaCuenta)
                                    .addComponent(cboxCuentaBancariaCliente, 0, 217, Short.MAX_VALUE))))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblCuentaBancariaTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuentaBancariaBanco)
                    .addComponent(cboxCuentaBancariaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCuentaBancariaCliente)
                    .addComponent(cboxCuentaBancariaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCuentaBancariaCuenta)
                    .addComponent(txtCuentaBancariaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCuentasBancariasClabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClabeBancaria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCuentaBancariaMoneda)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCuentaBancariaCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCuentaBancariaRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCuentaBancariaCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaBancariaCerrarActionPerformed
        // TODO add your handling code here:
        interfazCaptura verformulario = new interfazCaptura();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCuentaBancariaCerrarActionPerformed

    private void btnCuentaBancariaRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaBancariaRegistrarActionPerformed
        // TODO add your handling code here:
        Boolean guardar = true;
        String mensaje = "";
        
        try{
            
        String noCuenta = txtCuentaBancariaCuenta.getText(); 
        String noCLABE = txtCuentasBancariasClabe.getText();
        String banco = (String) cboxCuentaBancariaBanco.getSelectedItem();     
        String moneda = (String) listCuentaBancariaMoneda.getSelectedValue();
        
        if (noCuenta.length()==0){
            guardar = false;
            mensaje+="Escriba la cuenta, por favor\n";
        }
        
         if (noCuenta.length()==0){
            guardar = false;
            mensaje+="Escriba la clabe bancaria, por favor\n";
        }

        String c = (String) cboxCuentaBancariaCliente.getSelectedItem();
        char d = c.charAt(0);
        int cliente = Character.getNumericValue(d);
        
        if(guardar){
            
           consultasBD consulta = new consultasBD();
           cuentaBancaria cuenta = new cuentaBancaria(banco, cliente, noCuenta, moneda, noCLABE);
           consulta.registrarCuentaBancaria(cuenta);
           txtCuentaBancariaCuenta.setText("");
           
        }
           else{
               JOptionPane.showMessageDialog(null, mensaje);
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnCuentaBancariaRegistrarActionPerformed

    private void cboxCuentaBancariaClienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxCuentaBancariaClienteMouseMoved
        // TODO add your handling code here:

        String mensaje = "";
        
        try{
        consultasBD cargarComboBox = new consultasBD();
        cboxCuentaBancariaCliente.removeAllItems();
        cargarComboBox.consultaClientes(cboxCuentaBancariaCliente);
        if(cboxCuentaBancariaCliente.getItemCount() == 0){
            mensaje = "Es necesario capturar primero el cliente";
            JOptionPane.showMessageDialog(null, mensaje);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboxCuentaBancariaClienteMouseMoved

    private void cboxCuentaBancariaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCuentaBancariaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxCuentaBancariaClienteActionPerformed

    private void cboxCuentaBancariaBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCuentaBancariaBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxCuentaBancariaBancoActionPerformed

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
            java.util.logging.Logger.getLogger(capturaCuentasBancarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(capturaCuentasBancarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(capturaCuentasBancarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(capturaCuentasBancarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new capturaCuentasBancarias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuentaBancariaCerrar;
    private javax.swing.JButton btnCuentaBancariaRegistrar;
    private javax.swing.JComboBox<String> cboxCuentaBancariaBanco;
    private javax.swing.JComboBox<String> cboxCuentaBancariaCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClabeBancaria;
    private javax.swing.JLabel lblCuentaBancariaBanco;
    private javax.swing.JLabel lblCuentaBancariaCliente;
    private javax.swing.JLabel lblCuentaBancariaCuenta;
    private javax.swing.JLabel lblCuentaBancariaMoneda;
    private javax.swing.JLabel lblCuentaBancariaTitulo;
    private javax.swing.JList<String> listCuentaBancariaMoneda;
    private javax.swing.JTextField txtCuentaBancariaCuenta;
    private javax.swing.JTextField txtCuentasBancariasClabe;
    // End of variables declaration//GEN-END:variables
}
