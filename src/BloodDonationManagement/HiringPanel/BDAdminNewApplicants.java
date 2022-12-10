/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BloodDonationManagement.HiringPanel;

import Main.MainLogin;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Applicant;
import model.system;

/**
 *
 * @author arpid
 */
public class BDAdminNewApplicants extends javax.swing.JFrame {

    /**
     * Creates new form BDAdminNewApplicants
     */
    system s;
    public BDAdminNewApplicants(system s) {
        initComponents();
        this.s = s;
        populateCentre();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        usertype = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        qualification = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        bloodcentre = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Age");

        jLabel3.setText("Contact:");

        jLabel4.setText("Email ID:");

        jButton1.setText("APPLY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Applicant ID:");

        jLabel6.setText("Blood Center:");

        jLabel7.setText("Gender:");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Female", "Male", "Other" }));

        jLabel8.setText("User Type:");

        usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Volunteer", "Paid Job", " " }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setText("Application");

        jLabel10.setText("Username:");

        jLabel11.setText("Qualification:");

        jLabel12.setText("Date:");

        jLabel13.setText("Password:");

        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bloodcentre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodcentreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(password)
                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(qualification)
                            .addComponent(contact)
                            .addComponent(age)
                            .addComponent(name)
                            .addComponent(emailid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usertype, javax.swing.GroupLayout.Alignment.LEADING, 0, 154, Short.MAX_VALUE)
                            .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloodcentre, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(usertype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bloodcentre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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

        for (Applicant epp:s.getApplicantdirectory().getApplicant()){
            if (s5 == (epp.getId())){
                flag=0;
                JOptionPane.showMessageDialog(this,"ID already exists, please fill the details again");

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
        String s8 = (String)bloodcentre.getSelectedItem();
        if(s8.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"BloodCentre field cannot be empty");
            return;
        }
        String s9 = date.getText();
        if(s9.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Date field cannot be empty");
            return;
        }
        String s10 = qualification.getText();
        if(s10.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Qualification field cannot be empty");
            return;
        }

        String s11 = username.getText();
        if(s11.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Username field cannot be empty");
            return;
        }

        for (Applicant ep:s.getApplicantdirectory().getApplicant()){
            if (s11.equals(ep.getUsername())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Username already exists, please try again");
            }

        }
        String s12 = password.getText();
        if(s12.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Password field cannot be empty");
            return;
        }

        for (Applicant ep1:s.getApplicantdirectory().getApplicant()){
            if (s12.equals(ep1.getPassword())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Password already exists, please try again");
            }
        }

        if(flag == 1)
        {

            Applicant pp = s.getApplicantdirectory().addNewApplicant();
            pp.setUsertype(s1);
            pp.setName(s2);
            pp.setAge(s3);
            pp.setGender(s4);
            pp.setId(s5);
            pp.setContact(s6);
            pp.setEmailid(s7);
            pp.setCentre(s8);
            pp.setDate(s9);
            pp.setQualification(s10);
            pp.setUsername(s11);
            pp.setPassword(s12);

            JOptionPane.showMessageDialog(this,"Applicant Profile created successfully");
        }

        name.setText("");
        age.setText("");
        gender.setSelectedItem("Select");
        id.setText("");
        contact.setText("");
        emailid.setText("");
        bloodcentre.setSelectedItem("Select");
        usertype.setSelectedItem("Select");
        date.setText("");
        qualification.setText("");
        username.setText("");
        password.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MainLogin sapframe = new MainLogin(s);
        sapframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bloodcentreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodcentreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodcentreActionPerformed

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
            java.util.logging.Logger.getLogger(BDAdminNewApplicants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BDAdminNewApplicants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BDAdminNewApplicants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BDAdminNewApplicants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new BDAdminNewApplicants().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> bloodcentre;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField date;
    private javax.swing.JTextField emailid;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField qualification;
    private javax.swing.JTextField username;
    private javax.swing.JComboBox<String> usertype;
    // End of variables declaration//GEN-END:variables

private void populateCentre(){
     String[] cc = s.getCentredirectory().CentreArray();
     DefaultComboBoxModel c = new DefaultComboBoxModel(cc);
     bloodcentre.setModel(c);
}

}