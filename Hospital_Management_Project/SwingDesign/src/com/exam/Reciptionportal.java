/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.awt.Color;

/**
 *
 * @author user
 */
public class Reciptionportal extends javax.swing.JFrame {

    public Reciptionportal() {
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

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        DD1 = new javax.swing.JButton();
        PD1 = new javax.swing.JButton();
        CP1 = new javax.swing.JButton();
        LO1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DD2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/red.jpg"))); // NOI18N
        jButton3.setBorder(null);
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 420, 860, 10);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/homee.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(773, 30, 50, 30);

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DD1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/prescroption.png"))); // NOI18N
        DD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DD1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DD1MouseExited(evt);
            }
        });
        DD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DD1ActionPerformed(evt);
            }
        });
        jPanel1.add(DD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 140, 90));

        PD1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/patient.png"))); // NOI18N
        PD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PD1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PD1MouseExited(evt);
            }
        });
        PD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PD1ActionPerformed(evt);
            }
        });
        jPanel1.add(PD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 90));

        CP1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/appointment.png"))); // NOI18N
        CP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CP1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CP1MouseExited(evt);
            }
        });
        CP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CP1ActionPerformed(evt);
            }
        });
        jPanel1.add(CP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 140, 90));

        LO1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LO1.setText("LogOut");
        LO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LO1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LO1MouseExited(evt);
            }
        });
        LO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LO1ActionPerformed(evt);
            }
        });
        jPanel1.add(LO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 90, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 170, 255));
        jLabel2.setText("Patient Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 170, 255));
        jLabel3.setText("Appoinment Details");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 170, 255));
        jLabel4.setText("Prescription");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        DD2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/invoiceeee.jpg"))); // NOI18N
        DD2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DD2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DD2MouseExited(evt);
            }
        });
        DD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DD2ActionPerformed(evt);
            }
        });
        jPanel1.add(DD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 140, 90));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 170, 255));
        jLabel5.setText("Invoice Details");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 140, 640, 230);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Image/ReceptionBG.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 860, 430);

        setSize(new java.awt.Dimension(876, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CP1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CP1MouseEntered
        // TODO add your handling code here:
        CP1.setBackground(new Color(0, 150, 200));
        CP1.setForeground(Color.white);
    }//GEN-LAST:event_CP1MouseEntered

    private void CP1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CP1MouseExited
        // TODO add your handling code here:
        CP1.setBackground(Color.white);
        CP1.setForeground(new Color(0, 170, 255));
    }//GEN-LAST:event_CP1MouseExited

    private void DD1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DD1MouseEntered
        // TODO add your handling code here:
        DD1.setBackground(new Color(0, 150, 200));
        DD1.setForeground(Color.white);
    }//GEN-LAST:event_DD1MouseEntered

    private void DD1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DD1MouseExited
        // TODO add your handling code here:
        DD1.setBackground(Color.white);
        DD1.setForeground(new Color(0, 170, 255));
    }//GEN-LAST:event_DD1MouseExited

    private void PD1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PD1MouseEntered
        // TODO add your handling code here:
        PD1.setBackground(new Color(0, 150, 200));
        PD1.setForeground(Color.white);
    }//GEN-LAST:event_PD1MouseEntered

    private void PD1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PD1MouseExited
        // TODO add your handling code here:
        PD1.setBackground(Color.white);
        PD1.setForeground(new Color(0, 170, 255));
    }//GEN-LAST:event_PD1MouseExited

    private void LO1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LO1MouseEntered
        // TODO add your handling code here:
        LO1.setBackground(new Color(0, 150, 200));
        LO1.setForeground(Color.white);
    }//GEN-LAST:event_LO1MouseEntered

    private void LO1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LO1MouseExited
        // TODO add your handling code here:
        LO1.setBackground(Color.white);
        LO1.setForeground(new Color(0, 170, 255));
    }//GEN-LAST:event_LO1MouseExited

    private void PD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PD1ActionPerformed
        // TODO add your handling code here:
        new PatientDetails().setVisible(true);
        dispose();
    }//GEN-LAST:event_PD1ActionPerformed

    private void LO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LO1ActionPerformed
        // TODO add your handling code here:
        new Reciptionistlogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_LO1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new HomePage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DD1ActionPerformed
        // TODO add your handling code here:
        new PrescptondetlsRecpton().setVisible(true);
        dispose();
    }//GEN-LAST:event_DD1ActionPerformed

    private void CP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CP1ActionPerformed
        // TODO add your handling code here:
        new AppinmenttDetailss().setVisible(true);
        dispose();
    }//GEN-LAST:event_CP1ActionPerformed

    private void DD2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DD2MouseEntered
        // TODO add your handling code here:
          DD2.setBackground(new Color(0, 150, 200));
        DD2.setForeground(Color.white);
    }//GEN-LAST:event_DD2MouseEntered

    private void DD2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DD2MouseExited
        // TODO add your handling code here:
        DD2.setBackground(Color.white);
        DD2.setForeground(new Color(0, 170, 255));
    }//GEN-LAST:event_DD2MouseExited

    private void DD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DD2ActionPerformed
        // TODO add your handling code here:
        new InvoiceDetails().setVisible(true);
        dispose();
    }//GEN-LAST:event_DD2ActionPerformed

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
            java.util.logging.Logger.getLogger(Reciptionportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reciptionportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reciptionportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reciptionportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reciptionportal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CP1;
    private javax.swing.JButton DD1;
    private javax.swing.JButton DD2;
    private javax.swing.JButton LO1;
    private javax.swing.JButton PD1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
