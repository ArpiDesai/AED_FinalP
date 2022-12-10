/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HospitalManagement.Doctor;

import javax.swing.JOptionPane;
import model.Doctor;
import model.system;

/**
 *
 * @author arpid
 */
public class HMHDProfile extends javax.swing.JPanel {

    /**
     * Creates new form HMHDProfile
     */
    system s;
    public HMHDProfile(system s) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        doctorid = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        hospitalid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        doctorname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        hospitalname = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        jLabel1.setText("Age:");

        jLabel2.setText("Doctor ID:");

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Hospital ID:");

        jLabel6.setText("Hospital Name:");

        jLabel7.setText("Doctor Name:");

        jLabel8.setText("Location:");

        jLabel9.setText("Username:");

        jLabel10.setText("Password:");

        jLabel11.setText("Gender:");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Female", "Male", "Others" }));

        jLabel12.setText("Contact:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel13.setText("User Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(location, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(doctorid, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doctorname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)))
                        .addGap(77, 77, 77))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hospitalid, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(hospitalname, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)))
                .addComponent(jButton2)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(251, 251, 251))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel13)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hospitalid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hospitalname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(doctorid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(doctorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Doctor ep = null;
        for (Doctor epp:s.getDoctordirectory().getDoctor()){
            if (username.getText().equals(epp.getUsername())){
                ep = epp;
            }
        }
        s.getDoctordirectory().deleteDoctor(ep);

        int flag =1;
        String ss1 = hospitalid.getText();

        if(ss1.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
            return;
        }
        char[] chars3 = ss1.toCharArray();
        for(char c : chars3)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
                return;
            }
        }
        int s1 = Integer.parseInt(ss1);
        String s2 = (String)hospitalname.getSelectedItem();
        if(s2.equals("Select"))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
            return;
        }

        String ss3 = doctorid.getText();

        if(ss3.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
            return;
        }
        char[] chars6 = ss3.toCharArray();
        for(char c : chars3)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
                return;
            }
        }
        int s3 = Integer.parseInt(ss3);
        for (Doctor epp:s.getDoctordirectory().getDoctor()){
            if (s3 == (epp.getDoctorid())){
                flag=0;
                JOptionPane.showMessageDialog(this,"ID already exists, please fill the details again");
            }
        }

        String s4 = doctorname.getText();
        if(s4.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
            return;
        }

        String ss5 = age.getText();

        if(ss5.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Age field cannot be empty or contain alphabet");
            return;
        }
        char[] chars1 = ss5.toCharArray();
        for(char c : chars1)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Age field cannot be empty or contain alphabet");
                return;
            }
        }
        int s5 = Integer.parseInt(ss5);

        String s6 = (String)gender.getSelectedItem();
        if(s6.equals("Select"))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Gender field cannot be empty");
            return;
        }

        String ss7 =  contact.getText();

        if(ss7.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet");
            return;
        }
        if(ss7.length()!=10)
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Cell phone number must be 10 digits");
            return;
        }
        char[] chars5 = ss7.toCharArray();
        for(char c : chars5)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet");
                return;
            }
        }
        long s7 = Long.parseLong(ss7);

        String s8 = location.getText();
        if(s8.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Location field cannot be empty");
            return;
        }

        String s9 = username.getText();
        if(s9.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Username field cannot be empty");
            return;
        }

        for (Doctor ep1:s.getDoctordirectory().getDoctor()){
            if (s9.equals(ep1.getUsername())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Username already exists, please try again");
            }

        }
        String s10 = password.getText();
        if(s10.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Password field cannot be empty");
            return;
        }

        for (Doctor ep1:s.getDoctordirectory().getDoctor()){
            if (s10.equals(ep1.getPassword())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Password already exists, please try again");
            }
        }

        if(flag == 1)
        {

            Doctor pp = s.getDoctordirectory().addNewDoctor();
            pp.setHospitalid(s1);
            pp.setHospitalname(s2);
            pp.setDoctorid(s3);
            pp.setDoctorname(s4);
            pp.setAge(s5);
            pp.setGender(s6);
            pp.setContact(s7);
            pp.setLocation(s8);
            pp.setUsername(s9);
            pp.setPassword(s10);

            JOptionPane.showMessageDialog(this,"Doctor Profile created successfully");
           
        }
        

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField age;
    public static javax.swing.JTextField contact;
    public static javax.swing.JTextField doctorid;
    public static javax.swing.JTextField doctorname;
    public static javax.swing.JComboBox<String> gender;
    public static javax.swing.JTextField hospitalid;
    public static javax.swing.JComboBox<String> hospitalname;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField location;
    public static javax.swing.JTextField password;
    public static javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
