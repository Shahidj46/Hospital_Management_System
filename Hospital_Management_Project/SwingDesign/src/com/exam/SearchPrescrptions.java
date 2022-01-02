/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
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
public class SearchPrescrptions extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    // List<Produk> plist;
    Object[] data;
    DefaultTableModel table1;

    /**
     *
     */
    public SearchPrescrptions() {
        initComponents();
        table1 = new DefaultTableModel();
        table1.addColumn("PrescrptionID");
        table1.addColumn("DoctorID");
        table1.addColumn("DoctorName");
        table1.addColumn("PatientID");
        table1.addColumn("PatintName");
        table1.addColumn("Tab-01");
        table1.addColumn("Dose");
        table1.addColumn("Tab-02");
        table1.addColumn("Dose");
        table1.addColumn("Tab-03");
        table1.addColumn("Dose");
        table1.addColumn("Syrup-01");
        table1.addColumn("Month");
        table1.addColumn("Syrup-02");
        table1.addColumn("Month");
        table1.addColumn("Test-01");
        table1.addColumn("Test-02");
        table1.addColumn("Date");

        SearchPrescriptiontable.setModel(table1);

    }

    public void Appoinmentsearchbyid() {
        try {
            if (!txtsearchprescription.getText().equals("")) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalbd", "root", "nh123456");
//         
                pst = con.prepareStatement("select * from prescription where PrescriptionID=?");
                pst.setInt(1, Integer.parseInt(txtsearchprescription.getText()));

                ResultSet rst = pst.executeQuery();

                table1.setRowCount(0);
                while (rst.next()) {
                    data = new Object[]{rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getString(13), rst.getString(14), rst.getString(15), rst.getString(16), rst.getString(17), rst.getDate(18)};
                    table1.addRow(data);
                }

            } else {
                JOptionPane.showMessageDialog(null, "PrescriptionID ID Is Requred");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void Appoinmentsearchbyname() {
        try {
            if (!txtsearchprescription.getText().equals("")) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalbd", "root", "nh123456");
//         
                pst = con.prepareStatement("select * from prescription where PatientName=?");
                pst.setString(1, txtsearchprescription.getText());

                ResultSet rst = pst.executeQuery();

                table1.setRowCount(0);
                while (rst.next()) {
                    data = new Object[]{rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getString(13), rst.getString(14), rst.getString(15), rst.getString(16), rst.getString(17), rst.getDate(18)};
                    table1.addRow(data);
                }

            } else {
                JOptionPane.showMessageDialog(null, "PatientName ID Is Requred");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void Appoinmentsearchbydate() {
        try {
            if (!txtsearchprescription.getText().equals("")) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalbd", "root", "nh123456");
//         
                pst = con.prepareStatement("select * from prescription where Date=?");
                pst.setDate(1, Date.valueOf(txtsearchprescription.getText()));

                ResultSet rst = pst.executeQuery();

                table1.setRowCount(0);
                while (rst.next()) {
                    data = new Object[]{rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getString(13), rst.getString(14), rst.getString(15), rst.getString(16), rst.getString(17), rst.getDate(18)};
                    table1.addRow(data);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Date ID Is Requred");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchPrescriptiontable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        btntxtsearchprescrption = new javax.swing.JButton();
        txtsearchprescription = new javax.swing.JTextField();
        btnInvoiceprinnt = new javax.swing.JButton();
        dateep = new javax.swing.JRadioButton();
        iddp = new javax.swing.JRadioButton();
        PatientNamep = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Prescription");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 210, 30));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/lebelbackground.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 50));

        SearchPrescriptiontable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SearchPrescriptiontable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(SearchPrescriptiontable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 820, 200));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/red.jpg"))); // NOI18N
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 860, 10));

        btntxtsearchprescrption.setBackground(new java.awt.Color(255, 255, 255));
        btntxtsearchprescrption.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btntxtsearchprescrption.setForeground(new java.awt.Color(0, 170, 255));
        btntxtsearchprescrption.setText("Search");
        btntxtsearchprescrption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntxtsearchprescrptionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntxtsearchprescrptionMouseExited(evt);
            }
        });
        btntxtsearchprescrption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntxtsearchprescrptionActionPerformed(evt);
            }
        });
        getContentPane().add(btntxtsearchprescrption, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 90, 30));

        txtsearchprescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchprescriptionKeyReleased(evt);
            }
        });
        getContentPane().add(txtsearchprescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 150, 30));

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
        getContentPane().add(btnInvoiceprinnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 80, 40));

        buttonGroup1.add(dateep);
        dateep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateep.setForeground(new java.awt.Color(0, 170, 255));
        dateep.setText("Date");
        getContentPane().add(dateep, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, 30));

        buttonGroup1.add(iddp);
        iddp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iddp.setForeground(new java.awt.Color(0, 170, 255));
        iddp.setText("PrescptonID");
        getContentPane().add(iddp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, 30));

        buttonGroup1.add(PatientNamep);
        PatientNamep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PatientNamep.setForeground(new java.awt.Color(0, 170, 255));
        PatientNamep.setText("PatientName");
        getContentPane().add(PatientNamep, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, 30));

        jPanel1.setBackground(new java.awt.Color(0, 170, 240));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search By");
        jPanel1.add(jLabel3);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, 30));

        setSize(new java.awt.Dimension(876, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Prescriptiondetails().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new HomePage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btntxtsearchprescrptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntxtsearchprescrptionMouseEntered
        // TODO add your handling code here:
        btntxtsearchprescrption.setBackground(new Color(0, 170, 255));
        btntxtsearchprescrption.setForeground(Color.white);
    }//GEN-LAST:event_btntxtsearchprescrptionMouseEntered

    private void btntxtsearchprescrptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntxtsearchprescrptionMouseExited
        // TODO add your handling code here:
        btntxtsearchprescrption.setBackground(new Color(165, 224, 239));
        btntxtsearchprescrption.setForeground(new Color(0, 170, 255));
    }//GEN-LAST:event_btntxtsearchprescrptionMouseExited

    private void btntxtsearchprescrptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntxtsearchprescrptionActionPerformed
        // TODO add your handling code here:

        if (iddp.isSelected()) {
            Appoinmentsearchbyid();

        }
        if (PatientNamep.isSelected()) {
            Appoinmentsearchbyname();

        }
        if (dateep.isSelected()) {
            Appoinmentsearchbydate();

        }

