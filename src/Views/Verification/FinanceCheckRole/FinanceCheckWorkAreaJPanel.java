/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Verification.FinanceCheckRole;

import Views.Verification.FinanceCheckRole.FinanceCheckProcessRequestJPanel;
import Model.Adopter.Adopter;
import Model.Adopter.AdopterDirectory;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.Verification.FinanceCheckOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.FinanceAdoptionWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yashpawar
 */
public class FinanceCheckWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
    AdopterDirectory udirectory;
    FinanceCheckOrganization financeOrganization;
    Adopter adopter;
    
    public FinanceCheckWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdopterDirectory udirectory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.udirectory=udirectory;
        this.account=account;
        this.enterprise=enterprise;
        this.business = business;
        this.financeOrganization = (FinanceCheckOrganization)organization;
        valueLabel.setText(enterprise.getName());
        orgLabel.setText(organization.getName());
        //this.adopter = adopter;
        populateWorkRequest();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        workTable = new javax.swing.JTable();
        processBtn = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        assignBtn = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        orgLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Work Queue");

        workTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "UserId", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workTable);
        if (workTable.getColumnModel().getColumnCount() > 0) {
            workTable.getColumnModel().getColumn(0).setPreferredWidth(200);
            workTable.getColumnModel().getColumn(1).setResizable(false);
            workTable.getColumnModel().getColumn(3).setResizable(false);
            workTable.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        processBtn.setText("Process Request");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        assignBtn.setText("Assign to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueLabel.setText("<value>");

        orgLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        orgLabel.setText("<value>");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Organization:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(orgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(orgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(198, 198, 198))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        int selectedRow = workTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a workrequest");
            return;
        }
        WorkRequest req = (WorkRequest) workTable.getValueAt(selectedRow, 0);
        Object receiverval =  workTable.getValueAt(selectedRow, 2);
        Object statusval =  workTable.getValueAt(selectedRow, 4);
        for(Adopter a: udirectory.getAdoptersList()){
            if(a.getUserId()==req.getUserId()){
                adopter=a;
            }
        }
        if(receiverval==null){
            JOptionPane.showMessageDialog(null,"Please first assign it to yourself");
        }
        else{
        if( receiverval.equals(account.getUsername()) && statusval.equals("Finance organization processing")){
        FinanceCheckProcessRequestJPanel fcprj = new FinanceCheckProcessRequestJPanel(userProcessContainer,account, financeOrganization, enterprise, business, udirectory,(FinanceAdoptionWorkRequest) req, adopter);
        this.userProcessContainer.add("FinanceCheckProcessRequestJPanel", fcprj);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);}
        else if(statusval.equals("Approved")|| statusval.equals("Denied"))
            JOptionPane.showMessageDialog(null,"The selected workrerequest is already processed");
        else if(!receiverval.equals(account.getUsername()))
            JOptionPane.showMessageDialog(null,"Please select the work request assigned to you to proceed");
        } 
        
    }//GEN-LAST:event_processBtnActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
       int selectedRow = workTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a workrequest");
            return;
        }
        
        Object receiverval =  workTable.getValueAt(selectedRow, 2);
        Object statusval =  workTable.getValueAt(selectedRow, 4);
        
        if(statusval.equals("Pending with Finance organization")){
        WorkRequest re = (WorkRequest) workTable.getValueAt(selectedRow, 0);
        re.setReceiver(account);
        re.setStatus("Finance organization processing");
        populateWorkRequest();
        }
        else{
        if(statusval.equals("Approved")||statusval.equals("Denied"))
            JOptionPane.showMessageDialog(null,"Please select some other request,this work request is already processed");
        else if(!receiverval.equals(account.getUsername()))
            JOptionPane.showMessageDialog(null,"Work request is assigned to someone else");
        else if(receiverval.equals(account.getUsername()))
            JOptionPane.showMessageDialog(null,"Work request is already assigned to you");
        } 
    }//GEN-LAST:event_assignBtnActionPerformed
public void populateWorkRequest(){
      
        DefaultTableModel dtm = (DefaultTableModel)workTable.getModel();
            dtm.setRowCount(0);
        for (WorkRequest request : financeOrganization.getWorkQueue().getWorkRequestList()){
            if(request instanceof FinanceAdoptionWorkRequest){
           Object[] row = new Object[dtm.getColumnCount()];
           row[0]=request;
           row[1]=request.getSender().getEmployee().getName();
           row[2]=request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
           row[3] = request.getUserId();
           row[4] = request.getStatus();
            dtm.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orgLabel;
    private javax.swing.JButton processBtn;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workTable;
    // End of variables declaration//GEN-END:variables
}
