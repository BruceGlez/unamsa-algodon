/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazModulosCaptura;

/**
 *
 * @author bruce
 */
public class capturaPagos extends javax.swing.JFrame {

    /**
     * Creates new form capturaPagos
     */
    public capturaPagos() {
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

        lblPagosTitulo = new javax.swing.JLabel();
        lblPagosCompra = new javax.swing.JLabel();
        lblPagosMoneda = new javax.swing.JLabel();
        lblPagosDivision = new javax.swing.JLabel();
        lblPagosMontoPagado = new javax.swing.JLabel();
        lblPagosFactura = new javax.swing.JLabel();
        lblPagosTC = new javax.swing.JLabel();
        lblPagosCuentaBancaria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPagosMoneda = new javax.swing.JList<>();
        cboxPagosCuentaBancaria = new javax.swing.JComboBox<>();
        txtPagosMontoPagado = new javax.swing.JTextField();
        txtPagosFecha = new javax.swing.JTextField();
        lblPagosFecha = new javax.swing.JLabel();
        cboxPagosFactura = new javax.swing.JComboBox<>();
        txtPagosTC = new javax.swing.JTextField();
        lblPagosMontoDLS = new javax.swing.JLabel();
        txtPagosMontoDLS = new javax.swing.JTextField();
        btnPagosRegistrar = new javax.swing.JButton();
        btnPagosCerrar = new javax.swing.JButton();
        cboxPagosCompra = new javax.swing.JComboBox<>();
        cboxPagosDivison = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPagosTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblPagosTitulo.setText("Registro de Pagos");

        lblPagosCompra.setText("Compra Relacionada:");

        lblPagosMoneda.setText("Moneda:");

        lblPagosDivision.setText("Division Relacionada:");

        lblPagosMontoPagado.setText("Monto Pagado:");

        lblPagosFactura.setText("Factura Relacionada:");

        lblPagosTC.setText("T.C.");

        lblPagosCuentaBancaria.setText("Cuenta Bancaria:");

        listPagosMoneda.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listPagosMoneda);

        cboxPagosCuentaBancaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtPagosMontoPagado.setText("jTextField1");

        txtPagosFecha.setText("jTextField5");

        lblPagosFecha.setText("Fecha de Pago:");

        cboxPagosFactura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtPagosTC.setText("jTextField1");

        lblPagosMontoDLS.setText("Monto Pagado en Dls:");

        txtPagosMontoDLS.setText("jTextField7");
        txtPagosMontoDLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagosMontoDLSActionPerformed(evt);
            }
        });

        btnPagosRegistrar.setText("Registrar");
        btnPagosRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosRegistrarActionPerformed(evt);
            }
        });

        btnPagosCerrar.setText("Cerrar");
        btnPagosCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosCerrarActionPerformed(evt);
            }
        });

        cboxPagosCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboxPagosDivison.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPagosTitulo)
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPagosRegistrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnPagosCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPagosMontoPagado)
                                .addGap(18, 18, 18)
                                .addComponent(txtPagosMontoPagado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPagosFecha)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPagosDivision)
                                    .addComponent(lblPagosCompra)
                                    .addComponent(lblPagosMoneda))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxPagosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxPagosDivison, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPagosCuentaBancaria)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cboxPagosCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtPagosFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPagosTC)
                            .addComponent(lblPagosFactura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboxPagosFactura, 0, 127, Short.MAX_VALUE)
                            .addComponent(txtPagosTC)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblPagosMontoDLS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPagosMontoDLS)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblPagosTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPagosFecha)
                    .addComponent(txtPagosFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPagosCuentaBancaria)
                            .addComponent(cboxPagosCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPagosFactura)
                            .addComponent(cboxPagosFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPagosTC)
                            .addComponent(txtPagosTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPagosCompra)
                            .addComponent(cboxPagosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPagosDivision)
                            .addComponent(cboxPagosDivison, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPagosMoneda)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPagosMontoPagado)
                    .addComponent(txtPagosMontoPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPagosMontoDLS)
                    .addComponent(txtPagosMontoDLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagosRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagosCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPagosMontoDLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagosMontoDLSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagosMontoDLSActionPerformed

    private void btnPagosRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagosRegistrarActionPerformed

    private void btnPagosCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagosCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(capturaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(capturaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(capturaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(capturaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new capturaPagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagosCerrar;
    private javax.swing.JButton btnPagosRegistrar;
    private javax.swing.JComboBox<String> cboxPagosCompra;
    private javax.swing.JComboBox<String> cboxPagosCuentaBancaria;
    private javax.swing.JComboBox<String> cboxPagosDivison;
    private javax.swing.JComboBox<String> cboxPagosFactura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPagosCompra;
    private javax.swing.JLabel lblPagosCuentaBancaria;
    private javax.swing.JLabel lblPagosDivision;
    private javax.swing.JLabel lblPagosFactura;
    private javax.swing.JLabel lblPagosFecha;
    private javax.swing.JLabel lblPagosMoneda;
    private javax.swing.JLabel lblPagosMontoDLS;
    private javax.swing.JLabel lblPagosMontoPagado;
    private javax.swing.JLabel lblPagosTC;
    private javax.swing.JLabel lblPagosTitulo;
    private javax.swing.JList<String> listPagosMoneda;
    private javax.swing.JTextField txtPagosFecha;
    private javax.swing.JTextField txtPagosMontoDLS;
    private javax.swing.JTextField txtPagosMontoPagado;
    private javax.swing.JTextField txtPagosTC;
    // End of variables declaration//GEN-END:variables
}
