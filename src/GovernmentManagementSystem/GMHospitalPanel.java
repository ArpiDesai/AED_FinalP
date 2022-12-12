/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GovernmentManagementSystem;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Hospital;
import model.system;

/**
 *
 * @author sindhuripallapothu
 */
public class GMHospitalPanel extends javax.swing.JPanel {

    /**
     * Creates new form GMHospitalPanel
     */
    system s;
    public GMHospitalPanel(system s) {
        initComponents();
        this. s= s;
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablehospital = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        emailid = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        hospitalid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablehospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Location", "Contact", "Email ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablehospital);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 35, -1, 154));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 227, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Location:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 295, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contact:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 329, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 363, -1, -1));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 224, 80, -1));
        jPanel1.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 292, 80, -1));
        jPanel1.add(emailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 360, 80, -1));
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 326, 80, -1));

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 231, -1, -1));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 266, -1, -1));

        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 301, -1, -1));

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 336, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hospital ID:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 261, -1, -1));

        hospitalid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalidActionPerformed(evt);
            }
        });
        jPanel1.add(hospitalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 258, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 397, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 431, -1, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 394, 80, -1));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 428, 83, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GovernmentManagementSystem/gov pages.jpg"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int flag =1;
        String s1 = name.getText();
        if(s1.equals(""))        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
            return;
        }
        char[] chars = s1.toCharArray();
        for(char c : chars)
        {
            if(Character.isDigit(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
                return;
            }
        }

        String ss2 = hospitalid.getText();

        if(ss2.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
            return;
        }
        char[] chars3 = ss2.toCharArray();
        for(char c : chars3)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
                return;
            }
        }
        int s2 = Integer.parseInt(ss2);
        for (Hospital epp:s.getHospitaldirectory().getHospital()){
            if (s2 == (epp.getHospitalId())){
                flag=0;
                JOptionPane.showMessageDialog(this,"ID already exists, please fill the details again");
            }
        }

        String s3 = location.getText();

        if(s3.equals("")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Location cannot be empty");
            return;
        }

        String ss4 =  contact.getText();

        if(ss4.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Contact number field cannot be empty or contain alphabet");
            return;
        }
        if(ss4.length()!=10)
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Contact number must be 10 digits");
            return;
        }
        char[] chars5 = ss4.toCharArray();
        for(char c : chars5)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet");
                return;
            }
        }

        long s4 = Long.parseLong(ss4);
        for (Hospital epp:s.getHospitaldirectory().getHospital()){
            if (s4 == (epp.getContact())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Phone Number already exists, please fill the details again");
            }
        }
        String s5 = emailid.getText();
        if(s5.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"EmailId field cannot be empty");
            return;
        }
        String s6 = username.getText();
        if(s6.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Username field cannot be empty");
            return;
        }

        for (Hospital ep:s.getHospitaldirectory().getHospital()){
            if (s6.equals(ep.getUsername())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Username already exists, please try again");
            }
        }

        String s7 = password.getText();
        if(s7.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Password field cannot be empty");
            return;
        }
        for (Hospital ep:s.getHospitaldirectory().getHospital()){
            if (s7.equals(ep.getPassword())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Password already exists, please try again");
            }
        }

        if(flag == 1)
        {
            Hospital hh = s.getHospitaldirectory().addNewH();
            hh.setName(s1);
            hh.setHospitalId(s2);
            hh.setContact(s4);
            hh.setLocation(s3);
            hh.setEmailid(s5);
            hh.setUsername(s6);
            hh.setPassword(s7);

            JOptionPane.showMessageDialog(this,"Hospital Profile created successfully");

            populateTable();
        }
        name.setText("");
        hospitalid.setText("");
        contact.setText("");
        location.setText("");
        emailid.setText("");
        username.setText("");
        password.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int row = tablehospital.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablehospital.getModel();
        Hospital selectedep = (Hospital)model.getValueAt(row, 0);
        s.getHospitaldirectory().deleteH(selectedep);

        int flag =1;
        String s1 = name.getText();
        if(s1.equals(""))        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
            return;
        }
        char[] chars = s1.toCharArray();
        for(char c : chars)
        {
            if(Character.isDigit(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
                return;
            }
        }

        String ss2 = hospitalid.getText();

        if(ss2.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
            return;
        }
        char[] chars3 = ss2.toCharArray();
        for(char c : chars3)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
                return;
            }
        }
        int s2 = Integer.parseInt(ss2);
        for (Hospital epp:s.getHospitaldirectory().getHospital()){
            if (s2 == (epp.getHospitalId())){
                flag=0;
                JOptionPane.showMessageDialog(this,"ID already exists, please fill the details again");
            }
        }

        String s3 = location.getText();

        if(s3.equals("")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Location cannot be empty");
            return;
        }

        String ss4 =  contact.getText();

        if(ss4.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Contact number field cannot be empty or contain alphabet");
            return;
        }
        if(ss4.length()!=10)
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Contact number must be 10 digits");
            return;
        }
        char[] chars5 = ss4.toCharArray();
        for(char c : chars5)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet");
                return;
            }
        }

        long s4 = Long.parseLong(ss4);
        for (Hospital epp:s.getHospitaldirectory().getHospital()){
            if (s4 == (epp.getContact())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Phone Number already exists, please fill the details again");
            }
        }
        String s5 = emailid.getText();
        if(s5.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"EmailId field cannot be empty");
            return;
        }
        String s6 = username.getText();
        if(s6.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Username field cannot be empty");
            return;
        }

        for (Hospital ep:s.getHospitaldirectory().getHospital()){
            if (s6.equals(ep.getUsername())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Username already exists, please try again");
            }
        }

        String s7 = password.getText();
        if(s7.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Password field cannot be empty");
            return;
        }
        for (Hospital ep:s.getHospitaldirectory().getHospital()){
            if (s7.equals(ep.getPassword())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Password already exists, please try again");
            }
        }

        if(flag == 1)
        {
            Hospital hh = s.getHospitaldirectory().addNewH();
            hh.setName(s1);
            hh.setHospitalId(s2);
            hh.setContact(s4);
            hh.setLocation(s3);
            hh.setEmailid(s5);
            hh.setUsername(s6);
            hh.setPassword(s7);

            JOptionPane.showMessageDialog(this,"Hospital Profile updated successfully");

            populateTable();
        }
        name.setText("");
        hospitalid.setText("");
        contact.setText("");
        location.setText("");
        emailid.setText("");
        username.setText("");
        password.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int row = tablehospital.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablehospital.getModel();
        Hospital selectedep = (Hospital)model.getValueAt(row, 0);

        name.setText(String.valueOf(selectedep.getName()));
        hospitalid.setText(String.valueOf(selectedep.getHospitalId()));
        emailid.setText(String.valueOf(selectedep.getEmailid()));
        location.setText(String.valueOf(selectedep.getLocation()));
        contact.setText(String.valueOf(selectedep.getContact()));
        username.setText(String.valueOf(selectedep.getUsername()));
        password.setText(String.valueOf(selectedep.getPassword()));

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int row = tablehospital.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this,"Please select row to delete");
            return;

        }

        DefaultTableModel model = (DefaultTableModel) tablehospital.getModel();
        Hospital selectedep = (Hospital)model.getValueAt(row, 0);

        s.getHospitaldirectory().deleteH(selectedep);
        JOptionPane.showMessageDialog(this,"Hospital Profile deleted");

        populateTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void hospitalidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalidActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contact;
    private javax.swing.JTextField emailid;
    private javax.swing.JTextField hospitalid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField location;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JTable tablehospital;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
          DefaultTableModel model = (DefaultTableModel) tablehospital.getModel();
          model.setRowCount(0);
        
        for (Hospital ep:s.getHospitaldirectory().getHospital()){
            
            Object[] row = new Object[4];
            row[0] = ep;
            row[1] = ep.getLocation();
            row[2] = ep.getContact();
            row[3] = ep.getEmailid();
            
            
            
            
            model.addRow(row);
}     
 
}
}
