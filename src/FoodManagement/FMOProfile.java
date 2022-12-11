/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FoodManagement;
import javax.swing.JOptionPane;
import model.Hotel;
import model.system;

/**
 *
 * @author arpid
 */
public class FMOProfile extends javax.swing.JPanel {

    /**
     * Creates new form FMOProfile
     */
    system s;
    public FMOProfile(system s) {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        emailid = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        hotelid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ownername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("Name:");

        jLabel2.setText("Location:");

        jLabel3.setText("Contact:");

        jLabel4.setText("Email ID:");

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Hotel ID:");

        hotelid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelidActionPerformed(evt);
            }
        });

        jLabel6.setText("Username:");

        jLabel7.setText("Password:");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel8.setText("Owner Name:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setText("Hotel Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(ownername, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(password)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(emailid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(contact, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(location, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(username))
                                        .addComponent(hotelid, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(3, 3, 3))
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(631, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hotelid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
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
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ownername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(735, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Hotel ep = null;
        for (Hotel epp:s.getHoteldirectory().getHotel()){
            if (username.getText().equals(epp.getUsername())){
                ep = epp;
            }
        }
        s.getHoteldirectory().deleteHotel(ep);
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

        String ss2 = hotelid.getText();

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
        for (Hotel epp:s.getHoteldirectory().getHotel()){
            if (s2 == (epp.getHotelId())){
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
        for (Hotel epp:s.getHoteldirectory().getHotel()){
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

        for (Hotel ep3:s.getHoteldirectory().getHotel()){
            if (s6.equals(ep3.getUsername())){
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
        for (Hotel ep1:s.getHoteldirectory().getHotel()){
            if (s7.equals(ep1.getPassword())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Password already exists, please try again");
            }
        }
        String s8 = ownername.getText();
        if(s8.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Owner Name field cannot be empty");
            return;
        }

        if(flag == 1)
        {
            Hotel hh = s.getHoteldirectory().addNewHotel();
            hh.setName(s1);
            hh.setHotelId(s2);
            hh.setContact(s4);
            hh.setLocation(s3);
            hh.setEmailid(s5);
            hh.setUsername(s6);
            hh.setPassword(s7);
            hh.setOwnername(s8);

            JOptionPane.showMessageDialog(this,"Hotel Profile updated successfully");

            
        }
        name.setText("");
        hotelid.setText("");
        contact.setText("");
        location.setText("");
        emailid.setText("");
        username.setText("");
        password.setText("");
        ownername.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void hotelidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hotelidActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField contact;
    public static javax.swing.JTextField emailid;
    public static javax.swing.JTextField hotelid;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField location;
    public static javax.swing.JTextField name;
    public static javax.swing.JTextField ownername;
    public static javax.swing.JTextField password;
    public static javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
