/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BloodDonationManagement.BDAdmin;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.FAQ;
import model.system;

/**
 *
 * @author arpid
 */
public class BDFAQPanel extends javax.swing.JPanel {

    /**
     * Creates new form BDFAQPanel
     */
    system s;
    public BDFAQPanel(system s) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        view = new javax.swing.JButton();
        create = new javax.swing.JButton();
        question = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablefaq = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Question:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Answer:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, -1, -1));
        add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, 488, -1));

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, -1, -1));

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, -1, -1));

        view.setText("VIEW");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, -1, -1));

        create.setText("CREATE");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, -1, -1));
        add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 488, -1));

        tablefaq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Question", "Answer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablefaq);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 24, 680, 490));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonationManagement/a7.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -260, 1220, 1320));
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:
        int flag = 1;
        String s1 = question.getText();
        if(s1.equals(""))
        {
           flag=0;
           JOptionPane.showMessageDialog(this,"Question field cannot be empty");
           return;                     
        }
        
        String s2 = answer.getText();
        if(s2.equals(""))
        {
           flag=0;
           JOptionPane.showMessageDialog(this,"Answer field cannot be empty");
           return;                     
        }
        
        if(flag == 1)
        {
            FAQ hh = s.getFaqdirectory().addNewFAQ();
            hh.setQuestions(s1);
            hh.setAnswers(s2);                
            JOptionPane.showMessageDialog(this,"FAQ created successfully"); 
            populateTable();
        } 
        
        question.setText("");
        answer.setText("");
        
       
        
                     
        
    }//GEN-LAST:event_createActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        int row = tablefaq.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablefaq.getModel();
        FAQ selectedep = (FAQ)model.getValueAt(row, 0);
        
                question.setText(String.valueOf(selectedep.getQuestions()));
                answer.setText(String.valueOf(selectedep.getAnswers()));
    }//GEN-LAST:event_viewActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
        int row = tablefaq.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this,"Please select row to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tablefaq.getModel();
        FAQ selectedep = (FAQ)model.getValueAt(row, 0);
        s.getFaqdirectory().deleteFAQ(selectedep);
        JOptionPane.showMessageDialog(this,"FAQ deleted");

        populateTable();
        
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        int row = tablefaq.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tablefaq.getModel();
        FAQ selectedep = (FAQ)model.getValueAt(row, 0);
        s.getFaqdirectory().deleteFAQ(selectedep);
        int flag = 1;
        String s1 = question.getText();
        if(s1.equals(""))
        {
           flag=0;
           JOptionPane.showMessageDialog(this,"Question field cannot be empty");
           return;                     
        }
        
        String s2 = answer.getText();
        if(s2.equals(""))
        {
           flag=0;
           JOptionPane.showMessageDialog(this,"Answer field cannot be empty");
           return;                     
        }
        
        if(flag == 1)
        {
        FAQ hh = s.getFaqdirectory().addNewFAQ();
        hh.setQuestions(s1);
        hh.setAnswers(s2);                
        JOptionPane.showMessageDialog(this,"FAQ updated successfully");  
        populateTable();
        } 
        
        question.setText("");
        answer.setText("");
        
    }//GEN-LAST:event_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JButton create;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField question;
    private javax.swing.JTable tablefaq;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
    DefaultTableModel model = (DefaultTableModel) tablefaq.getModel();
    model.setRowCount(0);
//    tablefaq.setShowGrid(true);
//    tablefaq.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    for (FAQ ep:s.getFaqdirectory().getFAQ()){
            
            Object[] row = new Object[2];
            row[0] = ep;
            row[1] = ep.getAnswers();  
                
                      
            model.addRow(row);
}     
 
}
}
