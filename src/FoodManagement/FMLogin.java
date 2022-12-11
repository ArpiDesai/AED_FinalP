/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FoodManagement;

import DB4OUtilConn.DB40Util;
import javax.swing.JOptionPane;
import model.Hotel;
import model.system;

/**
 *
 * @author arpid
 */
public class FMLogin extends javax.swing.JFrame {

    /**
     * Creates new form FMLogin
     */
    system s;
    private DB40Util dB4OUtil = DB40Util.getInstance();
    public FMLogin(system s) {
        initComponents();
        this.s = s;
         s = dB4OUtil.retrieveSystem();
         this.setExtendedState(FMLogin.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        role = new javax.swing.JComboBox<>();
        login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Role:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 80, -1));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 140, 30));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 140, 30));

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Food Manager", "Owner" }));
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, 140, 30));

        login.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 90, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome to the Food Management System\n");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 20, 620, -1));

        logout.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 90, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton2.setText("HOME");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 590, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodManagement/food wallpaperr.jpg"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String user = username.getText();
        String pass = password.getText();
        String rol = (String)role.getSelectedItem();
        if(user.equals("admin") && pass.equals("123") && rol.equals("Food Manager"))
        {
            JOptionPane.showMessageDialog(null," Food Management Login Successful");
            FMManager sapframe = new FMManager(s);
            sapframe.setVisible(true);
            this.setVisible(false);
            //            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            //            this.dispose();

        }
         else if(rol.equals("Owner")){
             for(Hotel ep2: s.getHoteldirectory().getHotel())
            {
                if(user.equals(ep2.getUsername()) && pass.equals(ep2.getPassword()))
                {
                    JOptionPane.showMessageDialog(null," Owner Login Successful");
                    FMOwner dframe = new FMOwner(s);
                    dframe.setVisible(true);
                    this.setVisible(false);
                    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
                    this.dispose();
                    FMOwner x = new FMOwner(s);
                    FMOwner.display1.setText(username.getText());
                    x.setVisible(true);
                }
            }  
         }
    }//GEN-LAST:event_loginActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        logout.setEnabled(false);
        username.setEnabled(true);
        password.setEnabled(true);
        role.setEnabled(true);
        login.setEnabled(true);

        username.setText("");
        password.setText("");
        role.setSelectedItem("Select");
        
        dB4OUtil.storeSystem(s);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(FMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new FMLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JButton logout;
    private javax.swing.JTextField password;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
