/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BloodDonationManagement.BDAdmin;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Centre;
import model.Patient;
import model.Hospital;
import model.system;

/**
 *
 * @author arpid
 */
public class BDPatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form BDPatientPanel
     */
    system s;
    public BDPatientPanel(system s) {
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
        create = new javax.swing.JButton();
        update = new javax.swing.JButton();
        view = new javax.swing.JButton();
        delete = new javax.swing.JButton();
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

        jLabel1.setText("Hospital Name:");

        jLabel2.setText("Blood Center");

        jLabel3.setText("Patient Name");

        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Hospital ID:");

        jLabel6.setText("Blood Center ID");

        jLabel7.setText("Patient ID");

        jLabel4.setText("Emergency Cause");

        jLabel8.setText("Date");

        jLabel9.setText("Time");

        jLabel11.setText("Doctor Username:");

        jLabel10.setText("Doctor Name:");

        doctorusername.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        doctorname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hospitalname, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(bloodcentreid, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bloodcentrename, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hospitalid, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientid, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emergencycause, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(time)
                            .addComponent(date)
                            .addComponent(doctorusername, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doctorname, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(create)
                            .addComponent(update)
                            .addComponent(view)
                            .addComponent(delete))))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(create)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(view)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hospitalname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hospitalid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bloodcentrename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bloodcentreid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emergencycause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(doctorusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(doctorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

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
            JOptionPane.showMessageDialog(this,"Date field cannot be empty");
            return;
        }

        String s9 = time.getText();
        if(s9.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Time field cannot be empty");
            return;
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

            JOptionPane.showMessageDialog(this,"Patient Profile created successfully");

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
        doctorname.setSelectedItem("Select");
        doctorusername.setSelectedItem("Select");

    }//GEN-LAST:event_createActionPerformed

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
        for (Hospital epp:s.getHospitaldirectory().getHospital()){
            if (s2 == (epp.getHospitalId())){
                flag=0;
                JOptionPane.showMessageDialog(this,"ID already exists, please fill the details again");
            }
        }

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
        for (Centre epp:s.getCentredirectory().getCentre()){
            if (s2 == (epp.getCentreId())){
                flag=0;
                JOptionPane.showMessageDialog(this,"ID already exists, please fill the details again");
            }
        }

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
            JOptionPane.showMessageDialog(this,"Date field cannot be empty");
            return;
        }

        String s9 = time.getText();
        if(s9.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Time field cannot be empty");
            return;
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

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
         int row = tablepatient.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this,"Please select row to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tablepatient.getModel();
        Patient selectedep = (Patient)model.getValueAt(row, 0);
        s.getPatientdirectory().deletePatient(selectedep);
        JOptionPane.showMessageDialog(this,"Patient deleted");

        populateTable();
    }//GEN-LAST:event_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodcentreid;
    private javax.swing.JTextField bloodcentrename;
    private javax.swing.JButton create;
    private javax.swing.JTextField date;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> doctorname;
    private javax.swing.JComboBox<String> doctorusername;
    private javax.swing.JTextField emergencycause;
    private javax.swing.JTextField hospitalid;
    private javax.swing.JTextField hospitalname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
