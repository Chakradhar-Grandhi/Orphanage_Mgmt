/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Orphanage.ChildCare;

import Business.Child.Child;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Organization.Orphanage.ChildCareOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ChildCareWorkRequest;
import Business.WorkQueue.DoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author just_chakri
 */
public class ProcessChildCareWorkRequest extends javax.swing.JPanel {

    /**
     * Creates new form ProcessChildCareWorkRequest
     */
    
    JPanel userProcessContainer;
    ChildCareWorkRequest request;
    Child child;
    ChildDirectory directory;
    ChildCareOrganization childCareOrganization;
    UserAccount account;
    EcoSystem business;
    public ProcessChildCareWorkRequest(JPanel userProcessContainer, Organization organization, ChildCareWorkRequest request, ChildDirectory directory, Child child, UserAccount account, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.childCareOrganization = (ChildCareOrganization) organization;
        this.request= request;
        this.business=business;
//        this.directory = childCareOrganization.getChildDirectory();
        this.child = child;
        this.account=account;
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
        jTextField1 = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Remarks:");

        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(447, 447, 447))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter the remarks");
            return;
        }
        String remarks = jTextField1.getText();
        
        request.setMessage(remarks);
        request.setStatus("Acquired");
     child.setStatus("Acquired");
     child.setMedicalStatus(child.getMedicalStatus()+"\n"+"Medically Fit on date"+new Date());
     
     for(WorkRequest req: account.getWorkQueue().getWorkRequestList()){
          if(request.getSender().getRole().equals(Role.RoleType.Pharmacist.getValue())){
         if(req instanceof DoctorWorkRequest){
             if(req.getChildId()==child.getChildId()){
                 String result = ((DoctorWorkRequest)req).getTestResult();
                 if(((DoctorWorkRequest)req).getTestResult().equalsIgnoreCase("Under Examination")){
                    ((DoctorWorkRequest)req).setTestResult("test and medicine comepleted"); 
                 }
             }
         }
     }
     }
 
        
    }//GEN-LAST:event_submitBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ChildCareWorkAreaJPanel dwjp = (ChildCareWorkAreaJPanel) component;
        dwjp.populateChildTable();
        dwjp.populateWorkRequest();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
       
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
