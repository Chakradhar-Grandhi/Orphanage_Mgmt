/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Adoption.AdoptionCheckRole;

import Business.Adopter.Adopter;
import Business.Adopter.AdopterDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Adoption.AdopterOrganization;
import Business.Organization.Adoption.AdoptionOrganization;
import Business.Organization.Adoption.BackgroundAndCriminalCheckOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdopterWorkRequest;
import Business.WorkQueue.AdoptionWorkRequest;
import Business.WorkQueue.BGCWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yashpawar
 */
public class AdoptionCheckProcessRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
    AdopterDirectory udirectory;
    AdoptionOrganization adoptionOrganization;
    Adopter adopter;
    AdoptionWorkRequest adoptionWorkRequest;
    
    AdoptionCheckProcessRequestJPanel(JPanel userProcessContainer,UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdopterDirectory udirectory, AdoptionWorkRequest adoptionWorkRequest, Adopter adopter) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.udirectory=udirectory;
        this.account=account;
        this.enterprise=enterprise;
        this.business = business;
        this.adoptionOrganization = (AdoptionOrganization)organization;
        valueLabel.setText(enterprise.getName());
        orgLabel.setText(organization.getName());
        this.adopter = adopter;
         this.adoptionWorkRequest = adoptionWorkRequest;
        populateWorkRequest();
        setUserDetailsField();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInitialBGC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workTable = new javax.swing.JTable();
        txtAge = new javax.swing.JTextField();
        txtSsn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIncome = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        orgLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        btnInitialBGC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInitialBGC.setText("Initiate BGC");
        btnInitialBGC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitialBGCActionPerformed(evt);
            }
        });

        workTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAge.setEnabled(false);

        txtSsn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSsn.setEnabled(false);
        txtSsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSsnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("User Details:");

        txtIncome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIncome.setEnabled(false);
        txtIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIncomeActionPerformed(evt);
            }
        });

        txtGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGender.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Age:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Name:");

        txtEmailId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmailId.setEnabled(false);
        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Income:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Gender:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Email Id:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("SSN Number:");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setEnabled(false);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueLabel.setText("<value>");

        orgLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        orgLabel.setText("<value>");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Organization:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtIncome)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSsn)
                                    .addComponent(txtAge)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(327, 327, 327)
                        .addComponent(btnInitialBGC)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(orgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInitialBGC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(134, 134, 134))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInitialBGCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitialBGCActionPerformed
        int selectedRow = workTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a workrequest");
            return;
        }
        Object receiverval =  workTable.getValueAt(selectedRow, 2);
        Object statusval =  workTable.getValueAt(selectedRow, 4);
        AdoptionWorkRequest request = (AdoptionWorkRequest)workTable.getValueAt(selectedRow,0);
        if(receiverval.equals(account.getUsername()) && statusval.equals("Pending with Adoption Organization")){
        request.setStatus("Initialized BGC");
        request.setSender(account);
        request.setUserId(adopter.getUserId());
        populateWorkRequest();
        
        BGCWorkRequest bgcreq = new BGCWorkRequest();
        bgcreq.setMessage("Please initiate BGC");
        bgcreq.setStatus("Pending with BGC organization");
        bgcreq.setSender(account);
        bgcreq.setUserId(adopter.getUserId());

        Organization org = null;
        for (Network network : business.getNetworkList()){
            for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization organization: ent.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof BackgroundAndCriminalCheckOrganization){

                        org = organization;
                        break;
                    } 
                }
            }
        }
        
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(bgcreq);
            account.getWorkQueue().getWorkRequestList().add(bgcreq);
            business.getWorkQueue().getWorkRequestList().add(bgcreq);
        }
        
        
        AdopterWorkRequest wrk = new AdopterWorkRequest();
        wrk.setUserId(adopter.getUserId());
        wrk.setBgcStatus("Pending");
        wrk.setFinanceStatus("Pending");
        wrk.setMessage("BGC initialized");
        
         Organization org1 = null;
        for (Network network : business.getNetworkList()){
            for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization organization: ent.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof AdopterOrganization){

                        org1 = organization;
                        break;
                    } 
                }
            }
        }
        
        if (org1!=null){
            org1.getWorkQueue().getWorkRequestList().add(wrk);
            account.getWorkQueue().getWorkRequestList().add(wrk);
            business.getWorkQueue().getWorkRequestList().add(wrk);
        }
        
        
        
        JOptionPane.showMessageDialog(null,"BGC check initialized successfully!");
    }
        else if(!receiverval.equals(account.getUsername()))
            JOptionPane.showMessageDialog(null,"Please select the work request assigned to you to proceed");
        else if(!statusval.equals("Pending with Adoption Organization"))
            JOptionPane.showMessageDialog(null,"The selected workrequest assigned to you is already processed");
        
    }//GEN-LAST:event_btnInitialBGCActionPerformed
    public void setUserDetailsField(){
        txtAge.setText(String.valueOf(adopter.getAge()));
        txtEmailId.setText(adopter.getEmailId());
        txtGender.setText(adopter.getGender());
        txtIncome.setText(String.valueOf(adopter.getAnnualIncome()));
        txtName.setText(adopter.getName());
        txtSsn.setText(adopter.getSsn());
    }
    public void populateWorkRequest(){
      
        DefaultTableModel dtm = (DefaultTableModel)workTable.getModel();
            dtm.setRowCount(0);
         
        for (WorkRequest request : adoptionOrganization.getWorkQueue().getWorkRequestList()){
         
            if(request instanceof AdoptionWorkRequest  ){
                if(request.getUserId() == adoptionWorkRequest.getUserId()){
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
    }
    private void txtIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIncomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIncomeActionPerformed

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void txtSsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSsnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInitialBGC;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orgLabel;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workTable;
    // End of variables declaration//GEN-END:variables
}
