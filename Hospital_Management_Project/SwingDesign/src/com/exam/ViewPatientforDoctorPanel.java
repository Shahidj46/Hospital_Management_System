/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ViewPatientforDoctorPanel extends javax.swing.JFrame {
     Connection con;
    PreparedStatement pst;
   // List<Produk> plist;
    Object[] data;
    DefaultTableModel table1;
    

    /**
  
     */
    public ViewPatientforDoctorPanel() {
        initComponents();
          table1 = new DefaultTableModel();
        table1.addColumn("PatientID");
        table1.addColumn("Name");
        table1.addColumn("Age");
        table1.addColumn("Department");
        table1.addColumn("Gender");
        table1.addColumn("MaritalStatus");
        table1.addColumn("Address");
        table1.addColumn("Date");
        table1.addColumn("Phone");
        ViewPatienttableDoctorPanel.setModel(table1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewPatienttableDoctorPanel = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        btnviewpatientdoctorPanel = new javax.swing.JButton();
        btnInvoiceprinnt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/logout.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 30, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/homee.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 30, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View Patient");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 110, 30));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/lebelbackground.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 50));

        ViewPatienttableDoctorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ViewPatienttableDoctorPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ViewPatienttableDoctorPanel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 820, 240));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/red.jpg"))); // NOI18N
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 860, 10));

        btnviewpatientdoctorPanel.setBackground(new java.awt.Color(255, 255, 255));
        btnviewpatientdoctorPanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnviewpatientdoctorPanel.setForeground(new java.awt.Color(0, 170, 255));
        btnviewpatientdoctorPanel.setText("View");
        btnviewpatientdoctorPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnviewpatientdoctorPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnviewpatientdoctorPanelMouseExited(evt);
            }
        });
        btnviewpatientdoctorPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewpatientdoctorPanelActionPerformed(evt);
            }
        });
        getContentPane().add(btnviewpatientdoctorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 90, 30));

        btnInvoiceprinnt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInvoiceprinnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/print.png"))); // NOI18N
        btnInvoiceprinnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInvoiceprinntMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInvoiceprinntMouseExited(evt);
            }
        });
        btnInvoiceprinnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoiceprinntActionPerformed(evt);
            }
        });
        getContentPane().add(btnInvoiceprinnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 80, 40));

        setSize(new java.awt.Dimension(876, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new PatintDetlsDoctre().setVisible(true);
        dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new HomePage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnviewpatientdoctorPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewpatientdoctorPanelMouseEntered
        // TODO add your handling code here:
         btnviewpatientdoctorPanel.setBackground(new Color(0, 170, 255));
        btnviewpatientdoctorPanel.setForeground(Color.white);
    }//GEN-LAST:event_btnviewpatientdoctorPanelMouseEntered

    private void btnviewpatientdoctorPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewpatientdoctorPanelMouseExited
        // TODO add your handling code here:
          btnviewpatientdoctorPanel.setBackground(new Color(165,224,239));
        btnviewpatientdoctorPanel.setForeground(new Color(0, 170, 255));
    }//GEN-LAST:event_btnviewpatientdoctorPanelMouseExited

    private void btnviewpatientdoctorPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewpatientdoctorPanelActionPerformed
        // TODO add your handling code here:
          try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalbd", "root", "nh123456");
//         
            pst = con.prepareStatement("select * from addpatient");

            ResultSet rst = pst.executeQuery();

            table1.setRowCount(0);
            while (rst.next()) {
                data = new Object[]{rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9)};
                table1.addRow(data);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
      
    }//GEN-LAST:event_btnviewpatientdoctorPanelActionPerformed

    private void btnInvoiceprinntMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoiceprinntMouseEntered
        // TODO add your handling code here:
        btnInvoiceprinnt.setBackground(new Color(0, 150, 200));
        btnInvoiceprinnt.setForeground(Color.white);
    }//GEN-LAST:event_btnInvoiceprinntMouseEntered

    private void btnInvoiceprinntMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoiceprinntMouseExited
        // TODO add your handling code here:
        btnInvoiceprinnt.setBackground(Color.white);
        btnInvoiceprinnt.setForeground(new Color(0, 170, 255));
    }//GEN-LAST:event_btnInvoiceprinntMouseExited

    private void btnInvoiceprinntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoiceprinntActionPerformed
        MessageFormat header = new MessageFormat("I am a header of the print page");
        MessageFormat footer = new MessageFormat("I am a footer of the print page");
        try {
            ViewPatienttableDoctorPanel.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnInvoiceprinntActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPatientforDoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPatientforDoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPatientforDoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPatientforDoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPatientforDoctorPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ViewPatienttableDoctorPanel;
    private javax.swing.JButton btnInvoiceprinnt;
    private javax.swing.JButton btnviewpatientdoctorPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
