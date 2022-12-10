/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HospitalManagement.HospitalAdmin;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BloodBank;
import model.Hospital;
import model.system;

/**
 *
 * @author arpid
 */
public class HMHABloodBank extends javax.swing.JPanel {

    /**
     * Creates new form HMHABloodBank
     */
    system s;
    public HMHABloodBank(system s) {
        initComponents();
        this.s = s;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tablebb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        hospitalname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bp = new javax.swing.JTextField();
        bn = new javax.swing.JTextField();
        abp = new javax.swing.JTextField();
        abn = new javax.swing.JTextField();
        op = new javax.swing.JTextField();
        on = new javax.swing.JTextField();
        an = new javax.swing.JTextField();
        ap = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        update = new javax.swing.JButton();
        view = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        tablebb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Location", "Date", "Time", "Contact", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablebb);

        jLabel1.setText("Hospital Name:");

        jLabel2.setText("Location:");

        jLabel3.setText("Date:");

        jLabel4.setText("Time:");

        jLabel5.setText("Contact:");

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        jLabel6.setText("A+");

        jLabel7.setText("A-");

        jLabel8.setText("B+");

        jLabel9.setText("B-");

        jLabel10.setText("AB+");

        jLabel11.setText("AB-");

        jLabel12.setText("O-");

        jLabel13.setText("O+");

        create.setText("CREATE");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        view.setText("VIEW");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hospitalname, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(location)
                                    .addComponent(date)
                                    .addComponent(time)
                                    .addComponent(contact)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(create)
                                .addGap(37, 37, 37)
                                .addComponent(update)
                                .addGap(41, 41, 41)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(view)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(8, 8, 8)))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(delete)
                            .addComponent(ap, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(an)
                            .addComponent(bp)
                            .addComponent(bn)
                            .addComponent(abp)
                            .addComponent(abn)
                            .addComponent(op)
                            .addComponent(on))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(hospitalname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(an, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(bp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(bn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(abp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(abn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(op, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(on, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create)
                    .addComponent(delete)
                    .addComponent(view)
                    .addComponent(update))
                .addGap(281, 281, 281))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:
         int flag =1;
        String s1 = hospitalname.getText(); 
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
         String s2 = location.getText();
       
       if(s2.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Location cannot be empty");
            return;
        } 
        
        String s3 = date.getText();
       
       if(s3.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Location cannot be empty");
            return;
        }
       String s4 = time.getText();
       
       if(s4.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Location cannot be empty");
            return;
        }
       String ss5 =  contact.getText();
        
        if(ss5.equals(""))
        {
            flag=0;
           JOptionPane.showMessageDialog(this,"Contact number field cannot be empty or contain alphabet"); 
           return;
         }
        if(ss5.length()!=10)
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Contact number must be 10 digits");  
            return;
        }
        char[] chars5 = ss5.toCharArray();
        for(char c : chars5)
        {
            if(Character.isAlphabetic(c))
            {
               flag=0;
               JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet"); 
               return;   
            }
        }
         long s5 = Long.parseLong(ss5);
         for (BloodBank epp:s.getBloodbankdirectory().getBloodbank()){
            if (s5 == (epp.getContact())){
               flag=0;                
             JOptionPane.showMessageDialog(this,"Phone Number already exists, please fill the details again");
            }
        } 
        String s6 = ap.getText();
       
       if(s6.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
       
       String s7 = an.getText();
       
       if(s7.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
       
        String s8 = bp.getText();
       
       if(s8.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
        String s9 = bn.getText();
       
       if(s9.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
        String s10 = abp.getText();
       
       if(s10.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
        String s11 = abn.getText();
       
       if(s11.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
        String s12 = op.getText();
       
       if(s12.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
        String s13 = on.getText();
       
       if(s13.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
       
       if(flag == 1)
        {
        BloodBank hh = s.getBloodbankdirectory().addNewBloodBank();
        hh.setHospitalname(s1);
        hh.setLocation(s2);
        hh.setDate(s3);
        hh.setTime(s4);
        hh.setContact(s5);
        hh.setAp(s6);
        hh.setAn(s7);
        hh.setBp(s8);
        hh.setBn(s9);
        hh.setAbp(s10);
        hh.setAbn(s11);
        hh.setOp(s12);
        hh.setOn(s13);
        
        
         
        JOptionPane.showMessageDialog(this,"Blood Bank created successfully");        
        populateTable();   
        
        }
        hospitalname.setText("");
        date.setText("");
        contact.setText("");
        location.setText("");
        time.setText("");
        an.setText("");
        ap.setText("");
        bp.setText("");
        bn.setText("");
        abp.setText("");
        abn.setText("");
        op.setText("");
        on.setText("");
       
    }//GEN-LAST:event_createActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
         int row = tablebb.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablebb.getModel();
        BloodBank selectedep = (BloodBank)model.getValueAt(row, 0);
        
                hospitalname.setText(String.valueOf(selectedep.getHospitalname()));
                location.setText(String.valueOf(selectedep.getLocation()));
                date.setText(String.valueOf(selectedep.getDate()));
                time.setText(String.valueOf(selectedep.getTime()));
                contact.setText(String.valueOf(selectedep.getContact()));
                ap.setText(String.valueOf(selectedep.getAp()));
                an.setText(String.valueOf(selectedep.getAn()));
                bp.setText(String.valueOf(selectedep.getBp()));
                bn.setText(String.valueOf(selectedep.getBn()));
                abp.setText(String.valueOf(selectedep.getAbp()));
                abn.setText(String.valueOf(selectedep.getAbn()));
                op.setText(String.valueOf(selectedep.getOp()));
                on.setText(String.valueOf(selectedep.getOn()));
    }//GEN-LAST:event_viewActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         int row = tablebb.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this,"Please select row to delete");
            return;

        }

        DefaultTableModel model = (DefaultTableModel) tablebb.getModel();
        BloodBank selectedep = (BloodBank)model.getValueAt(row, 0);

        s.getBloodbankdirectory().deleteBloodBank(selectedep);
        JOptionPane.showMessageDialog(this,"Blood Bank Profile deleted");

        populateTable();
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        int row = tablebb.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablebb.getModel();
        BloodBank selectedep = (BloodBank)model.getValueAt(row, 0);
        s.getBloodbankdirectory().deleteBloodBank(selectedep);
        
         int flag =1;
        String s1 = hospitalname.getText(); 
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
         String s2 = location.getText();
       
       if(s2.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Location cannot be empty");
            return;
        } 
        
        String s3 = date.getText();
       
       if(s3.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Location cannot be empty");
            return;
        }
       String s4 = time.getText();
       
       if(s4.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Location cannot be empty");
            return;
        }
       String ss5 =  contact.getText();
        
        if(ss5.equals(""))
        {
            flag=0;
           JOptionPane.showMessageDialog(this,"Contact number field cannot be empty or contain alphabet"); 
           return;
         }
        if(ss5.length()!=10)
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Contact number must be 10 digits");  
            return;
        }
        char[] chars5 = ss5.toCharArray();
        for(char c : chars5)
        {
            if(Character.isAlphabetic(c))
            {
               flag=0;
               JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet"); 
               return;   
            }
        }
         long s5 = Long.parseLong(ss5);
         for (BloodBank epp:s.getBloodbankdirectory().getBloodbank()){
            if (s5 == (epp.getContact())){
               flag=0;                
             JOptionPane.showMessageDialog(this,"Phone Number already exists, please fill the details again");
            }
        } 
        String s6 = ap.getText();
       
       if(s6.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
       
       String s7 = an.getText();
       
       if(s7.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
       
        String s8 = bp.getText();
       
       if(s8.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
        String s9 = bn.getText();
       
       if(s9.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
        String s10 = abp.getText();
       
       if(s10.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
        String s11 = abn.getText();
       
       if(s11.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
        String s12 = op.getText();
       
       if(s12.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
        String s13 = on.getText();
       
       if(s13.equals("")){
           flag=0;
           JOptionPane.showMessageDialog(this,"Blood Group cannot be empty");
            return;
        } 
       
       if(flag == 1)
        {
        BloodBank hh = s.getBloodbankdirectory().addNewBloodBank();
        hh.setHospitalname(s1);
        hh.setLocation(s2);
        hh.setDate(s3);
        hh.setTime(s4);
        hh.setContact(s5);
        hh.setAp(s6);
        hh.setAn(s7);
        hh.setBp(s8);
        hh.setBn(s9);
        hh.setAbp(s10);
        hh.setAbn(s11);
        hh.setOp(s12);
        hh.setOn(s13);
        
        
         
        JOptionPane.showMessageDialog(this,"Blood Bank Updated successfully");
        
        populateTable();    
        }
        hospitalname.setText("");
        date.setText("");
        contact.setText("");
        location.setText("");
        time.setText("");
        an.setText("");
        ap.setText("");
        bp.setText("");
        bn.setText("");
        abp.setText("");
        abn.setText("");
        op.setText("");
        on.setText("");
        
    }//GEN-LAST:event_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abn;
    private javax.swing.JTextField abp;
    private javax.swing.JTextField an;
    private javax.swing.JTextField ap;
    private javax.swing.JTextField bn;
    private javax.swing.JTextField bp;
    private javax.swing.JTextField contact;
    private javax.swing.JButton create;
    private javax.swing.JTextField date;
    private javax.swing.JButton delete;
    private javax.swing.JTextField hospitalname;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField location;
    private javax.swing.JTextField on;
    private javax.swing.JTextField op;
    private javax.swing.JTable tablebb;
    private javax.swing.JTextField time;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
          DefaultTableModel model = (DefaultTableModel) tablebb.getModel();
          model.setRowCount(0);
        
        for (BloodBank ep:s.getBloodbankdirectory().getBloodbank()){
            
            Object[] row = new Object[13];
            row[0] = ep;
            row[1] = ep.getLocation();
            row[2] = ep.getDate();
            row[3] = ep.getTime();
            row[4] = ep.getContact();
            row[5] = ep.getAp();
            row[6] = ep.getAn();
            row[7] = ep.getBp();
            row[8] = ep.getBn();
            row[9] = ep.getAbp();
            row[10] = ep.getAbn();
            row[11] = ep.getOp();
            row[12] = ep.getOn();            
            
            
            
            
            model.addRow(row);
}     
 
}

}