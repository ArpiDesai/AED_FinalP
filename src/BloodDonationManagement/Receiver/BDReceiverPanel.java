/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BloodDonationManagement.Receiver;

import Main.MainLogin;
import model.Receiver;
import model.system;

/**
 *
 * @author arpid
 */
public class BDReceiverPanel extends javax.swing.JFrame {

    /**
     * Creates new form BDReceiverPanel
     */
    private system s;
    public BDReceiverPanel(system s) {
        initComponents();
        this.s = s;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BDReceiverSplit = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        display = new javax.swing.JLabel();
        display1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        notification = new javax.swing.JButton();
        faq = new javax.swing.JButton();
        history = new javax.swing.JButton();
        slot = new javax.swing.JButton();
        avilability = new javax.swing.JButton();
        profile = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(492, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BDReceiverSplit.setRightComponent(jPanel3);

        notification.setText("Notification");
        notification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationActionPerformed(evt);
            }
        });

        faq.setText("FAQ");
        faq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqActionPerformed(evt);
            }
        });

        history.setText("History");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        slot.setText("Book a Slot");
        slot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slotActionPerformed(evt);
            }
        });

        avilability.setText("Availability");
        avilability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avilabilityActionPerformed(evt);
            }
        });

        profile.setText("Profile");
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Upcoming Events");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(history, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(avilability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(faq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(notification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(slot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(profile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(avilability)
                .addGap(18, 18, 18)
                .addComponent(slot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(history)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(faq)
                .addGap(18, 18, 18)
                .addComponent(notification)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(417, Short.MAX_VALUE))
        );

        BDReceiverSplit.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BDReceiverSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BDReceiverSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationActionPerformed
        // TODO add your handling code here:
        BDReceiverNotificationsPanel sapframe = new BDReceiverNotificationsPanel(s);
        BDReceiverSplit.setRightComponent(sapframe);
    }//GEN-LAST:event_notificationActionPerformed

    private void faqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqActionPerformed
        // TODO add your handling code here:
        BDReceiverFAQPanel sapframe = new BDReceiverFAQPanel(s);
        BDReceiverSplit.setRightComponent(sapframe);
    }//GEN-LAST:event_faqActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        // TODO add your handling code here:
        BDReceiverHistoryPanel sapframe = new BDReceiverHistoryPanel();
        BDReceiverSplit.setRightComponent(sapframe);
    }//GEN-LAST:event_historyActionPerformed

    private void slotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slotActionPerformed
        // TODO add your handling code here:
        BDReceiverSlotPanel sapframe = new BDReceiverSlotPanel(s);
        BDReceiverSplit.setRightComponent(sapframe);
         for (Receiver epp:s.getReceiverdirectory().getReceiver()){
            if(BDReceiverSlotPanel.username.getText().equals(epp.getUsername())){
                BDReceiverSlotPanel.name.setText(String.valueOf(epp.getName()));
                BDReceiverSlotPanel.age.setText(String.valueOf(epp.getAge()));
                BDReceiverSlotPanel.gender.setSelectedItem(String.valueOf(epp.getGender()));                
                BDReceiverSlotPanel.receiverid.setText(String.valueOf(epp.getId()));
                BDReceiverSlotPanel.emailid.setText(String.valueOf(epp.getEmailId()));
                BDReceiverSlotPanel.bloodgroup.setText(String.valueOf(epp.getBloodGroup()));
                BDReceiverSlotPanel.contact.setText(String.valueOf(epp.getContact()));
//                BDDonorProfilePanel.username.setText(String.valueOf(selectedep.getUsername()));
                
               }
        }
        
    }//GEN-LAST:event_slotActionPerformed

    private void avilabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avilabilityActionPerformed
        // TODO add your handling code here:
        BDReceiverAvailabilityPanel sapframe = new BDReceiverAvailabilityPanel();
        BDReceiverSplit.setRightComponent(sapframe);
    }//GEN-LAST:event_avilabilityActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        // TODO add your handling code here:
        BDReceiverProfilePanel sapframe = new  BDReceiverProfilePanel(s);
        BDReceiverSplit.setRightComponent(sapframe);
        BDReceiverProfilePanel.username.setText(display1.getText());
        for (Receiver epp:s.getReceiverdirectory().getReceiver()){
            if(BDReceiverProfilePanel.username.getText().equals(epp.getUsername())){
                BDReceiverProfilePanel.name.setText(String.valueOf(epp.getName()));
                BDReceiverProfilePanel.age.setText(String.valueOf(epp.getAge()));
                BDReceiverProfilePanel.gender.setSelectedItem(String.valueOf(epp.getGender()));
                BDReceiverProfilePanel.usertype.setSelectedItem(String.valueOf(epp.getUserType()));
                BDReceiverProfilePanel.id.setText(String.valueOf(epp.getId()));
                BDReceiverProfilePanel.emailid.setText(String.valueOf(epp.getEmailId()));
                BDReceiverProfilePanel.bloodgroup.setText(String.valueOf(epp.getBloodGroup()));
                BDReceiverProfilePanel.contact.setText(String.valueOf(epp.getContact()));
//                BDDonorProfilePanel.username.setText(String.valueOf(selectedep.getUsername()));
                BDReceiverProfilePanel.password.setText(String.valueOf(epp.getPassword()));
               }
        }
    }//GEN-LAST:event_profileActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          MainLogin sapframe = new MainLogin(s);
        sapframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BDReceiverPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BDReceiverPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BDReceiverPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BDReceiverPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new BDReceiverPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane BDReceiverSplit;
    private javax.swing.JButton avilability;
    public static javax.swing.JLabel display;
    public static javax.swing.JLabel display1;
    private javax.swing.JButton faq;
    private javax.swing.JButton history;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton notification;
    private javax.swing.JButton profile;
    private javax.swing.JButton slot;
    // End of variables declaration//GEN-END:variables
}
