/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HospitalManagement.Pharmacy;

import HospitalManagement.HMPharmacyLogin;
import Main.MainLogin;
import model.Pharmacy;
import model.system;

/**
 *
 * @author arpid
 */
public class HMPharmacyOwner extends javax.swing.JFrame {

    /**
     * Creates new form HMPharmacyOwner
     */
    system s;
    public HMPharmacyOwner(system s) {
        initComponents();
        this.s = s;
//        this.setExtendedState(HMPharmacyOwner.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HMPOwnerSplit = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        display1 = new javax.swing.JLabel();
        display = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 800));

        HMPOwnerSplit.setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("Billing");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton4.setText("Main Page");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HospitalManagement/Pharmacy/p pages.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        HMPOwnerSplit.setLeftComponent(jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel2.add(display1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 66, 43));

        display.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        display.setText("Hi");
        jPanel2.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 56, 66, 43));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HospitalManagement/Pharmacy/p pages.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, -1));

        HMPOwnerSplit.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HMPOwnerSplit, javax.swing.GroupLayout.DEFAULT_SIZE, 1365, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HMPOwnerSplit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HMPOwnerProfile sapframe = new HMPOwnerProfile(s);
        HMPOwnerSplit.setRightComponent(sapframe);
        HMPOwnerProfile.username.setText(display1.getText());
        for (Pharmacy epp:s.getPharmacydirectory().getPharmacy()){
             if(HMPOwnerProfile.username.getText().equals(epp.getUsername())){
                HMPOwnerProfile.name.setText(String.valueOf(epp.getName()));
                HMPOwnerProfile.pharmacyid.setText(String.valueOf(epp.getPharmacyId()));
                HMPOwnerProfile.emailid.setText(String.valueOf(epp.getEmailid()));
                HMPOwnerProfile.location.setText(String.valueOf(epp.getLocation()));
                HMPOwnerProfile.contact.setText(String.valueOf(epp.getContact()));
                HMPOwnerProfile.username.setText(String.valueOf(epp.getUsername()));
                HMPOwnerProfile.password.setText(String.valueOf(epp.getPassword()));
             }
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        HMPOwnerOrders sapframe = new HMPOwnerOrders(s);
        HMPOwnerSplit.setRightComponent(sapframe);
        HMPOwnerOrders.pharmacyusername.setText(display1.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         MainLogin sapframe = new MainLogin(s);
        sapframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        HMPharmacyLogin sapframe = new HMPharmacyLogin(s);
        sapframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(HMPharmacyOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HMPharmacyOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HMPharmacyOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HMPharmacyOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new HMPharmacyOwner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane HMPOwnerSplit;
    private javax.swing.JLabel display;
    public static javax.swing.JLabel display1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