//    
//        try {
//
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalbd", "root", "nh123456");
//
//            pst = con.prepareStatement("select * from addpatient where PatientID=?");
//            pst.setInt(1, Integer.parseInt(PatientSearchBox.getText()));
//            ResultSet rst = pst.executeQuery();
//            table1.setRowCount(0);
//       
//            while (rst.next()) {
//                int idd = rst.getInt("PatientID");
//                String nam = rst.getString("Name");
//                String agee = rst.getString("Age");
//                String depatmnt = rst.getString("Department");
//                String gndr = rst.getString("Gender");
//                String married = rst.getString("MaritalStatus");
//                String adress = rst.getString("Address");
//                String dte = rst.getString("Date");
//                String phn = rst.getString("Phone");
//                table1.addRow(new Object[]{idd,nam, agee, depatmnt, gndr, married, adress, dte, phn});
//            }
//
//        } catch (Exception e) {
//        }

    }//GEN-LAST:event_btntxtsearchprescrptionActionPerformed

    private void txtsearchprescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchprescriptionKeyReleased
        // TODO add your handling code here:


    }//GEN-LAST:event_txtsearchprescriptionKeyReleased

    private void btnInvoiceprinntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoiceprinntActionPerformed
        MessageFormat header = new MessageFormat("I am a header of the print page");
        MessageFormat footer = new MessageFormat("I am a footer of the print page");
        try {
            SearchPrescriptiontable.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnInvoiceprinntActionPerformed

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
            java.util.logging.Logger.getLogger(SearchPrescrptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchPrescrptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchPrescrptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchPrescrptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchPrescrptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton PatientNamep;
    private javax.swing.JTable SearchPrescriptiontable;
    private javax.swing.JButton btnInvoiceprinnt;
    private javax.swing.JButton btntxtsearchprescrption;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton dateep;
    private javax.swing.JRadioButton iddp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtsearchprescription;
    // End of variables declaration//GEN-END:variables
}
