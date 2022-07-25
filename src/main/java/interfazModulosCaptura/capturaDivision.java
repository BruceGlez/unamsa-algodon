/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazModulosCaptura;

import clases.compras;
import clases.divisiones;
import conexion.consultasBD;
import javax.swing.JOptionPane;

/**
 *
 * @author bruce
 */
public class capturaDivision extends javax.swing.JFrame {

    /**
     * Creates new form capturaDivision
     */
    public capturaDivision() {
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

        txtDivisionTotal = new javax.swing.JTextField();
        lblDivisionCompra = new javax.swing.JLabel();
        cboxDivisionCompra = new javax.swing.JComboBox<>();
        btnDivisionRegistrar = new javax.swing.JButton();
        btnDivisionCerrar = new javax.swing.JButton();
        lblDivisionTitulo = new javax.swing.JLabel();
        lblDivisionNo = new javax.swing.JLabel();
        lblDivisionPacas = new javax.swing.JLabel();
        lblDivisionTotal = new javax.swing.JLabel();
        txtDivisionNo = new javax.swing.JTextField();
        txtDivisionPacas = new javax.swing.JTextField();
        lblDivisionCompra1 = new javax.swing.JLabel();
        cboxDivisionesCliente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDivisionCompra.setText("Compra:");

        cboxDivisionCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxDivisionCompraMouseClicked(evt);
            }
        });
        cboxDivisionCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxDivisionCompraActionPerformed(evt);
            }
        });

        btnDivisionRegistrar.setText("Registrar");
        btnDivisionRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionRegistrarActionPerformed(evt);
            }
        });

        btnDivisionCerrar.setText("Cerrar");
        btnDivisionCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionCerrarActionPerformed(evt);
            }
        });

        lblDivisionTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblDivisionTitulo.setText("Registro de Divisiones");

        lblDivisionNo.setText("No. Division:");

        lblDivisionPacas.setText("Pacas:");

        lblDivisionTotal.setText("Total:");

        txtDivisionPacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDivisionPacasActionPerformed(evt);
            }
        });

        lblDivisionCompra1.setText("Cliente:");

        cboxDivisionesCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxDivisionesClienteMouseClicked(evt);
            }
        });
        cboxDivisionesCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxDivisionesClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(lblDivisionTitulo)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lblDivisionPacas))
                            .addComponent(lblDivisionNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDivisionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDivisionPacas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnDivisionRegistrar)
                        .addGap(24, 24, 24)
                        .addComponent(btnDivisionCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(lblDivisionTotal)
                                .addGap(18, 18, 18)
                                .addComponent(txtDivisionTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 147, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDivisionCompra1)
                                .addGap(18, 18, 18)
                                .addComponent(cboxDivisionesCliente, 0, 349, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDivisionCompra)
                                .addGap(18, 18, 18)
                                .addComponent(cboxDivisionCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblDivisionTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDivisionNo)
                    .addComponent(txtDivisionNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDivisionPacas)
                    .addComponent(txtDivisionPacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDivisionTotal)
                    .addComponent(txtDivisionTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDivisionCompra)
                    .addComponent(cboxDivisionCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDivisionCompra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboxDivisionesCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDivisionRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivisionCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxDivisionCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxDivisionCompraMouseClicked
        // TODO add your handling code here:
        String mensaje = "";

        try{
            consultasBD cargarComboBox = new consultasBD();
            cboxDivisionCompra.removeAllItems();
            cargarComboBox.consultaCompras(cboxDivisionCompra);
            if(cboxDivisionCompra.getItemCount() == 0){
                mensaje = "Es necesario capturar primero una compra";
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cboxDivisionCompraMouseClicked

    private void cboxDivisionCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxDivisionCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxDivisionCompraActionPerformed

    private void btnDivisionRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionRegistrarActionPerformed
        // TODO add your handling code here:
        Boolean guardar = true;
        String mensaje = "";
        String t = "";
        String s = "";

        try{ 
            String noDivision = txtDivisionNo.getText();
            int compraRelacionada = 0;
            int clienteRelacionado = 0;
            int pacas = Integer.parseInt(txtDivisionPacas.getText());
            float total = Float.parseFloat(txtDivisionTotal.getText());

            if (noDivision.length()==0){
                guardar = false;
                mensaje+="Escriba el numero de compra, por favor\n";
            }
            if (pacas==0){
                guardar = false;
                mensaje+="Escriba el numero de pacas, por favor\n";
            }
            if (total==0){
                guardar = false;
                mensaje+="Escriba el total, por favor\n";
            }

            String c = (String) cboxDivisionCompra.getSelectedItem();
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
            
            String a = (String) cboxDivisionesCliente.getSelectedItem();
            char b = a.charAt(0);
            char f = a.charAt(1);
            
            if(Character.isDigit(f)){
                
            s = new StringBuilder().append(b).append(f).toString();
                clienteRelacionado = Integer.parseInt(s);
            }
            else{
                s = new StringBuilder().append(b).toString();
                clienteRelacionado = Integer.parseInt(s);
            }

            if(guardar){

                consultasBD consulta = new consultasBD();
                divisiones division = new divisiones(noDivision, pacas, total, compraRelacionada, clienteRelacionado);
                consulta.registrarDivision(division);

                txtDivisionNo.setText("");
                txtDivisionPacas.setText("");
                txtDivisionTotal.setText("");

            }
            else{
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnDivisionRegistrarActionPerformed

    private void btnDivisionCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionCerrarActionPerformed
        // TODO add your handling code here:
        interfazCaptura verformulario = new interfazCaptura();

        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDivisionCerrarActionPerformed

    private void txtDivisionPacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDivisionPacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDivisionPacasActionPerformed

    private void cboxDivisionesClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxDivisionesClienteMouseClicked
        // TODO add your handling code here:
        String mensaje = "";

        try{
            consultasBD cargarComboBox = new consultasBD();
            cboxDivisionesCliente.removeAllItems();
            cargarComboBox.consultaClientes(cboxDivisionesCliente);
            if(cboxDivisionesCliente.getItemCount() == 0){
                mensaje = "Es necesario capturar primero el cliente";
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_cboxDivisionesClienteMouseClicked

    private void cboxDivisionesClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxDivisionesClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxDivisionesClienteActionPerformed

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
            java.util.logging.Logger.getLogger(capturaDivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(capturaDivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(capturaDivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(capturaDivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new capturaDivision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivisionCerrar;
    private javax.swing.JButton btnDivisionRegistrar;
    private javax.swing.JComboBox<String> cboxDivisionCompra;
    private javax.swing.JComboBox<String> cboxDivisionesCliente;
    private javax.swing.JLabel lblDivisionCompra;
    private javax.swing.JLabel lblDivisionCompra1;
    private javax.swing.JLabel lblDivisionNo;
    private javax.swing.JLabel lblDivisionPacas;
    private javax.swing.JLabel lblDivisionTitulo;
    private javax.swing.JLabel lblDivisionTotal;
    private javax.swing.JTextField txtDivisionNo;
    private javax.swing.JTextField txtDivisionPacas;
    private javax.swing.JTextField txtDivisionTotal;
    // End of variables declaration//GEN-END:variables
}