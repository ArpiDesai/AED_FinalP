/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BloodDonationManagement.Donor;



import BloodDonationManagement.loginBD;
import Main.MainLogin;
import javax.swing.JOptionPane;
import model.Donor;
import model.Receiver;
import model.system;

/**
 *
 * @author arpid
 */
public class BDNewUserPanel extends javax.swing.JFrame {

    /**
     * Creates new form BDNewUserPanel
     */
    
    private system s;
    public BDNewUserPanel(system s ){
        initComponents();
        this.s = s;
         this.setExtendedState(BDNewUserPanel.MAXIMIZED_BOTH);

        
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
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        emailid = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        bloodgroup = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        usertype = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 114, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Age");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 142, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Contact:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 244, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Email ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 278, -1, -1));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 111, 152, -1));

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 139, 152, -1));
        jPanel1.add(emailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 275, 152, -1));
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 241, 152, -1));

        jButton1.setText("CREATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 426, 153, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 210, -1, -1));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 207, 152, -1));
        jPanel1.add(bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 309, 152, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Blood Group:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 312, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Gender:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 176, -1, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Female", "Male", "Other" }));
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 173, 152, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("User Type:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 86, -1, -1));

        usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Donor", "Receiver" }));
        jPanel1.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 83, 152, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setText("Sign Up Here");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 14, -1, 42));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Password:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 378, -1, -1));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 375, 152, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Username:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 346, -1, -1));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 343, 152, -1));

        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 40, 109, -1));

        jButton3.setText("MAIN PAGE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 109, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonationManagement/a7.jpg"))); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int flag =1;
        String s1 = (String)usertype.getSelectedItem();
        if(s1.equals("select"))
        {
           flag=0;
           JOptionPane.showMessageDialog(this,"UserType field cannot be empty");
           return;                     
        } 
        String s2 = name.getText(); 
        if(s2.equals(""))
        {
           flag=0;
           JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
           return;                     
        }   
        char[] chars = s2.toCharArray();
        for(char c : chars)
        {
            if(Character.isDigit(c))
            {
               flag=0;
               JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
               return;   
            }
        }
        
        
        String ss3 = age.getText();             
        
        if(ss3.equals(""))
        {
            flag=0;
           JOptionPane.showMessageDialog(this,"Age field cannot be empty or contain alphabet"); 
           return;
        }
        char[] chars1 = ss3.toCharArray();
        for(char c : chars1)
        {
            if(Character.isAlphabetic(c))
            {
               flag=0;
               JOptionPane.showMessageDialog(this,"Age field cannot be empty or contain alphabet"); 
               return;   
            }
        }
        int s3 = Integer.parseInt(ss3);
        if (s1.equals("Donor")){
            if((s3<18) || (s3>60)){
                   JOptionPane.showMessageDialog(this,"Age must be between 18 to 60");          
        }
        }
        String s4 = (String)gender.getSelectedItem();
        if(s4.equals("select"))
        {
            flag=0;
           JOptionPane.showMessageDialog(this,"Gender field cannot be empty");  
           return;
        }
        String ss5 = id.getText();
        
        if(ss5.equals(""))
            {
            flag=0;
           JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet"); 
           return;
            }
        char[] chars3 = ss5.toCharArray();
        for(char c : chars3)
        {
            if(Character.isAlphabetic(c))
            {
               flag=0;
               JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet"); 
               return;   
            }
        }
        int s5 = Integer.parseInt(ss5);
        if(s1.equals("Donor")){
            for (Donor epp:s.getDonordirectory().getDonor()){
                if (s5 == (epp.getId())){
                   flag=0;                
                 JOptionPane.showMessageDialog(this,"ID already exists, please fill the details again");
                }
            }
        }
        else if (s1.equals("Receiver")){
                for (Receiver epp:s.getReceiverdirectory().getReceiver()){
                if (s5 == (epp.getId())){
                   flag=0;                
                 JOptionPane.showMessageDialog(this,"ID already exists, please fill the details again");
                }
                
                }
        }
        String ss6 =  contact.getText();
        
        if(ss6.equals(""))
        {
            flag=0;
           JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet"); 
           return;
         }
        if(ss6.length()!=10)
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Cell phone number must be 10 digits");  
            return;
        }
        char[] chars5 = ss6.toCharArray();
        for(char c : chars5)
        {
            if(Character.isAlphabetic(c))
            {
               flag=0;
               JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet"); 
               return;   
            }
        }
        long s6 = Long.parseLong(ss6);
        String s7 = emailid.getText();
        if(s7.equals(""))
        {
           flag=0;
           JOptionPane.showMessageDialog(this,"EmailId field cannot be empty");
           return;                     
        } 
        String s8 = bloodgroup.getText();
        if(s8.equals(""))
        {
           flag=0;
           JOptionPane.showMessageDialog(this,"BloodGroup field cannot be empty");
           return;                     
        } 
        
        String s9 = username.getText();
        if(s9.equals(""))
        {
           flag=0;
           JOptionPane.showMessageDialog(this,"Username field cannot be empty");
           return;                     
        } 
        if (s1.equals("Donor")){            
        
            for (Donor ep:s.getDonordirectory().getDonor()){
               if (s9.equals(ep.getUsername())){
                  flag=0;                
                JOptionPane.showMessageDialog(this,"Username already exists, please try again");
               }
            }
        } 
        else if(s1.equals("Receiver")){
            for (Receiver ep:s.getReceiverdirectory().getReceiver()){
               if (s9.equals(ep.getUsername())){
                  flag=0;                
                JOptionPane.showMessageDialog(this,"Username already exists, please try again");
               }
            }
            
        }
            String s10 = password.getText();
             if(s10.equals(""))
        {
           flag=0;
           JOptionPane.showMessageDialog(this,"Password field cannot be empty");
           return;                     
        } 
        if (s1.equals("Donor")){
            for (Donor ep1:s.getDonordirectory().getDonor()){
                if (s10.equals(ep1.getPassword())){
                  flag=0;                
                JOptionPane.showMessageDialog(this,"Password already exists, please try again");
               }
        }
        }
        else if(s1.equals("Receiver")){
            for (Receiver ep1:s.getReceiverdirectory().getReceiver()){
                if (s10.equals(ep1.getPassword())){
                  flag=0;                
                JOptionPane.showMessageDialog(this,"Password already exists, please try again");
               }              
                    
               }
        
        } 

        
       
        if(flag == 1)
        {
            if (s1.equals("Donor")){
                Donor pp = s.getDonordirectory().addNewD();
                pp.setUserType(s1);   
                pp.setName(s2);
                pp.setAge(s3);
                pp.setGender(s4);
                pp.setId(s5);   
                pp.setContact(s6);
                pp.setEmailId(s7);
                pp.setBloodGroup(s8);                  
                pp.setUsername(s9);
                pp.setPassword(s10);             
         
                JOptionPane.showMessageDialog(this,"Donor Profile created successfully");  
         }
            else if(s1.equals("Receiver")){
                Receiver pp = s.getReceiverdirectory().addNewR();
                pp.setUserType(s1);   
                pp.setName(s2);
                pp.setAge(s3);
                pp.setGender(s4);
                pp.setId(s5);   
                pp.setContact(s6);
                pp.setEmailId(s7);
                pp.setBloodGroup(s8);                  
                pp.setUsername(s9);
                pp.setPassword(s10);             
         
                JOptionPane.showMessageDialog(this,"Receiver Profile created successfully"); 
            }
          
        }
        name.setText("");
        age.setText("");
        gender.setSelectedItem("Select");
        id.setText("");
        contact.setText("");
        emailid.setText("");
        bloodgroup.setText("");                    
        usertype.setSelectedItem("Select");
        username.setText("");
        password.setText(""); 
        
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         MainLogin sapframe = new MainLogin(s);
        sapframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        loginBD sapframe = new loginBD(s);
        sapframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(BDNewUserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BDNewUserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BDNewUserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BDNewUserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new BDNewUserPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField bloodgroup;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField emailid;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    private javax.swing.JComboBox<String> usertype;
    // End of variables declaration//GEN-END:variables
}
