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
public class SearchInvoiceAdmiin extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    // List<Produk> plist;
    Object[] data;
    DefaultTableModel table1;



    /**
     *
     */
    public SearchInvoiceAdmiin() {
        initComponents();
         table1 = new DefaultTableModel();
        table1.addColumn("InvoicID");
        table1.addColumn("PatientID");
        table1.addColumn("Name");
        table1.addColumn("Phone");
        table1.addColumn("Date");
        table1.addColumn("BedCharge");
        table1.addColumn("DoctorCharge");
        table1.addColumn("PathologyChrage");
        table1.addColumn("Total");
        table1.addColumn("Discount");
        table1.addColumn("GrandTotal");
    
        SearchInvoicetable.setModel(table1);

    }

    public void patientSearch() {
        try {
            if(!InvoiceSearchBox.getText().equals("")){
                  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalbd", "root", "nh123456");
//         
            pst = con.prepareStatement("select * from invoice where InvoiceID=?");
            pst.setInt(1, Integer.parseInt(InvoiceSearchBox.getText()));

            ResultSet rst = pst.executeQuery();

            table1.setRowCount(0);
            while (rst.next()) {
                data = new Object[]{rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9),rst.getString(10),rst.getString(11)};
                table1.addRow(data);
            }
            
            }else{
                JOptionPane.showMessageDialog(null, "Invoice ID Is Requred");
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchInvoicetable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        btnInvoicesearch = new javax.swing.JButton();
        InvoiceSearchBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
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
        jLabel2.setText("Search Invoice");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 120, 30));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/lebelbackground.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 50));

        SearchInvoicetable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SearchInvoicetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(SearchInvoicetable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 820, 200));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/red.jpg"))); // NOI18N
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 860, 10));

        btnInvoicesearch.setBackground(new java.awt.Color(255, 255, 255));
        btnInvoicesearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInvoicesearch.setForeground(new java.awt.Color(0, 170, 255));
        btnInvoicesearch.setText("Search");
        btnInvoicesearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInvoicesearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInvoicesearchMouseExited(evt);
            }
        });
        btnInvoicesearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoicesearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnInvoicesearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 90, 30));

        InvoiceSearchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InvoiceSearchBoxKeyReleased(evt);
            }
        });
        getContentPane().add(InvoiceSearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 250, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Invoice ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 70, 30));

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

        setSize(new java.awt.Dimension(876, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new InvoiceDetailsAdmin().setVisible(true);
       dispose();
      
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new HomePage().setVisible(true);
           dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnInvoicesearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoicesearchMouseEntered
        // TODO add your handling code here:
        btnInvoicesearch.setBackground(new Color(0, 170, 255));
        btnInvoicesearch.setForeground(Color.white);
    }//GEN-LAST:event_btnInvoicesearchMouseEntered

    private void btnInvoicesearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoicesearchMouseExited
        // TODO add your handling code here:
        btnInvoicesearch.setBackground(new Color(165, 224, 239));
        btnInvoicesearch.setForeground(new Color(0, 170, 255));
    }//GEN-LAST:event_btnInvoicesearchMouseExited

    private void btnInvoicesearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoicesearchActionPerformed
        // TODO add your handling code here:
        patientSearch();

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


    }//GEN-LAST:event_btnInvoicesearchActionPerformed

    private void InvoiceSearchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InvoiceSearchBoxKeyReleased
        // TODO add your handling code here:
        
          
    }//GEN-LAST:event_InvoiceSearchBoxKeyReleased

    private void btnInvoiceprinntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoiceprinntActionPerformed
 MessageFormat header = new MessageFormat("I am a header of the print page");
        MessageFormat footer = new MessageFormat("I am a footer of the print page");
        try {
            SearchInvoicetable.print(JTable.PrintMode.NORMAL, header, footer);
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
            java.util.logging.Logger.getLogger(SearchInvoiceAdmiin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchInvoiceAdmiin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchInvoiceAdmiin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchInvoiceAdmiin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new SearchInvoiceAdmiin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InvoiceSearchBox;
    private javax.swing.JTable SearchInvoicetable;
    private javax.swing.JButton btnInvoiceprinnt;
    private javax.swing.JButton btnInvoicesearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
