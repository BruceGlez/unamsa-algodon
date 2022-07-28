/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazModulosPrincipal;

import clases.calculos;
import conexion.conexionBD;
import conexion.consultasBD;
import interfazModulosCaptura.interfazCaptura;
import interfazModulosDivison.interfazDivision;
import interfazModulosReportes.interfazReportes;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author bruce
 */
public class interfazPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form interfazPrincipal
     */
    public interfazPrincipal() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnPrincipalCapturas = new javax.swing.JButton();
        btnPrincipalDivisiones = new javax.swing.JButton();
        btnPrincipalReportes = new javax.swing.JButton();
        btnActualizarTabla = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDatosDB = new javax.swing.JTable();
        txtTotalPacas = new javax.swing.JTextField();
        txtTotalDolares = new javax.swing.JTextField();
        lblPacas = new javax.swing.JLabel();
        lblDolares = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPrincipalCapturas.setText("Modulo de Registro");
        btnPrincipalCapturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalCapturasActionPerformed(evt);
            }
        });

        btnPrincipalDivisiones.setText("Division de Compras");
        btnPrincipalDivisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalDivisionesActionPerformed(evt);
            }
        });

        btnPrincipalReportes.setText("Reportes");
        btnPrincipalReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalReportesActionPerformed(evt);
            }
        });

        btnActualizarTabla.setText("Actualizar Tabla");
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });

        jTableDatosDB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave","Nombre Cliente", "No. Compra", "Vencimiento", "Pacas", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTableDatosDB);

        txtTotalPacas.setEditable(false);
        txtTotalPacas.setBackground(new java.awt.Color(204, 255, 255));
        txtTotalPacas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTotalPacasMouseClicked(evt);
            }
        });
        txtTotalPacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPacasActionPerformed(evt);
            }
        });

        txtTotalDolares.setEditable(false);
        txtTotalDolares.setBackground(new java.awt.Color(204, 255, 255));

        lblPacas.setText("PACAS:");

        lblDolares.setText("DOLARES:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPrincipalCapturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrincipalDivisiones, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(btnPrincipalReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDolares)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalDolares, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblPacas)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalPacas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnActualizarTabla)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalPacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPacas))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTotalDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDolares)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnActualizarTabla))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnPrincipalCapturas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrincipalDivisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrincipalReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalCapturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalCapturasActionPerformed
        // TODO add your handling code here:
        interfazModulosCaptura.interfazCaptura verformulario = new interfazCaptura();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPrincipalCapturasActionPerformed

    private void btnPrincipalDivisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalDivisionesActionPerformed
        // TODO add your handling code here:
        interfazDivision verformulario = new interfazDivision();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPrincipalDivisionesActionPerformed

    private void btnPrincipalReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalReportesActionPerformed
        // TODO add your handling code here:
        interfazReportes verformulario = new interfazReportes();
        
        verformulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPrincipalReportesActionPerformed

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        // TODO add your handling code here:
            try {
           
            conexionBD conexion = new conexionBD();
            double totalDolares = 0;
            double totalPacas = 0;
            
            DefaultTableModel tblModel = (DefaultTableModel)jTableDatosDB.getModel();
            
            tblModel.setRowCount(0);
            
            Statement st = conexion.getConexion().createStatement();

            String sql = "SELECT * FROM compras INNER JOIN clientes ON compras.fkCliente = clientes.idclientes";
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                
               

                String idCompra = String.valueOf(rs.getInt("idcompras"));
                String nombreCliente = String.valueOf(rs.getString("nombre"));
                String noCompra = String.valueOf(rs.getString("noCompra"));
                String fechaPago = String.valueOf(rs.getString("fechaPago"));
                
                String pacas = String.valueOf(rs.getInt("pacas"));
                double c = Double.parseDouble(pacas);
                totalPacas = totalPacas + c;
                
                String total = String.valueOf(rs.getFloat("total"));
                double d = Double.parseDouble(total);
                totalDolares = totalDolares + d;
                
                NumberFormat formatter = NumberFormat.getCurrencyInstance();
                String e = formatter.format(d);
                String tbData[] = {idCompra, nombreCliente, noCompra, fechaPago, pacas, e};
                
                
                tblModel.addRow(tbData);

            }
                       
            Locale usa = new Locale("en", "US");
            NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
            NumberFormat a = NumberFormat.getNumberInstance();
            
            txtTotalDolares.setText(dollarFormat.format(totalDolares));
            txtTotalPacas.setText(a.format(totalPacas));
            
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    private void txtTotalPacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPacasActionPerformed

    private void txtTotalPacasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalPacasMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTotalPacasMouseClicked

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
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnPrincipalCapturas;
    private javax.swing.JButton btnPrincipalDivisiones;
    private javax.swing.JButton btnPrincipalReportes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableDatosDB;
    private javax.swing.JLabel lblDolares;
    private javax.swing.JLabel lblPacas;
    private javax.swing.JTextField txtTotalDolares;
    private javax.swing.JTextField txtTotalPacas;
    // End of variables declaration//GEN-END:variables
}
