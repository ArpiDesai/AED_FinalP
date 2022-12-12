/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HospitalManagement.Doctor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import model.system;

/**
 *
 * @author arpid
 */
public class HMHDEmergencies extends javax.swing.JPanel {

    /**
     * Creates new form HMHDEmergencies
     */
    system s;
    public HMHDEmergencies(system s) {
        initComponents();
        this.s = s;
         populateTable();
        populateDoctorUsername();
        populateDoctorName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablepatient = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hospitalid = new javax.swing.JTextField();
        bloodcentrename = new javax.swing.JTextField();
        bloodcentreid = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        view = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        hospitalname = new javax.swing.JTextField();
        patientid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emergencycause = new javax.swing.JTextField();
        patientname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        doctorusername = new javax.swing.JComboBox<>();
        doctorname = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablepatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Blood Center", "Hospital Name", "Date", "Time", "Emergency Cause"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablepatient);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 35, 681, 154));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Hospital Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 224, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Blood Center");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 292, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Patient Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 360, -1, -1));
        jPanel2.add(hospitalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 255, 80, -1));
        jPanel2.add(bloodcentrename, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 289, 80, -1));
        jPanel2.add(bloodcentreid, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 323, 80, -1));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 266, -1, -1));

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel2.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 301, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Hospital ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 258, -1, -1));
        jPanel2.add(hospitalname, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 221, 80, -1));
        jPanel2.add(patientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 391, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Blood Center ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 326, -1, -1));
        jPanel2.add(emergencycause, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 419, 80, -1));
        jPanel2.add(patientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 357, 80, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Patient ID");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 394, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Emergency Cause");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 422, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Date");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 456, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("Time");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 490, -1, -1));
        jPanel2.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 487, 80, -1));
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 453, 80, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Doctor Username");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 524, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Doctor Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 558, -1, -1));

        doctorusername.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(doctorusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 521, 80, -1));

        doctorname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(doctorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 555, 80, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HospitalManagement/Doctor/hospilogin.jpeg"))); // NOI18N
        jLabel12.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        int row = tablepatient.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablepatient.getModel();
        Patient selectedep = (Patient)model.getValueAt(row, 0);
        s.getPatientdirectory().deletePatient(selectedep);

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
        

        String s3 = bloodcentrename.getText();
        if(s1.equals(""))        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
            return;
        }
        char[] chars1 = s3.toCharArray();
        for(char c : chars1)
        {
            if(Character.isDigit(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
                return;
            }
        }

        String ss4 = bloodcentreid.getText();

        if(ss4.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
            return;
        }
        char[] chars4 = ss4.toCharArray();
        for(char c : chars4)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
                return;
            }
        }
        int s4 = Integer.parseInt(ss4);
        

        String s5 = patientname.getText();
        if(s5.equals(""))        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
            return;
        }
        char[] chars5 = s5.toCharArray();
        for(char c : chars5)
        {
            if(Character.isDigit(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
                return;
            }
        }

        String ss6 = patientid.getText();

        if(ss6.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
            return;
        }
        char[] chars6 = ss6.toCharArray();
        for(char c : chars6)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
                return;
            }
        }
        int s6 = Integer.parseInt(ss6);
        for ( Patient epp:s.getPatientdirectory().getPatient()){
            if (s6 == (epp.getPatientid())){
                flag=0;
                JOptionPane.showMessageDialog(this,"ID already exists, please fill the details again");
            }
        }

        String s7 = emergencycause.getText();
        if(s7.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Emergency Cause field cannot be empty");
            return;
        }

        String s8 = date.getText();
        if(s8.equals(""))
        {
           flag=0;
           JOptionPane.showMessageDialog(this,"Please enter date");
           return;                     
        }
         if (s8.length()<10){
             flag=0;
            JOptionPane.showMessageDialog(this,"Please enter correct date in format mm/dd/yyyy" );
            return;
        }
        
        StringBuffer sBuffer = new StringBuffer(s8);
        String mm;
        String dd;
        String yr;

        mm = sBuffer.substring(0,2);
        dd = sBuffer.substring(3,5);
        yr = sBuffer.substring(6,10);

        
        if(mm.matches("0[1-9]|1[0-2]") && dd.matches("0[1-9]|[12][0-9]|3[01]") && yr.matches("(19|20)\\d\\d"))
        {
          
        }
        else
        {
            flag=0;
         JOptionPane.showMessageDialog(this, "Please enter correct date in format mm/dd/yyyy");
         return;
        }

        String s9 = time.getText();
        String regex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";        
        Pattern p = Pattern.compile(regex); 
        if (s9 == "") {
            flag = 0;
            JOptionPane.showMessageDialog(this, "Please enter time");        }
 
        Matcher m = p.matcher(s9); 
        if (m.matches()){
            
        }
        else{
            flag = 0;
             JOptionPane.showMessageDialog(this, "Please enter time in 24 hr format");
        }

        String s10 = (String)doctorusername.getSelectedItem();
        if(s10.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Username field cannot be empty");
            return;
        }

        String s11 = (String)doctorname.getSelectedItem();
        if(s11.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Name field cannot be empty");
            return;
        }

        if(flag == 1)
        {
            Patient hh = s.getPatientdirectory().addNewPatient();
            hh.setHospitalname(s1);
            hh.setHospitalid(s2);
            hh.setBloodcentrename(s3);
            hh.setBloodcentreid(s4);
            hh.setPatientname(s5);
            hh.setPatientid(s6);
            hh.setEmergencycause(s7);
            hh.setDate(s8);
            hh.setTime(s9);
            hh.setDoctorusername(s10);
            hh.setDoctorname(s11);

            JOptionPane.showMessageDialog(this,"Patient Profile updated successfully");

            populateTable();
        }
        hospitalname.setText("");
        hospitalid.setText("");
        bloodcentrename.setText("");
        bloodcentreid.setText("");
        patientname.setText("");
        patientid.setText("");
        emergencycause.setText("");
        date.setText("");
        time.setText("");
        doctorusername.setSelectedItem("Select");
        doctorname.setSelectedItem("Select");
    }//GEN-LAST:event_updateActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        int row = tablepatient.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablepatient.getModel();
        Patient selectedep = (Patient)model.getValueAt(row, 0);

        hospitalname.setText(String.valueOf(selectedep.getHospitalname()));
        hospitalid.setText(String.valueOf(selectedep.getHospitalid()));
        patientname.setText(String.valueOf(selectedep.getPatientname()));
        patientid.setText(String.valueOf(selectedep.getPatientid()));
        bloodcentrename.setText(String.valueOf(selectedep.getBloodcentrename()));
        bloodcentreid.setText(String.valueOf(selectedep.getBloodcentreid()));
        emergencycause.setText(String.valueOf(selectedep.getEmergencycause()));
        date.setText(String.valueOf(selectedep.getDate()));
        time.setText(String.valueOf(selectedep.getTime()));
        doctorname.setSelectedItem(String.valueOf(selectedep.getDoctorname()));
        doctorusername.setSelectedItem(String.valueOf(selectedep.getDoctorusername()));
    }//GEN-LAST:event_viewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodcentreid;
    private javax.swing.JTextField bloodcentrename;
    private javax.swing.JTextField date;
    private javax.swing.JComboBox<String> doctorname;
    public static javax.swing.JComboBox<String> doctorusername;
    private javax.swing.JTextField emergencycause;
    private javax.swing.JTextField hospitalid;
    private javax.swing.JTextField hospitalname;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patientid;
    private javax.swing.JTextField patientname;
    private javax.swing.JTable tablepatient;
    private javax.swing.JTextField time;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
    DefaultTableModel model = (DefaultTableModel) tablepatient.getModel();
    model.setRowCount(0);
//    tablefaq.setShowGrid(true);
//    tablefaq.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    for (Patient ep:s.getPatientdirectory().getPatient()){
            
            Object[] row = new Object[6];
            row[0] = ep;
            row[1] = ep.getBloodcentrename();
            row[2] = ep.getHospitalname();
            row[3] = ep.getDate();
            row[4] = ep.getTime();
            row[5] = ep.getEmergencycause();
            
                
                      
            model.addRow(row);
}     
 
}

private void populateDoctorUsername(){
     String[] cc = s.getDoctordirectory().DoctorUserNameArray();
     DefaultComboBoxModel c = new DefaultComboBoxModel(cc);
     doctorusername.setModel(c);
}

private void populateDoctorName(){
     String[] cc = s.getDoctordirectory().DoctorNameArray();
     DefaultComboBoxModel c = new DefaultComboBoxModel(cc);
     doctorname.setModel(c);
}
}
